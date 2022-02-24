package boggle.view;

import boggle.Observateur;
import boggle.model.Boggle;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;

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
        Font font = Font.font("Verdana", FontWeight.EXTRA_BOLD, 15);
        this.quitter.setOnAction(new EcouteurQuitter(this.bog));
        this.valider.setOnAction(new EcouteurValider(this.bog));
        this.effacer.setOnAction(new EcouteurEffacer(this.bog));
        this.valider.setStyle("-fx-background-color: white; -fx-border-color: orange; -fx-border-width: 1");
        this.effacer.setStyle("-fx-background-color: white; -fx-border-color: orange; -fx-border-width: 1");
        this.quitter.setStyle("-fx-background-color: white; -fx-border-color: orange; -fx-border-width: 1");
        this.valider.setFont(font);
        this.effacer.setFont(font);
        this.quitter.setFont(font);
        this.bog.ajouterObservateur(this) ;
        this.getChildren().addAll(this.valider, this.effacer, this.quitter) ;
    }

    @Override
    public void reagir() {
    }
}
