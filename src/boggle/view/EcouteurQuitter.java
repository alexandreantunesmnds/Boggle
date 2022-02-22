package boggle.view;

import boggle.model.Boggle;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class EcouteurQuitter implements EventHandler<ActionEvent> {
    private Boggle bog;
    public EcouteurQuitter(Boggle bog){
        this.bog = bog;
    }
    @Override
    public void handle(ActionEvent e) {
        Platform.exit();
    }
}
