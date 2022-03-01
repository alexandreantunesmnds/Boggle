package boggle.view.menu;

import boggle.Observateur;
import boggle.model.Boggle;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.VBox;

public class VueMenu extends VBox implements Observateur {
    private Boggle bog ;
    private MenuBar menuBar;
    public VueMenu(Boggle bog){
        super();
        this.bog = bog;
        // Create MenuBar
        this.menuBar = new MenuBar();
        // Create menus
        Menu fileMenu = new Menu("File");
        Menu editMenu = new Menu("Edit");
        Menu helpMenu = new Menu("Help");
        menuBar.getMenus().addAll(fileMenu, editMenu, helpMenu);

        // Create MenuItems
        MenuItem newItem = new MenuItem("New");
        MenuItem openFileItem = new MenuItem("Open File");
        MenuItem exitItem = new MenuItem("Exit");

        MenuItem copyItem = new MenuItem("Copy");
        MenuItem pasteItem = new MenuItem("Paste");

        // Add menuItems to the Menus
        fileMenu.getItems().addAll(newItem, openFileItem, exitItem);
        editMenu.getItems().addAll(copyItem, pasteItem);
        this.bog.ajouterObservateur(this);
    }

    public MenuBar getMenu (){
        return this.menuBar;
    }

    @Override
    public void reagir() {

    }
}
