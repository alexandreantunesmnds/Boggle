package view;

import boggle.model.Boggle;
import boggle.model.Observateur;
import javafx.scene.layout.GridPane;

import java.awt.*;

public class VueLettres extends GridPane implements Observateur {
    private Button [] lettres ;
    private Boggle bog ;
    public VueLettres(Boggle bog){
        super();
        this.bog = bog ;
        this.bog.ajouterObservateur(this) ;
        this.lettres = new Button[5];
        for(int i = 0; i<lettres.length; i++){
            for (int l = 0; l<bog.getTaille();l++){
                for (int c = 0; c<bog.getTaille();c++){
                    this.bog.ajouterLettre(l,c);
                    this.lettres[i] = new Button(String.valueOf(this.bog.getLettre(l,c)));
                }
            }
        }
    }
    @Override
    public void reagir() {

    }
}
