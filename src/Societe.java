import java.util.ArrayList;
import java.util.List;

public class Societe {
    private long id;
    private String raison_sociale;
    private List<Impots> impots = new ArrayList<>();

    public List<Impots> getImpots(int annee) {
        System.out.println("Liste des impots " + annee );
        List<Impots> impotsAnnee = new ArrayList<>();
        for (Impots impot : impots) {
            if (impot.getAnnee() == annee) {
                impotsAnnee.add(impot);
            }
        }
        return impotsAnnee;
    }

    public void addImpots(Impots impots) {
        this.impots.add(impots);
    }
    public Societe(long id, String rs) {
        this.id = id;
        this.raison_sociale = rs;
    }

    public String toString() {
        return "Societe: " + id + " - " + raison_sociale;
    }
}
