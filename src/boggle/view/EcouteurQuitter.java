package boggle.view;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class EcouteurQuitter implements EventHandler<ActionEvent> {
    public EcouteurQuitter(){

    }
    @Override
    public void handle(ActionEvent e) {
        Platform.exit();
    }
}
