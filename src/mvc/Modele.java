package mvc;

import java.util.List;

public class Modele {
    private List<Task> listeTache;

    public void ajouterTache(Task tache){
        listeTache.add(tache);
    }

    public List<Task> getTaches(){
        return listeTache;
    }

    /**
     * Méthode retournant une tâche via son id
     * @param id
     * @return la tache correspondant à l'id passé en paramètre, null sinon
     */
    public Task getTache(int id){
        for(Task tache : listeTache){
            if (tache.getId() == id) return tache;
        }
    return null;
    }
}
