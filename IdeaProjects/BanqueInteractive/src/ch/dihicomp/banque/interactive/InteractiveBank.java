package ch.dihicomp.banque.interactive;
import java.util.Scanner;
public class InteractiveBank {
    public static void main(String[] args) {
        Bank myBank = new Bank("Banque TEST");
        boolean input=true;
        int currentMenu=0;
        int choice=0;
        Scanner myKeyboard = new Scanner(System.in);
        do {

            InteractiveBank.interactionMenu(currentMenu);
            choice = myKeyboard.nextInt();
            //myKeyboard.close();
            switch (choice){
                case 1:
                    InteractiveBank.interactionAddClient(myBank);
                    break;
                case 2:
                    InteractiveBank.interactionOperationClient(myBank);
                    break;
                case 3:
                    InteractiveBank.interactionBalanceSheetClient(myBank);
                    break;
                case 4:
                    input=false;
                    break;
            }

        } while (input);
    }
    public static void interactionMenu(int menu) {
        switch (menu) {
            case 0:
                System.out.println("Quelle opération voulez-vous effectuer ?");
                System.out.println("1) Ajouter un client");
                System.out.println("2) Effectuer une opération sur un client");
                System.out.println("3) Afficher un bilan général");
                System.out.println("4) Sortie");
                break;
            case 2:
                System.out.println("1) Afficher un bilan");
                System.out.println("2) Faire un retrait");
                System.out.println("3) Faire un dépôt");
                System.out.println("4) Faire un virement");
                break;
            default:
                break;
        }
    }
    public static void interactionAddClient(Bank myBank){
            Scanner myKeyboard2 = new Scanner(System.in);
            System.out.println("Entrez le nom du client :");
            String clientName = myKeyboard2.nextLine();
            myBank.addClient(clientName);
            System.out.println("Le client " + clientName + " a et crée.");
            myKeyboard2.close();
    }

    public static void interactionOperationClient(Bank myBank){
        Scanner myKeyboard = new Scanner(System.in);
        int clientNumber = 0;
        System.out.println("Quel client :");
        String clientName = myKeyboard.nextLine();
        Client[] myClientArray = myBank.getBankClients();
        for (int i = 0; i < myClientArray.length; i++) {
            if (myClientArray[i].getClientName() == clientName){
                clientNumber = i;
            }
        }
        Account[] myAccountArray = myClientArray[clientNumber].getClientAccountArray();
        InteractiveBank.interactionMenu(2);
        int choice = myKeyboard.nextInt();
        switch (choice) {
            case 1:
                myBank.balanceSheetClient(myClientArray[clientNumber]);
                break;
            case 2:
                InteractiveBank.display(myAccountArray);
                System.out.println("Choix du compte : ");
                int chosenAccount = myKeyboard.nextInt();
                System.out.println("Montant du retrait :");
                float withdrawalAmount = myKeyboard.nextFloat();
                myAccountArray[chosenAccount].withdrawal(withdrawalAmount);
                InteractiveBank.display(myAccountArray);
                break;
            case 3:
                InteractiveBank.display(myAccountArray);
                System.out.println("Choix du compte : ");
                int chosenAccount2 = myKeyboard.nextInt();
                System.out.println("Montant du depot :");
                float depositAmount = myKeyboard.nextFloat();
                myAccountArray[chosenAccount2].deposit(depositAmount);
                InteractiveBank.display(myAccountArray);
                break;
            case 4:
                InteractiveBank.display(myAccountArray);
                System.out.println("Choix du compte a débiter: ");
                int firstAccount = myKeyboard.nextInt();
                System.out.println("Choix du compte a créditer: ");
                int destAccount = myKeyboard.nextInt();
                System.out.println("Montant du virement :");
                float wireAmount = myKeyboard.nextFloat();
                myAccountArray[firstAccount].withdrawal(wireAmount);
                myAccountArray[destAccount].deposit(wireAmount);
                InteractiveBank.display(myAccountArray);
                break;
        }
    }
    public static void interactionBalanceSheetClient(Bank myBank){
        myBank.balanceSheetGeneral();
    }
    static void display(Account[] AccountTab) {
        for (int i = 0; i < AccountTab.length; i++) {
            if(AccountTab[i].getAccountNumber() == 0) {
                break;
            }
            System.out.println("Numero de compte :" + AccountTab[i].getAccountNumber());
        }
    }
}
