import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.control.Button;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

/** Create a GUI with a couple buttons and respond to button clicks */
public class ButtonGUI extends Application {
  
  // two buttons for the GUI
  private Button button1;
  private Button button2;
  
  /**
   * Creates a window with two buttons
   * @param primaryStage the main window for the gUI 
   */
  public void start(Stage primaryStage) {
    
    button1 = new Button("click me");
    button2 = new Button("don't click me");
    
    // register to receive buttom clicks for each button
    EventHandler<ActionEvent> handler = new HandleClick();
    button1.setOnAction(handler);
    button2.setOnAction(handler);
    
    // place the buttons in the layout and the layout on the window
    BorderPane layout = new BorderPane();
    layout.setTop(button1);
    layout.setBottom(button2);
    Scene scene = new Scene(layout);
    primaryStage.setScene(scene);
    primaryStage.show();
  }
  
  /**
   * Starts the GUI
   * @param args the command line arguments are currently ignored
   */
  public static void main(String[] args) {
    Application.launch(args);
  }
  
  // while the GUI is "alive" it responds to the button clicks
  private boolean amAlive = true;
  
  /** A nested class that implements the EventHandler for our button1 click */
  private class HandleClick implements EventHandler<ActionEvent> {
    
    /**
     * Respond to a button click with a fun message
     * @param e  information about the button click
     */
    public void handle(ActionEvent e) {
      if (!amAlive)
        return;
      
      Button b = (Button)e.getSource();            // which button was clicked?
      
      if (b == button1) {                          // print a cool message for one button
        System.out.println("I am alive!");
      }
      else if (b == button2) {                     // "kill" the GUI if the other button
        System.out.println("I am dead");
        amAlive = false;
      }
    }
  }
}


