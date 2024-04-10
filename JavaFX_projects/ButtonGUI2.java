import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.control.Button;
import javafx.event.EventHandler;
import javafx.event.ActionEvent;

/** An example of the "lambda" and "method reference" shortcuts for creating an anonymous class */
public class ButtonGUI2 extends Application {
  
  // a button
  private Button button2;
  
  /**
   * Create the GUI, we will use "lambda" and "method reference" shortcuts for anonymous classes for the event handlers
   * @param primaryStage the main window
   */
  public void start(Stage primaryStage) {
    Button button1 = new Button("alive");
    button2 = new Button("rotate");
    Button button3 = new Button("reset");
    Button button4 = new Button("alive2");
    
    BorderPane pane = new BorderPane();
    pane.setTop(button1);
    pane.setLeft(button2);
    pane.setBottom(button3);
    pane.setRight(button4);
    
    // here are twp examples of the "lambda" shortcut for an anonymous class"
    button1.setOnAction(e -> System.out.println("I am alive!"));
    button2.setOnAction(e -> { Button b = (Button)e.getSource();
                               b.setRotate(b.getRotate() + 15);
                             });
    
    // here are two examples of the "method reference" shortcut for an anonymous class,
    // one using a non-static method and one using a static method
    button3.setOnAction(this::reset);
    button4.setOnAction(ButtonGUI::message);
    
    Scene scene = new Scene(pane);
    primaryStage.setScene(scene);
    primaryStage.show();
  }
  
  /**
   * Prints a simple message.  This method has to have the same parameter signature and return type as the method
   * we are overriding in the anonymous class.  So we can use it for the method reference shortcut.
   * @param e information about a button click
   */
  public static void message(ActionEvent e) {
    System.out.println("I am still alive");
  }
  
  /**
   * Resets the rotation of a button.  This method has the same parameter signature and return type as the method we
   * are overriding in the anonymous class.  So we can use it for the method reference shortcut.
   * @param e information about a button click
   */
  public void reset(ActionEvent e) {
    button2.setRotate(0);
  }
  
  /**
   * The main method to run the GUI
   * @param args the command line arguments are ignored
   */
  public static void main(String[] args) {
    Application.launch(args);
  }
}
    