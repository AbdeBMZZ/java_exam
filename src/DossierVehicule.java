public class DossierVehicule extends Dossier{
    private int nbChevaux;
    private char categorie;

    public DossierVehicule(int id, int nbChevaux, char categorie) {
        super(id);
        this.nbChevaux = nbChevaux;
        this.categorie = categorie;
        calculerMontant();
    }

    @Override
    protected void calculerMontant() {
        //calculer le montant de l'impot en fonction du nombre de chevaux et de la categorie
        //categorie G: 700 euros par 8 chevals
        //categorie G: 1500 euros par 8 to 10 chevals
        //categorie G: 6000 euros par 11 to 14 chevals
        //categorie G: 20000 euros supérieur à 15 chevals


        switch (categorie) {
            case 'G':
                if (nbChevaux < 8) {
                    montant = 700;
                } else if (nbChevaux <= 10) {
                    montant = 1500;
                } else if (nbChevaux <= 14) {
                    montant = 6000;
                } else {
                    montant = 20000;
                }
                break;
            case 'E':
                if (nbChevaux < 8) {
                    montant = 350;
                } else if (nbChevaux <= 10) {
                    montant = 650;
                } else if (nbChevaux <= 14) {
                    montant = 3000;
                } else {
                    montant = 8000;
                }
                break;
        }
    }

    public String toString() {
        return "Vehicule " + categorie + " " + nbChevaux + " CH, montant: " + montant + "";
    }
}
