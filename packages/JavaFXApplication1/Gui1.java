package javafxapplication1;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import javafx.scene.text.Text;
import javafx.scene.layout.VBox;
import javafx.scene.control.RadioButton;
import javafx.scene.paint.Color;
import javafx.scene.control.ToggleGroup;

public class Gui1 extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        Text text = new Text(120,180,"Move Text");
        Pane Ptext = new Pane();
        Ptext.getChildren().add(text);
        
        HBox root = new HBox(20);
        Button btn1 = new Button("Left");
        Button btn2 = new Button("Right");
        root.getChildren().addAll(btn1,btn2);
        root.setAlignment(Pos.CENTER);
        
        VBox root1 = new VBox(20);
        RadioButton r1 = new RadioButton("Red");
        RadioButton r2 = new RadioButton("Blue");
        RadioButton r3 = new RadioButton("Green");
        root1.getChildren().addAll(r1,r2,r3);
        root1.setAlignment(Pos.CENTER_LEFT);
       
        ToggleGroup g = new ToggleGroup();
        r1.setToggleGroup(g);
        r2.setToggleGroup(g);
        r3.setToggleGroup(g);
        
        BorderPane pane = new BorderPane();
        pane.setCenter(Ptext);
        pane.setBottom(root);
        pane.setLeft(root1);
        
        btn1.setOnAction(e -> {
           text.setX(text.getX()-50);
        });
        btn2.setOnAction(e -> {
           text.setX(text.getX()+50);
        });
        
        r1.setOnAction(e -> {
            text.setFill(Color.RED);
        });
        r2.setOnAction(e -> {
            text.setFill(Color.BLUE);
        });
        r3.setOnAction(e -> {
            text.setFill(Color.GREEN);
        });
        Scene scene = new Scene(pane,400,400);
        primaryStage.setTitle("GUI");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
    
}
