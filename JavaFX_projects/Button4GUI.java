import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.control.Button;
import javafx.event.EventHandler;
import javafx.event.ActionEvent;

/** A GUI with 4 buttons used to demonstrate nested classes and anonymous classes */
public class Button4GUI extends Application {
  
  // the buttons
  private Button button1;
  private Button button2;
  private Button button3;
  private Button button4;
  private int count = 0;                    // count must be a field because it is used in an anonymous class
  
  /**
   * Create the GUI with 4 buttons
   * @param primaryStage the main window
   */
  public void start(Stage primaryStage) {
    
    button1 = new Button("rotate");
    button2 = new Button("spin");
    button3 = new Button("reset");
    button4 = new Button("alive");
    
    BorderPane pane = new BorderPane();
    pane.setTop(button1);
    pane.setRight(button2);
    pane.setBottom(button3);
    pane.setLeft(button4);
    
    // button1 and button2 use nested classes for their event handlers 
    button1.setOnAction(new RotateEvent());
    button2.setOnAction(new SpinEvent());
    
    // button 3 uses an anonymous class
    button3.setOnAction(new EventHandler<ActionEvent>() {
      public void handle(ActionEvent e) {
        button1.setRotate(0);
        button2.setRotate(0);
        button3.setRotate(0);
        button4.setRotate(0);
      }
    });
    
   
    // button 4 uses an anonymous class.  The anonymous class has access to the local variables,
    // but any local variable it accesses must be final (since local variables are store in the stack
    // while the instance of the anonymous class is stored in the heap
    button4.setOnAction(new EventHandler<ActionEvent>() {
      public void handle(ActionEvent e) {
        button4.setText("click count: " + ++count);
      }
    });
    
    Scene scene = new Scene(pane);
    primaryStage.setScene(scene);
    primaryStage.show();
  }
  
  /**
   * The main method launches the GUI
   * @param args the command line arguments are currently ignored
   */
  public static void main(String[] args) {
    Application.launch(args);
  }
  
  /** A static nested class that responds to a button click by rotating the button that was clicked.
    * The static nested class only has access to static elements of the class.
    */
  public static class RotateEvent implements EventHandler<ActionEvent> {
    
    /** Respond to the button click by rotating the button that was clicked
      * @param e information about the button click
      */
    public void handle(ActionEvent e) {
      Button b = (Button)e.getSource();
      b.setRotate(b.getRotate() + 45);
    }
  }
  
  /** A non-static nested class that responds to a button click by rotating all the buttons.
    * The non-static nested class has access to all elements of the class.
    */
  public class SpinEvent implements EventHandler<ActionEvent> {
    
    /** Respond to the button click by rotating all the buttons
      * @param e information about the button click
      */
    public void handle(ActionEvent e) {
      button1.setRotate(button1.getRotate() + 15);
      button2.setRotate(button2.getRotate() + 15);
      button3.setRotate(button3.getRotate() + 15);
      button4.setRotate(button4.getRotate() + 15);
    }
  }
}
