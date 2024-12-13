package ch.dihicomp.banque.interactive;
import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int accountNum;
        String accountNameTest;
        float accountBal;
        // Test classe Account
       /* System.out.println("Test classe Account");
        Account testAccount = new Account(0);
        Account testAccount2 = new Account(0);
        accountBal=1000000;
        testAccount.accountBalance=accountBal;
        System.out.println("Creation du compte " + testAccount.getAccountNumber() + " Solde du compte : " + accountBal);
        testAccount.deposit(123456,100.5F);
        testAccount.printAmountBalance();
        testAccount.withdrawal(123456,300.2F);
        testAccount.printAmountBalance();
        System.out.println("Fin test classe Account");
        //System.out.printf("Hello and welcome!");
        System.out.println("Test method wire classe Account");
        accountBal=2000000;
        testAccount2.accountNumber=accountNum;
        testAccount2.accountBalance=accountBal;
        System.out.println("Creation du compte " + accountNum + " Solde du compte : " + accountBal);
        System.out.println("Virement de 50000 de 123456 vers 654321");
        testAccount.wire(50000,testAccount2);
        testAccount.printAmountBalance();
        testAccount2.printAmountBalance();
        System.out.println("Fin test method wire classe Account");
        //for (int i = 1; i <= 5; i++) {
        System.out.println("Test classe Client");*/
      /*  Client client1 = new Client("CLIENT DE TEST",testAccount);
        accountBal=client1.getClientAmountBalance();
        System.out.println("test method getClientAmountBalance classe Client : " + accountBal);
        client1.printClientAmountBalance();
        accountNameTest = client1.getClientName();
        System.out.println("test method getClientName classe Client : " + accountNameTest);
        */
        Account testAccount = new Account(100);
        Account testAccount2 = new Account(300);
        Account testAccount3 = new Account(200);
        Account[] accountClientArray1 = {testAccount,testAccount2,testAccount3};
        Client client2 = new Client("CLIENT DE TEST");
        accountBal=client2.getClientAmountBalance();
        System.out.println("test method getClientAmountBalance classe Client : " + accountBal);
        client2.printClientAmountBalance();
        client2.addAccount();
        accountNameTest = client2.getClientName();
        System.out.println("test method getClientName classe Client : " + accountNameTest);

    }
}