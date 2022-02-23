package boggle.view;

import boggle.model.Boggle;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class EcouteurEffacer implements EventHandler<ActionEvent> {
    private Boggle bog;
    public EcouteurEffacer(Boggle bog){
        this.bog = bog;
    }
    @Override
    public void handle(ActionEvent actionEvent) {
        this.bog.effacer();
    }
}
