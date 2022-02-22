package boggle.view;

import boggle.model.Boggle;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class EcouteurValider implements EventHandler<ActionEvent> {
    private Boggle bog;
    public EcouteurValider(Boggle bog){
        this.bog = bog;

    }
    @Override
    public void handle(ActionEvent e) {
        this.bog.valider();

    }
}
