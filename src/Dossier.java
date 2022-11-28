public abstract class Dossier {
    public int id;
    protected double montant;
    public Dossier(int id) {
        this.id = id;
    }
    protected abstract void calculerMontant();
}
