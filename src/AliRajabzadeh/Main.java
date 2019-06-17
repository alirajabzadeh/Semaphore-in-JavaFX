package AliRajabzadeh;

import javafx.application.Application;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.effect.DropShadow;
import javafx.scene.layout.Pane;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class Main extends Application {

    // size of frame
    private static double prefWidth = 1920;
    private static double prefHeight = 1080;

    // root
    private static Pane root = new Pane();
    private static Parent createContent(){
        root.setPrefSize(prefWidth, prefHeight);
        root.setStyle("-fx-background-color: #1E1E20");
        return root;
    }

    private static void createBackgroundRect(Rectangle rectangle){
        rectangle.setFill(Color.rgb(42,40,43, 0.25));
        rectangle.setArcHeight(30);
        rectangle.setArcWidth(30);
        rectangle.setStroke(Color.rgb(217,203,158,0.25));
        rectangle.setStrokeWidth(3.5);
        root.getChildren().add(rectangle);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        Scene scene = new Scene(createContent());

        Rectangle rectangle = new Rectangle(prefWidth / 2 - 50, prefHeight / 2 - 150,100,300);
        createBackgroundRect(rectangle);

        Rectangle rectangle1 = new Rectangle(50,150,380,730);
        createBackgroundRect(rectangle1);

        Rectangle rectangle2 = new Rectangle(prefWidth / 2 + 650,prefHeight / 2 - 50 ,100,100);
        createBackgroundRect(rectangle2);

        Button btn = new Button("start with me");
        btn.setTranslateX(50);
        btn.setTranslateY(80);
        btn.setStyle("-fx-background-color: #374140");
        btn.setTextFill(Color.rgb(217,203,158, 0.75));
        root.getChildren().add(btn);


        boolean[] flag = {true, true, true, true};

        List<Circle> circles = new ArrayList<Circle>();
        for (int i = 100; i < 450; i += 70) {
            for (int j = 200; j < 900; j += 70) {
                Circle circle = new Circle(i,j,30);
                circles.add(circle);
            }
        }
        int index = 0;
        for (Circle c: circles) {
            if (index % 2 == 0){
                c.setFill(Color.rgb(220,53,34));
                c.setEffect(new DropShadow(3,Color.BLACK));
            }
            else{
                c.setFill(Color.rgb(217,203,158));
                c.setEffect(new DropShadow(3, Color.BLACK));
            }

            root.getChildren().add(c);
            index++;
        }





        primaryStage.setTitle("project of Operating System course");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
