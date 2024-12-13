package ch.dihicomp.banque.interactive;

public class Bank {
    private String bankName;
    private Client []  bankClientsArray = new Client[100];
    private static int numberOfClients;

    public Bank(String bankName) {
        this.bankName = bankName;
    }

    public String getBankName() {
        return bankName;
    }

    public Client[] getBankClients() {
        return bankClientsArray;
    }

    public void addClient(String clientNameCreation) {
        ++numberOfClients;
        bankClientsArray[numberOfClients] = new Client(clientNameCreation);
    }
    public void balanceSheetClient(Client clientBalance) {
        Account[] clientBalanceAccountArray = new Account[100];
        clientBalanceAccountArray=clientBalance.getClientAccountArray();
        System.out.println("Bilan de tous les comptes du Client " + clientBalance.getClientName());
        for (int i = 0; i < clientBalanceAccountArray.length; i++) {
            System.out.println("Solde du compte " + clientBalanceAccountArray[i].getAccountNumber() + " : " + clientBalanceAccountArray[i].getAccountBalance());
        }

    }
    public void balanceSheetGeneral() {
        System.out.println("Bilan de tous les Clients de la banque " + bankName);
        for (int i = 0; i < bankClientsArray.length; i++) {
            System.out.println("Solde de tous les comptes du client  " + bankClientsArray[i].getClientName() + " : " + bankClientsArray[i].getClientAmountBalance());
        }

    }
}
