import enums.Priorite;

//Modèle
public class Task {
    private int id;
    private String titre;
    private String description;
    private String dateEcheance;
    private Priorite priorite;

    public Task(int id, String titre, String description, String dateEcheance, Priorite priorite) {
        this.id = id;
        this.titre = titre;
        this.description = description;
        this.dateEcheance = dateEcheance;
        this.priorite = priorite;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDateEcheance() {
        return dateEcheance;
    }

    public void setDateEcheance(String dateEcheance) {
        this.dateEcheance = dateEcheance;
    }

    public Priorite getPriorite() {
        return priorite;
    }

    public void setPriorite(Priorite priorite) {
        this.priorite = priorite;
    }
}
