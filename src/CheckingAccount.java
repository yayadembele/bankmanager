/**
 * Classe enfant représentant un Compte Courant (Checking Account).
 *
 * Elle hérite de BankAccount et ajoute un attribut supplémentaire :
 * - limit : la limite de découvert autorisée sur le compte courant
 *
 * Grâce à l'héritage, CheckingAccount possède automatiquement
 * les attributs account et balance de BankAccount.
 *
 * Auteur : Yaya Dembele
 * Cours  : LPRGL3 - Projet Informatique II - Chapitre 06
 */
public class CheckingAccount extends BankAccount {

    // Attribut spécifique au compte courant
    private double limit;

    // -------------------------------------------------------
    // Constructeur par défaut
    // -------------------------------------------------------
    public CheckingAccount() {
        super(); // Appel du constructeur de BankAccount
        this.limit = 0.0;
    }

    // -------------------------------------------------------
    // Constructeur paramétré
    // -------------------------------------------------------
    public CheckingAccount(String account, double balance, double limit) {
        super(account, balance); // Initialise account et balance via BankAccount
        this.limit = limit;
    }

    // -------------------------------------------------------
    // Getter : lire la limite
    // -------------------------------------------------------
    public double getLimit() {
        return limit;
    }

    // -------------------------------------------------------
    // Setter : modifier la limite
    // -------------------------------------------------------
    public void setLimit(double limit) {
        this.limit = limit;
    }

    // -------------------------------------------------------
    // toString : affiche toutes les informations du compte courant
    // -------------------------------------------------------
    @Override
    public String toString() {
        return "[Compte Courant] " + super.toString() + " | Limite découvert : " + limit + " €";
    }
}
