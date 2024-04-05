import mvc.Controleur;
import mvc.Modele;
import mvc.Vue;

import javax.swing.*;

public class MainFrame extends JFrame {
    public static void main(String[] args) {
        Vue vue = new Vue();
        Modele modele = new Modele();
        Controleur controleur = new Controleur(vue, modele);

        JFrame frame = new JFrame("Application");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(vue);
        frame.pack();
        frame.setVisible(true);
    }
}
