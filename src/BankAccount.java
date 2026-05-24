/**
 * Classe parent représentant un compte bancaire générique.
 *
 * Elle contient les attributs communs à tous les types de comptes :
 * - account : le numéro ou nom du compte
 * - balance : le solde du compte
 *
 * Les classes CheckingAccount, SavingsAccount et COD héritent de cette classe.
 *
 * Auteur : Yaya Dembele
 * Cours  : LPRGL3 - Projet Informatique II - Chapitre 06
 */
public class BankAccount {

    // Attributs du compte bancaire (privés pour respecter l'encapsulation)
    private String account;
    private double balance;

    // -------------------------------------------------------
    // Constructeur par défaut
    // -------------------------------------------------------
    public BankAccount() {
        this.account = "";
        this.balance = 0.0;
    }

    // -------------------------------------------------------
    // Constructeur paramétré : permet de créer un compte avec des valeurs
    // -------------------------------------------------------
    public BankAccount(String account, double balance) {
        this.account = account;
        this.balance = balance;
    }

    // -------------------------------------------------------
    // Getters : permettent de LIRE les attributs privés
    // -------------------------------------------------------

    // Retourne le numéro/nom du compte
    public String getAccount() {
        return account;
    }

    // Retourne le solde du compte
    public double getBalance() {
        return balance;
    }

    // -------------------------------------------------------
    // Setters : permettent de MODIFIER les attributs privés
    // -------------------------------------------------------

    // Modifie le numéro/nom du compte
    public void setAccount(String account) {
        this.account = account;
    }

    // Modifie le solde du compte
    public void setBalance(double balance) {
        this.balance = balance;
    }

    // -------------------------------------------------------
    // toString : affiche les informations du compte
    // -------------------------------------------------------
    @Override
    public String toString() {
        return "Compte : " + account + " | Solde : " + balance + " €";
    }
}
