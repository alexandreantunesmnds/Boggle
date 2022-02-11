package boggle.model;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class EcouteurLettre implements EventHandler <ActionEvent> {
    private Boggle Bog;
    private int lig;
    private int col;
    public EcouteurLettre(){

    }
    @Override
    public void handle(ActionEvent e) {
        System.out.println("Hello");
    }
}
