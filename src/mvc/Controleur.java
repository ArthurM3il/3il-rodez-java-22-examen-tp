package mvc;

import mvc.Modele;

public class Controleur {
    private Vue vue;
    private Modele modele;
    public Controleur(Vue vue, Modele modele){
        this.vue = vue;
        this.modele = modele;
    }
}
