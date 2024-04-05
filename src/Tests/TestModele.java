package Tests;

import enums.Priorite;
import mvc.Modele;
import mvc.Task;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestModele{

    private Task tache1 = new Task(1,"Essayer de faire marcher Swing","Non vraiment à l'aide","05/04/2024",Priorite.HAUTE);
    private Modele modele = new Modele();
    @Test
    public void testRetourTache(){
        System.out.println("Ce test est censé vérifier le bon retour d'une tâche par son id");
        modele.ajouterTache(tache1);
        assertEquals(modele.getTache(1),tache1);
    }

}
