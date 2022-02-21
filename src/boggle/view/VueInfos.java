package boggle.view;

import boggle.model.Boggle;
import boggle.Observateur;
import javafx.scene.layout.TilePane;

import java.awt.*;

public class VueInfos extends TilePane implements Observateur {
    private Label score, motChoisi ;
    private Boggle bog ;
    public VueInfos(Boggle bog) {
        this.bog = bog ;
        this.score = new Label(String.valueOf(this.bog.getScore()));
        this.motChoisi = new Label(this.bog.getMotChoisi());
        this.bog.ajouterObservateur(this) ;
    }

    @Override
    public void reagir() {

    }
}
