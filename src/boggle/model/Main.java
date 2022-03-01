package boggle.model;

import boggle.view.PanneauControle;
import boggle.view.VueInfos;
import boggle.view.VueLettres;
import boggle.view.VueMots;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class Main extends Application{
    @Override
    public void start (Stage primaryStage) {
        // Create MenuBar
        MenuBar menuBar = new MenuBar();

        // Create menus
        Menu fileMenu = new Menu("File");
        Menu editMenu = new Menu("Edit");
        Menu helpMenu = new Menu("Help");

        // Create MenuItems
        MenuItem newItem = new MenuItem("New");
        MenuItem openFileItem = new MenuItem("Open File");
        MenuItem exitItem = new MenuItem("Exit");

        MenuItem copyItem = new MenuItem("Copy");
        MenuItem pasteItem = new MenuItem("Paste");

        // Add menuItems to the Menus
        fileMenu.getItems().addAll(newItem, openFileItem, exitItem);
        editMenu.getItems().addAll(copyItem, pasteItem);

        // Add Menus to the MenuBar
        menuBar.getMenus().addAll(fileMenu, editMenu, helpMenu);
        Boggle bog = new Boggle(4) ;
        bog.setDernierMot();
        BorderPane root = new BorderPane() ;
        root.setTop(menuBar);
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
