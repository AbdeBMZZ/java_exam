import java.util.ArrayList;
import java.util.List;

public class Impots {
    private int annee;
    private double montantImpots;
    private List<Dossier> dossiers = new ArrayList<>();

    public Impots(int annee) {
        this.annee = annee;
    }

    public void add(Dossier dossier) {
        dossiers.add(dossier);
        calculerMontant();
    }
    public int getAnnee() {
        return annee;
    }

    public void calculerMontant() {
        montantImpots = 0;
        for (Dossier dossier : dossiers) {
            montantImpots += dossier.montant;
        }
    }

    public String toString() {
        StringBuilder detail = new StringBuilder();
        for (Dossier dossier : dossiers) {
            detail.append("\n").append(dossier.toString());
        }
        detail.append("\nTotal: ").append(montantImpots).append("\n");
        return detail.toString();
    }
}
