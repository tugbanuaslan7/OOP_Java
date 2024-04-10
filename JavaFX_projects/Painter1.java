import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.control.Button;
import javafx.event.EventHandler;
import javafx.event.ActionEvent; 
import javafx.scene.paint.*;
import javafx.scene.canvas.*;
import javafx.scene.input.MouseEvent;
import javafx.scene.input.MouseDragEvent;
import javafx.scene.shape.Circle;
import javafx.scene.control.ColorPicker;
import javafx.scene.control.Slider;
import javafx.geometry.Orientation;

// ADD SOME COLOR KISMI
public class Painter1 extends Application {
  //Borderpane
  private BorderPane borderPane;
  //Canvas
  private Canvas canvas;
  // ColorPicker
  ColorPicker colorPicker;

  public void start(Stage primaryStage) {
    //Initializing private fields
    borderPane = new BorderPane();
    canvas = new Canvas(500,500);
    
    
    colorPicker = new ColorPicker(Color.BLACK);
    
    canvas.setOnMouseDragged(e -> {
      GraphicsContext getc = canvas.getGraphicsContext2D();
      // COLOR PICKERDAN RENGI AL
      getc.setFill(colorPicker.getValue());
      getc.fillOval(e.getX(), e.getY(), 10, 10);
    });
                             
    
    borderPane.setCenter(canvas);
    // colorpicker'i borderpane'e ekle
    borderPane.setTop(colorPicker);
    Scene scene = new Scene(borderPane);           // Create a "scene" that contains this border area

    primaryStage.setTitle("Lab");
    primaryStage.setScene(scene);            // Add the "scene" to the main window
    primaryStage.show();                     // Display the window
  }
  
  public static void main(String[] args) {
     Application.launch(args);
  }
}