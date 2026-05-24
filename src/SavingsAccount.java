/**
 * Classe enfant représentant un Compte Épargne (Savings Account).
 *
 * Elle hérite de BankAccount.
 * Un compte épargne possède un taux d'intérêt annuel.
 *
 * Grâce à l'héritage, SavingsAccount possède automatiquement
 * les attributs account et balance de BankAccount.
 *
 * Auteur : Yaya Dembele
 * Cours  : LPRGL3 - Projet Informatique II - Chapitre 06
 */
public class SavingsAccount extends BankAccount {

    // Attribut spécifique au compte épargne : taux d'intérêt (en pourcentage)
    private double interestRate;

    // -------------------------------------------------------
    // Constructeur par défaut
    // -------------------------------------------------------
    public SavingsAccount() {
        super(); // Appel du constructeur de BankAccount
        this.interestRate = 0.0;
    }

    // -------------------------------------------------------
    // Constructeur paramétré
    // -------------------------------------------------------
    public SavingsAccount(String account, double balance, double interestRate) {
        super(account, balance); // Initialise account et balance via BankAccount
        this.interestRate = interestRate;
    }

    // -------------------------------------------------------
    // Getter : lire le taux d'intérêt
    // -------------------------------------------------------
    public double getInterestRate() {
        return interestRate;
    }

    // -------------------------------------------------------
    // Setter : modifier le taux d'intérêt
    // -------------------------------------------------------
    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    // -------------------------------------------------------
    // toString : affiche toutes les informations du compte épargne
    // -------------------------------------------------------
    @Override
    public String toString() {
        return "[Compte Épargne] " + super.toString() + " | Taux d'intérêt : " + interestRate + " %";
    }
}
