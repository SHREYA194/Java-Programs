package javafxapplication1;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.geometry.Pos;
import javafx.scene.shape.Circle;
import javafx.scene.paint.Color;

public class CircleRedBlue extends Application{
    @Override 
    public void start(Stage primaryStage) {
        GridPane pane=new GridPane();
        pane.setAlignment(Pos.CENTER);
        Circle circle=new Circle(50,50,50);
        //circle.setFill(Color.BLUE);
        circle.setStroke(Color.BLACK);
        pane.getChildren().add(circle);
        Scene scene=new Scene(pane,500,500);
        scene.setOnMousePressed(e -> {
            circle.setFill(Color.RED);
        });
        scene.setOnMouseReleased(e -> {
            circle.setFill(Color.BLUE);
        });
        primaryStage.setTitle("Mouse click and release");
        primaryStage.setScene(scene);
        primaryStage.show();
        primaryStage.requestFocus();
    }
    public static void main(String[] args) {
        launch(args);
    }
}