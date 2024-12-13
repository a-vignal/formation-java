package ch.dihicomp.banque.interactive;

public class Account {
    //attributes
    private int accountNumber;
    private float accountBalance;
    private static int nbAccounts;

    public Account(float accountBalance) {
        this.accountBalance = accountBalance;
        this.accountNumber = ++nbAccounts;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    // methods
    void deposit(float amount) {
        accountBalance += amount;
    }
    void withdrawal(float amount) {
        accountBalance -= amount;
    }
    float getAmountBalance() {
        float accountBalance1 = accountBalance;
        return accountBalance1;
    }
    void printAmountBalance() {
        System.out.println("Solde du compte :" + accountBalance);
    }
    void wire(float amountWired, Account accountDestination) {
        accountDestination.accountBalance += amountWired;
        accountBalance -= amountWired;
    }

    public void setAccountBalance(float accountBalance) {
        this.accountBalance = accountBalance;
    }

    public float getAccountBalance() {
        return accountBalance;
    }

    public static int getNbAccounts() {
        return nbAccounts;
    }
}
