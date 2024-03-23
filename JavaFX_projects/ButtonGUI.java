import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.event.EventHandler;
import javafx.event.ActionEvent;

/** A GUI with 3 buttons and 2 labels used to demonstrate nested classes*/
public class ButtonGUI extends Application {
  
  // the buttons
  private Button button1;
  private Button button2;
  private Button button3;

  // the labels
  private Label label1;
  private Label label2;
  
  // count must be a field because it is used in an anonymous class
  private int button1ClickCount = 0;                    
  private int button2ClickCount = 0;       
               
  // static field. Static nested classes will have access to it.
  private static int totalClickCount = 0;
  /**
   * Create the GUI with 4 buttons
   * @param primaryStage the main window
   */
  public void start(Stage primaryStage) {
    
    button1 = new Button("button1");
    button2 = new Button("button2");
    button3 = new Button("button3");
    
    button1.setId("button1");
    button2.setId("button2");
    button3.setId("button3");
    label1 = new Label("Count field value: ");
    label2 = new Label("Count field value: ");
    
    
    BorderPane pane = new BorderPane();
    pane.setTop(button1);
    pane.setBottom(button2);
    pane.setCenter(button3);
    pane.setRight(label1);
    pane.setLeft(label2);
    pane.setPrefSize(400, 400);
    
	 //COMPLETE HERE TO SET AN EVENT FOR BUTTONS
    
    TextUpdateEvent tue = new TextUpdateEvent();
    button1.setOnAction(tue);
    button2.setOnAction(tue);
    button3.setOnAction(new StaticUpdateEvent());
	
	 
    Scene scene = new Scene(pane);
    primaryStage.setScene(scene);
    primaryStage.show();
  }
  
  /**
   * The main method launches the GUI
   * @param args the command line arguments are currently ignored
you    */
  public static void main(String[] args) {
    Application.launch(args);
  }
  
  /** A static nested class that responds to a button click by updating clicked button text with static field totalClickedCount
    * The static nested class only has access to static elements
    */
  public static class StaticUpdateEvent implements EventHandler<ActionEvent> {
    
    /** Respond to the button click 
      * @param e information about the button click
      */
    public void handle(ActionEvent e) {
     // COMPLETE HERE

     Button b = (Button)e.getSource();
     b.setText("totalClickCount " + totalClickCount);
    
	  
	 
    }
  }
  
  
  /** A non-static nested class that responds to a button click by updating labels.
    * The non-static nested class has access to all elements of the class.
    */
  public class TextUpdateEvent implements EventHandler<ActionEvent> {
    
    /** Respond to the button click 
      * @param e information about the button click
      */
    public void handle(ActionEvent e) {
      // COMPELETE HERE
      Button b = (Button)e.getSource(); //  get the clicked button
      int instanceClickCount = 0;

      if(b == button1){
        instanceClickCount = ++button1ClickCount;
      }
      else if(b == button2){
        instanceClickCount = ++button2ClickCount;
      }

      totalClickCount = button1ClickCount + button2ClickCount;

      label1.setText("total click counts " + button1ClickCount);
      label2.setText(b.getId() + " was clicked " + instanceClickCount + " times");
	  
    }
  }
}
