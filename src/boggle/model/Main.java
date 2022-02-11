package boggle.model;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import view.VueLettres;

public class Main extends Application{
    @Override
    public void start (Stage primaryStage) {
        Boggle bog = new Boggle(4) ;
        BorderPane root = new BorderPane() ;
        //root.setBottom(new VueInfos(bog))
        root.setCenter(new VueLettres(bog)) ;
        //root.setRight(new PanneauControle(bog)) ;
        primaryStage.setTitle("Boggle");
        primaryStage.setScene(new Scene(root, 1000, 700));
        primaryStage.show();
    }
    public static void main(String[] args) {
        launch(args);
    }
}
