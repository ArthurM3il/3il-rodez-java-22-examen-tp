package enums;

public enum Priorite {
    FAIBLE("Priorité faible"),
    MOYENNE("Priorité moyenne"),
    HAUTE("Priorité haute");

    private String label;
     Priorite(String label){
        this.label = label;
    }

    public String getLabel() {
        return label;
    }
}
