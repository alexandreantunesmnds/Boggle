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
        Menu fileMenu = new Menu("Partie");
        Menu editMenu = new Menu("Grille");
        menuBar.getMenus().addAll(fileMenu, editMenu);

        // Create MenuItems
        MenuItem saveParty = new MenuItem("Sauvegarder la partie");
        MenuItem openParty = new MenuItem("Reprendre la partie");
        MenuItem newParty = new MenuItem("Nouvelle partie");

        MenuItem grilleHuit = new MenuItem("8x8");
        MenuItem grilleSix = new MenuItem("6x6");
        MenuItem grilleQuatre = new MenuItem("4x4");

        // Add menuItems to the Menus
        fileMenu.getItems().addAll(saveParty, openParty, newParty);
        editMenu.getItems().addAll(grilleHuit, grilleSix, grilleQuatre);
        this.bog.ajouterObservateur(this);
    }

    public MenuBar getMenu (){
        return this.menuBar;
    }

    @Override
    public void reagir() {

    }
}
