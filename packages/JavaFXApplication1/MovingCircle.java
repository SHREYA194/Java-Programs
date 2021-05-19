package javafxapplication1;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.scene.shape.Circle;

public class MovingCircle extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        Pane pane = new Pane();
        Circle circle = new Circle(50,50,50);
        //circle.setFill(Color.BLUE);
        circle.setStroke(Color.BLACK);
        pane.getChildren().add(circle);
        Scene scene=new Scene(pane,400,400);
        scene.setOnKeyPressed(e -> {
            switch(e.getCode()) {
                case UP : circle.setCenterY(circle.getCenterY()>circle.getRadius()?circle.getCenterY()-50:circle.getCenterY());
                    //circle.setCenterY(circle.getCenterY()-20);
                    break;
                case DOWN : circle.setCenterY(circle.getCenterY()<scene.getHeight()?circle.getCenterY()+50:circle.getCenterY());
                    //circle.setCenterY(circle.getCenterY()+20);
                    break;
                case LEFT : circle.setCenterX(circle.getCenterX()>circle.getRadius()?circle.getCenterX()-50:circle.getCenterX());
                    //circle.setCenterX(circle.getCenterX()-20);
                    break;
                case RIGHT : circle.setCenterX(circle.getCenterX()<scene.getWidth()?circle.getCenterX()+50:circle.getCenterY());
                    //circle.setCenterX(circle.getCenterX()+20);
                    break;  
            }
        });
       
        primaryStage.setTitle("Moving Circle By Key");
        primaryStage.setScene(scene);
        primaryStage.show();
        pane.requestFocus();
    }         
    public static void main(String[] args) {
        launch(args);
    }
}


