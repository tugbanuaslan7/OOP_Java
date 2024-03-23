import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

/** A window with one button
 * @author <em>Your name goes here</em>
 * @author <em>Your partner's name goes here</em>
 */
public class ButtonLabGUI extends Application {
  /** A clickable button */
  private Button button;
  
  private int clickCount = 0;

  /** 
   * Overrides the start method of Application to create the GUI with one button in the center of the main window.
   * @param primaryStage the JavaFX main window
   */
  public void start(Stage primaryStage) {
    
    button = new Button("Click count: " + clickCount);
    button.setOnAction(new ButtonAction());

    BorderPane pane = new BorderPane();      // create a 5 region layout for the window
    pane.setCenter(button);                  // add the button to the middle

    Scene scene = new Scene(pane);           // Create a "scene" that contains this border area

    primaryStage.setTitle("Button Lab GUI");
    primaryStage.setScene(scene);            // Add the "scene" to the main window
    primaryStage.show();                     // Display the window
  }
    
  private class ButtonAction implements EventHandler<ActionEvent>{

    @Override
    public void handle(ActionEvent e) {
      

      Button b = (Button)e.getSource();
      b.setText("Click count: " + (++clickCount));
      
      // set the screen size
      Stage s = (Stage)b.getScene().getWindow();
      s.sizeToScene();
      
    }
    
  }
  /**
   * The method to launch the program.
   * @param args  The command line arguments.  The arguments are passed on to the JavaFX application.
   */
   public static void main(String[] args) {
     Application.launch(args);
   }
  
}
