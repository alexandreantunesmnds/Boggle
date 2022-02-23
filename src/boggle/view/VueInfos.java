package boggle.view;

import boggle.Observateur;
import boggle.model.Boggle;
import javafx.scene.control.Label;
import javafx.scene.layout.TilePane;

public class VueInfos extends TilePane implements Observateur {
    private Label score, motChoisi ;
    private Boggle bog ;
    public VueInfos(Boggle bog) {
        super();
        this.bog = bog ;
        this.motChoisi = new Label("Mot choisi : " + this.bog.getMotChoisi());
        this.score = new Label("Score : " + this.bog.getScore());
        this.bog.ajouterObservateur(this) ;
        this.getChildren().addAll(score,motChoisi);
        this.reagir();
    }

    @Override
    public void reagir() {
        this.motChoisi.setText("Mot choisi : "+ this.bog.getMotChoisi());
        this.score.setText("Score : " + this.bog.getScore());

    }
}
