class Account {
    String accountHolderName;
    int accountNumber;

    Account(String accountHolderName, int accountNumber) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
    }

    void displayAccountDetails() {
        System.out.println("Account Holder Name : " + accountHolderName);
        System.out.println("Account Number      : " + accountNumber);
    }
}

class SavingsAccount extends Account {
    SavingsAccount(String name, int number) {
        super(name, number);
    }

    void displaySavingsAccount() {
        System.out.println("\nSavings Account");
        System.out.println("----------------");
        displayAccountDetails();
        System.out.println("Account Type        : Savings Account");
    }
}

class CurrentAccount extends Account {
    CurrentAccount(String name, int number) {
        super(name, number);
    }

    void displayCurrentAccount() {
        System.out.println("\nCurrent Account");
        System.out.println("----------------");
        displayAccountDetails();
        System.out.println("Account Type        : Current Account");
    }
}

class PremiumSavingsAccount extends SavingsAccount {
    PremiumSavingsAccount(String name, int number) {
        super(name, number);
    }

    void displayPremiumAccount() {
        System.out.println("\nPremium Savings Account");
        System.out.println("-----------------------");
        displayAccountDetails();
        System.out.println("Account Type        : Premium Savings Account");
    }
}

public class exp04 {
    public static void main(String[] args) {
        SavingsAccount savings = new SavingsAccount("Yazhini", 101);
        CurrentAccount current = new CurrentAccount("Rahul", 102);
        PremiumSavingsAccount premium = new PremiumSavingsAccount("Priya", 103);

        savings.displaySavingsAccount();
        current.displayCurrentAccount();
        premium.displayPremiumAccount();
    }
}
