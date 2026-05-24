# BankManager

**Auteur :** Yaya Dembele  
**Email :** yayadem107@gmail.com  
**Cours :** LPRGL3A - Projet Informatique II  
**Chapitre :** 06 - Programmation Orientée Objet en Java  
**Exercice :** 4 - Le gestionnaire de banque

---

## Objectif de l'exercice

Concevoir une application Java qui illustre le concept d'**héritage** en Programmation Orientée Objet.

L'application modélise différents types de comptes bancaires à l'aide d'une **classe parent** (`BankAccount`) et de **classes enfants** qui en héritent (`CheckingAccount`, `SavingsAccount`, `COD`).

---

## Classes créées

### 1. `BankAccount` — Classe parent

Représente un compte bancaire générique.

| Attribut  | Type     | Description              |
|-----------|----------|--------------------------|
| `account` | `String` | Numéro ou nom du compte  |
| `balance` | `double` | Solde du compte          |

Contient : constructeur par défaut, constructeur paramétré, getters, setters, `toString()`.

---

### 2. `CheckingAccount` — Classe enfant (Compte Courant)

Hérite de `BankAccount` et ajoute :

| Attribut | Type     | Description                         |
|----------|----------|-------------------------------------|
| `limit`  | `double` | Limite de découvert autorisée        |

---

### 3. `SavingsAccount` — Classe enfant (Compte Épargne)

Hérite de `BankAccount` et ajoute :

| Attribut        | Type     | Description               |
|-----------------|----------|---------------------------|
| `interestRate`  | `double` | Taux d'intérêt annuel (%) |

---

### 4. `COD` — Classe enfant (Certificat de Dépôt)

Hérite de `BankAccount` et ajoute :

| Attribut          | Type  | Description           |
|-------------------|-------|-----------------------|
| `durationMonths`  | `int` | Durée du dépôt (mois) |

---

### 5. `Main` — Classe principale

Contient la méthode `main`. Crée des instances des trois types de comptes, les modifie et les affiche.

---

## Explication de l'héritage utilisé

```
BankAccount          ← Classe parent
  ├── account
  └── balance
       │
       ├── CheckingAccount    ← hérite de BankAccount + ajoute limit
       ├── SavingsAccount     ← hérite de BankAccount + ajoute interestRate
       └── COD                ← hérite de BankAccount + ajoute durationMonths
```

Le mot-clé `extends` permet à une classe enfant d'hériter de tous les attributs et méthodes de la classe parent.

```java
public class CheckingAccount extends BankAccount { ... }
public class SavingsAccount  extends BankAccount { ... }
public class COD             extends BankAccount { ... }
```

Le mot-clé `super` dans le constructeur enfant appelle le constructeur du parent :

```java
public CheckingAccount(String account, double balance, double limit) {
    super(account, balance); // appelle BankAccount(account, balance)
    this.limit = limit;
}
```

---

## Structure du projet

```
BankManager/
│
├── src/
│   ├── BankAccount.java        ← Classe parent
│   ├── CheckingAccount.java    ← Compte Courant (extends BankAccount)
│   ├── SavingsAccount.java     ← Compte Épargne (extends BankAccount)
│   ├── COD.java                ← Certificat de Dépôt (extends BankAccount)
│   └── Main.java               ← Point d'entrée du programme
│
├── .idea/                      ← Configuration IntelliJ IDEA
│   ├── modules.xml
│   ├── misc.xml
│   └── workspace.xml
│
├── BankManager.iml             ← Fichier module IntelliJ
└── README.md                   ← Ce fichier
```

---

## Ouvrir le projet dans IntelliJ IDEA

1. Décompresser le fichier `BankManager.zip`
2. Ouvrir IntelliJ IDEA
3. Cliquer sur **File > Open**
4. Sélectionner le dossier **BankManager** (celui qui contient `src/` et `BankManager.iml`)
5. Cliquer **OK**
6. Si IntelliJ demande de configurer le SDK : choisir **JDK 21**
   - File > Project Structure > Project > SDK → sélectionner Java 21

---

## Exécuter le programme

### Méthode 1 — Depuis IntelliJ (recommandée)

1. Ouvrir `src/Main.java`
2. Cliquer sur le bouton ▶ vert à gauche de `public static void main`
3. Ou appuyer sur **Shift + F10**

### Méthode 2 — Depuis le terminal

```bash
# Se placer dans le dossier src
cd BankManager/src

# Compiler
javac *.java

# Exécuter
java Main
```

---

## Exemple de sortie console

```
===========================================
         BANK MANAGER - Yaya Dembele      
         LPRGL3 - Chapitre 06 POO          
===========================================

--- Compte Courant ---
[Compte Courant] Compte : CC-001 | Solde : 1500.0 € | Limite découvert : 500.0 €
Après modification :
  Numéro de compte : CC-001-UPDATED
  Solde            : 2000.0 €
  Limite découvert : 800.0 €

--- Compte Épargne ---
[Compte Épargne] Compte : CE-002 | Solde : 5000.0 € | Taux d'intérêt : 2.5 %
Lecture des attributs :
  Numéro de compte : CE-002
  Solde            : 5000.0 €
  Taux d'intérêt   : 2.5 %

--- Certificat de Dépôt ---
[Certificat de Dépôt] Compte : COD-003 | Solde : 10000.0 € | Durée : 12 mois
Après modification :
  Numéro de compte : COD-003
  Solde            : 12000.0 €
  Durée            : 24 mois

--- Polymorphisme : tous les comptes sont des BankAccount ---
Compte : CC-001-UPDATED | Solde : 2000.0 €
Compte : CE-002 | Solde : 5000.0 €
Compte : COD-003 | Solde : 12000.0 €

===========================================
           Programme terminé               
===========================================
```

---

## Concepts POO illustrés

| Concept          | Où ?                                                        |
|------------------|-------------------------------------------------------------|
| **Héritage**     | `extends BankAccount` dans les 3 classes enfants            |
| **Encapsulation**| Attributs `private` + getters/setters                       |
| **`super`**      | Appel du constructeur parent dans chaque classe enfant      |
| **`toString()`** | Redéfinie dans chaque classe pour un affichage personnalisé |
| **Polymorphisme**| Tableau `BankAccount[]` contenant les 3 types d'objets      |
