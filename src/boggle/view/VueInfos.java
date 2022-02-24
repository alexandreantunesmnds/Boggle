package boggle.view;

import boggle.Observateur;
import boggle.model.Boggle;
import javafx.scene.control.Label;
import javafx.scene.layout.TilePane;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;

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
        this.setStyle("-fx-background-color: white");
        // create a font
        Font font = Font.font("Verdana", FontWeight.EXTRA_BOLD, 25);
        this.score.setFont(font);
        this.motChoisi.setFont(font);
    }

    @Override
    public void reagir() {
        this.motChoisi.setText("Mot choisi : "+ this.bog.getMotChoisi());
        this.score.setText("Score : " + this.bog.getScore());

    }
}
