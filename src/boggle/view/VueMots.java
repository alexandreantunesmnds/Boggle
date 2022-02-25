package boggle.view;

import boggle.Observateur;
import boggle.model.Boggle;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;

import java.util.ArrayList;

public class VueMots extends VBox implements Observateur {
    private Boggle bog ;
    private Label titreMots ;
    private Label tabMots[];
    private ArrayList<String> mots = new ArrayList<>(10);
    public VueMots(Boggle bog){
        super();
        this.bog = bog;
        this.titreMots = new Label("Mots choisis");
        int nbMots = this.bog.getNbMots();
        this.tabMots = new Label[nbMots];
        this.mots.addAll(this.bog.getMots());
        this.getChildren().addAll(titreMots);
        for (int i = 0; i < nbMots; i++) {
            this.tabMots[i] = new Label(this.mots.get(i));
            this.getChildren().addAll(tabMots[i]);
        }
        this.bog.ajouterObservateur(this);
    }
    @Override
    public void reagir() {

    }
}
