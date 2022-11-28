public class DossierRevenus extends Dossier{
    private double ca;

    public DossierRevenus(int id, double ca) {
        super(id);
        this.ca = ca;
        calculerMontant();
    }

    @Override
    protected void calculerMontant() {
        // 15 % du CA
        montant = ca * 0.15;
    }

    public String toString() {
        return "15% de revenus " + ca + ", Montant: " + montant + "";
    }
}
