package boggle.view;

import boggle.Observateur;
import boggle.model.Boggle;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;

public class VueLettres extends GridPane implements Observateur {

    private Boggle bog;
    private Button tabBouton[][];

    public VueLettres(Boggle bog) {
        super();
        this.bog = bog;
        int nbLettres = this.bog.getTaille();

        this.setAlignment(Pos.CENTER);
        this.tabBouton = new Button[nbLettres][nbLettres];

        for(int ligne = 0; ligne < nbLettres; ligne++){
            for(int colonne = 0; colonne < nbLettres; colonne++) {
                this.tabBouton[ligne][colonne] = new Button(String.valueOf(this.bog.getLettre(ligne,colonne)));
                this.tabBouton[ligne][colonne].setOnAction(new EcouteurLettre(this.bog,this.tabBouton[ligne][colonne],ligne, colonne));
                this.add(this.tabBouton[ligne][colonne],ligne,colonne);

                //Configuration de la taille et de la couleur des boutons
                //this.tabBouton[ligne][colonne].setMinSize(80,80);
                //this.tabBouton[ligne][colonne].setStyle("-fx-background-color: white; -fx-border-color: orange; -fx-border-width: 2");
                //this.tabBouton[ligne][colonne].setFont(new Font(20));
            }
        }

        //this.setStyle("-fx-background-color: blue");

        this.bog.ajouterObservateur(this);
    }

    @Override
    public void reagir() {

    }
}