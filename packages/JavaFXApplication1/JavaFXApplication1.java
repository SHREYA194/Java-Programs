package javafxapplication1;

import javafx.application.Application;
import javafx.stage.Stage;

public class JavaFXApplication1 extends javafx.application.Application {
/*public Test()
{
System.out.println("Test constructor is invoked.");
}*/
@Override // Override the start method in the Application
public void start(Stage primaryStage)
{
System.out.println("start method is invoked.");
}
public static void main (String[] args)
{
System.out.println("launch application.");
Application.launch(args);
}
}