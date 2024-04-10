
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
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.geometry.Pos;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;

// ADD SOME COLOR KISMI
public class Painter2 extends Application {
  // Borderpane
  private BorderPane borderPane;
  // Canvas
  private Canvas canvas;
  // ColorPicker
  ColorPicker colorPicker;
  // Slider
  private Slider slider;
  // TextField
  private TextField textField;
  // Default pen size
  private static final int DEFAULT_PEN_SIZE = 10;

  public void start(Stage primaryStage) {
    // Initializing private fields
    borderPane = new BorderPane();
    canvas = new Canvas(500, 500);

    colorPicker = new ColorPicker(Color.BLACK);

    slider = new Slider(1, 101, DEFAULT_PEN_SIZE); // Min: 1, Max: 101, Default: 10

    textField = new TextField(Integer.toString(DEFAULT_PEN_SIZE));

    slider.setOrientation(Orientation.VERTICAL); // set the orientation to vertical

    slider.setShowTickMarks(true);
    slider.setShowTickLabels(true);
    slider.setMajorTickUnit(10);
    slider.setBlockIncrement(1);

    textField.setPrefColumnCount(4);
    textField.setEditable(false);

    // Create an HBox to hold slider and textField
    HBox hboxPane = new HBox();
    hboxPane.setAlignment(Pos.CENTER);

    hboxPane.getChildren().add(textField);
    hboxPane.getChildren().add(slider);
    

    borderPane.setRight(hboxPane);


    // mouse haraket ettiğinde işlenecek olay
    canvas.setOnMouseDragged(e -> {
      double penSize = slider.getValue();
      GraphicsContext getc = canvas.getGraphicsContext2D();
      // COLOR PICKERDAN RENGI AL
      getc.setFill(colorPicker.getValue());
      getc.fillOval(e.getX() - (penSize / 2.0), e.getY() - (penSize / 2.0), penSize, penSize);
    });

    // mousea tıklandığında işlenecek olay
    canvas.setOnMousePressed(e -> {
      double penSize = slider.getValue();
      GraphicsContext gc = canvas.getGraphicsContext2D();
      gc.setFill(colorPicker.getValue());

      gc.fillOval(e.getX() - (penSize / 2.0), e.getY() - (penSize / 2.0), penSize, penSize);
    });

    // slider değiştiğinde texField'ın mevcut değeri gösterecek
    // The ChangeListener has only one method: changed that takes three parameters: an ObservableValue, the oldValue and the newValue.
    slider.valueProperty().addListener(new ChangeListener<Number>() {
      @Override
      public void changed(ObservableValue<? extends Number> observable, Number oldValue, Number newValue) {
        // Yeni değeri TextField'a ayarlayın
        textField.setText(String.valueOf(newValue.intValue()));
      }
    });
    

    borderPane.setCenter(canvas);
    // colorpicker'i borderpane'e ekle
    borderPane.setTop(colorPicker);

    Scene scene = new Scene(borderPane); // Create a "scene" that contains this border area

    primaryStage.setTitle("Lab");
    primaryStage.setScene(scene); // Add the "scene" to the main window
    primaryStage.show(); // Display the window
  }

  public static void main(String[] args) {
    Application.launch(args);
  }
}
