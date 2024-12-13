package ch.dihicomp.banque.interactive;

public class Client {
    private String clientName;
    private Account[] clientAccountArray = new Account[100];

    public static int getNumberOfAccounts() {
        return numberOfAccounts;
    }

    private static int numberOfAccounts;

    //public Client(String clientName, Account[] clientAccountArray) {
    public Client(String clientName) {
        this.clientName = clientName;
      //  this.clientAccountArray = clientAccountArray;
      clientAccountArray[0] = new Account(0);
    }

    public String getClientName() {
        return clientName;
    }
    public float getClientAmountBalance() {
        float balanceTotal = 0;
        for (int i = 0; i < clientAccountArray.length; i++) {
            balanceTotal += clientAccountArray[i].getAmountBalance();
        }
        return balanceTotal;
    }
    public void printClientAmountBalance() {
        float balanceTotal;
        balanceTotal=getClientAmountBalance();
        System.out.println("Solde des comptes :" + balanceTotal);
    }
    public void addAccount() {
        ++numberOfAccounts;
        clientAccountArray[numberOfAccounts] = new Account(0);
    }

    public Account[] getClientAccountArray() {
        return clientAccountArray;
    }

}
