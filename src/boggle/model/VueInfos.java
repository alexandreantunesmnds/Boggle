package boggle.model;

import java.awt.*;

public class VueInfos implements Observateur{
    private Label score, motChoisi ;
    private Boggle bog ;
    public VueInfos(Boggle bog) {
        this.bog = bog ;
        this.bog.ajouterObservateur(this) ;
    }

    @Override
    public void reagir() {

    }
}
