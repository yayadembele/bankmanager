/**
 * Classe enfant représentant un Certificat de Dépôt (COD - Certificate of Deposit).
 *
 * Elle hérite de BankAccount.
 * Un certificat de dépôt est un placement à durée fixe avec une date d'échéance.
 *
 * Grâce à l'héritage, COD possède automatiquement
 * les attributs account et balance de BankAccount.
 *
 * Auteur : Yaya Dembele
 * Cours  : LPRGL3 - Projet Informatique II - Chapitre 06
 */
public class COD extends BankAccount {

    // Attribut spécifique au certificat de dépôt : durée en mois
    private int durationMonths;

    // -------------------------------------------------------
    // Constructeur par défaut
    // -------------------------------------------------------
    public COD() {
        super(); // Appel du constructeur de BankAccount
        this.durationMonths = 0;
    }

    // -------------------------------------------------------
    // Constructeur paramétré
    // -------------------------------------------------------
    public COD(String account, double balance, int durationMonths) {
        super(account, balance); // Initialise account et balance via BankAccount
        this.durationMonths = durationMonths;
    }

    // -------------------------------------------------------
    // Getter : lire la durée
    // -------------------------------------------------------
    public int getDurationMonths() {
        return durationMonths;
    }

    // -------------------------------------------------------
    // Setter : modifier la durée
    // -------------------------------------------------------
    public void setDurationMonths(int durationMonths) {
        this.durationMonths = durationMonths;
    }

    // -------------------------------------------------------
    // toString : affiche toutes les informations du certificat de dépôt
    // -------------------------------------------------------
    @Override
    public String toString() {
        return "[Certificat de Dépôt] " + super.toString() + " | Durée : " + durationMonths + " mois";
    }
}
