package mvc;

import javax.swing.*;
import java.awt.*;

public class Vue extends JPanel {
    private JPanel panelAjoutTache;
    private TextField idTextField;

    public Vue(){
        panelAjoutTache = new JPanel();
        idTextField = new TextField();
        panelAjoutTache.setSize(new Dimension(1920,1080));
        panelAjoutTache.add(idTextField);
    }

    public void actualiserPanel(JPanel panel){
        for(Component c : panel.getComponents()){
            if(c instanceof TextField) ((TextField) c).setText("");
        }
    }
}
