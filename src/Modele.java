import Exceptions.TacheNonExistanteException;

import java.util.List;

public class Modele {
    private List<Task> listeTache;

    public void ajouterTache(Task tache){
        listeTache.add(tache);
    }

    public List<Task> getTaches(){
        return listeTache;
    }

    public Task getTache(int id){
        for(Task tache : listeTache){
            if (tache.getId() == id) return tache;
        }
    return null;
    }
}
