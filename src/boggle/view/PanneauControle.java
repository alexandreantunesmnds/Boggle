package boggle.view;

import boggle.Observateur;
import boggle.model.Boggle;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;

public class PanneauControle extends VBox implements Observateur {
    private Button valider ;
    private Button effacer ;
    private Button quitter ;
    private Boggle bog ;
    public PanneauControle(Boggle bog) {
        super();
        this.bog = bog ;
        this.valider = new Button("Valider");
        this.effacer = new Button("Effacer");
        this.quitter = new Button("Quitter");
        this.quitter.setOnAction(new EcouteurQuitter(this.bog));
        this.valider.setOnAction(new EcouteurValider(this.bog));
        this.bog.ajouterObservateur(this) ;
        this.getChildren().addAll(this.valider, this.effacer, this.quitter) ;
    }

    @Override
    public void reagir() {

    }
}
