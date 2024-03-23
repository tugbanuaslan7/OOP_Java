import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;


/** A Graphical User Interface using the JavaFX library */
public class MyGUI extends Application {
  
 
  /** 
   * The code to create the GUI display
   * @param primaryStage  the main window of the program
   */
  public void start(Stage primaryStage) {
    Button b = new Button("Click me");                // creating two buttons
    Button b2 = new Button("Click me, too");
    BorderPane layout = new BorderPane();             // place the buttons in a "layout manager"
    layout.setTop(b);
    layout.setBottom(b2);
    
    Scene scene = new Scene(layout);                  // make the layout manager the "scene" for 
    primaryStage.setScene(scene);                     //    this "stage"
    primaryStage.show();
  }
  
  /**
   * The main method to run the program
   * @param args  the command line arguments
   */
  public static void main(String[] args) {
    Application.launch(args);                         // runs the GUI, passing in the command line arguments
  }
  
}