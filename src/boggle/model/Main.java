package boggle.model;

import boggle.view.PanneauControle;
import boggle.view.VueInfos;
import boggle.view.VueLettres;
import boggle.view.VueMots;
import boggle.view.menu.VueMenu;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class Main extends Application{
    @Override
    public void start (Stage primaryStage) {
        Boggle bog = new Boggle(4) ;
        VueMenu menu = new VueMenu(bog);
        bog.setDernierMot();
        BorderPane root = new BorderPane() ;
        root.setTop(menu.getMenu());
        root.setBottom(new VueInfos(bog));
        root.setCenter(new VueLettres(bog));
        root.setRight(new PanneauControle(bog));
        root.setLeft(new VueMots(bog));
        primaryStage.setTitle("Boggle");
        primaryStage.setScene(new Scene(root, 900, 700));
        primaryStage.show();
    }
    public static void main(String[] args) {
        launch(args);
    }
}
