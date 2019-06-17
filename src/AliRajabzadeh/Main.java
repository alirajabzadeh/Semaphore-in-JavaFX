package AliRajabzadeh;

import javafx.application.Application;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

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

    @Override
    public void start(Stage primaryStage) throws Exception {
        Scene scene = new Scene(createContent());

        primaryStage.setTitle("project of Operating System course");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
