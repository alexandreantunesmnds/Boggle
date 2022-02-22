package boggle.view;

import boggle.model.Boggle;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;

public class EcouteurLettre implements EventHandler <ActionEvent> {
    private Boggle bog;
    private int lig;
    private int col;
    private Button button;
    public EcouteurLettre(Boggle bog, Button button, int lig, int col){
        this.bog = bog;
        this.lig = lig;
        this.col = col;
        this.button = button;

    }
    @Override
    public void handle(ActionEvent e) {
        //System.out.println("Lettre choisie : " + this.button.getText());
        this.bog.ajouterLettre(this.lig,this.col);
    }
}
