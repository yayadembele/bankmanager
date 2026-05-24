/**
 * Classe principale du projet BankManager.
 *
 * Elle démontre l'utilisation de l'héritage en créant des instances
 * des trois types de comptes bancaires, en définissant leurs attributs
 * et en affichant leurs informations.
 *
 * Concepts illustrés :
 * - Héritage (extends)
 * - Constructeurs (par défaut et paramétrés)
 * - Getters et Setters
 * - Méthode toString() redéfinie
 * - Polymorphisme (traitement des objets enfants comme BankAccount)
 *
 * Auteur : Yaya Dembele
 * Cours  : LPRGL3 - Projet Informatique II - Chapitre 06
 */
public class Main {

    public static void main(String[] args) {

        System.out.println("===========================================");
        System.out.println("         BANK MANAGER - Yaya Dembele      ");
        System.out.println("         LPRGL3 - Chapitre 06 POO          ");
        System.out.println("===========================================\n");

        // ---------------------------------------------------
        // 1. Création d'un Compte Courant (CheckingAccount)
        // ---------------------------------------------------
        System.out.println("--- Compte Courant ---");

        // Utilisation du constructeur paramétré
        CheckingAccount checkingAccount = new CheckingAccount("CC-001", 1500.00, 500.00);

        // Affichage avec toString()
        System.out.println(checkingAccount);

        // Démonstration des setters : modifier les valeurs
        checkingAccount.setAccount("CC-001-UPDATED");
        checkingAccount.setBalance(2000.00);
        checkingAccount.setLimit(800.00);

        // Démonstration des getters : lire les valeurs
        System.out.println("Après modification :");
        System.out.println("  Numéro de compte : " + checkingAccount.getAccount());
        System.out.println("  Solde            : " + checkingAccount.getBalance() + " €");
        System.out.println("  Limite découvert : " + checkingAccount.getLimit() + " €");

        System.out.println();

        // ---------------------------------------------------
        // 2. Création d'un Compte Épargne (SavingsAccount)
        // ---------------------------------------------------
        System.out.println("--- Compte Épargne ---");

        // Utilisation du constructeur par défaut puis des setters
        SavingsAccount savingsAccount = new SavingsAccount();
        savingsAccount.setAccount("CE-002");
        savingsAccount.setBalance(5000.00);
        savingsAccount.setInterestRate(2.5);

        // Affichage avec toString()
        System.out.println(savingsAccount);

        // Lecture des valeurs avec les getters
        System.out.println("Lecture des attributs :");
        System.out.println("  Numéro de compte : " + savingsAccount.getAccount());
        System.out.println("  Solde            : " + savingsAccount.getBalance() + " €");
        System.out.println("  Taux d'intérêt   : " + savingsAccount.getInterestRate() + " %");

        System.out.println();

        // ---------------------------------------------------
        // 3. Création d'un Certificat de Dépôt (COD)
        // ---------------------------------------------------
        System.out.println("--- Certificat de Dépôt ---");

        // Utilisation du constructeur paramétré
        COD codAccount = new COD("COD-003", 10000.00, 12);

        // Affichage avec toString()
        System.out.println(codAccount);

        // Modification et lecture des attributs hérités de BankAccount
        codAccount.setBalance(12000.00);
        codAccount.setDurationMonths(24);

        System.out.println("Après modification :");
        System.out.println("  Numéro de compte : " + codAccount.getAccount());
        System.out.println("  Solde            : " + codAccount.getBalance() + " €");
        System.out.println("  Durée            : " + codAccount.getDurationMonths() + " mois");

        System.out.println();

        // ---------------------------------------------------
        // 4. Démonstration du polymorphisme
        //    Les objets enfants sont traités comme des BankAccount
        // ---------------------------------------------------
        System.out.println("--- Polymorphisme : tous les comptes sont des BankAccount ---");

        BankAccount[] tousLesComptes = {checkingAccount, savingsAccount, codAccount};

        for (BankAccount compte : tousLesComptes) {
            // On accède à account et balance via les getters de BankAccount
            System.out.println("Compte : " + compte.getAccount()
                             + " | Solde : " + compte.getBalance() + " €");
        }

        System.out.println("\n===========================================");
        System.out.println("           Programme terminé               ");
        System.out.println("===========================================");
    }
}
