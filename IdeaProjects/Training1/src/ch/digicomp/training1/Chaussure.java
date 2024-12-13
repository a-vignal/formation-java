package ch.digicomp.training1;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Chaussure {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        Scanner myKeyboard = new Scanner(System.in);
        // lecture d'un float
        //myKeyboard.nextFloat();
        System.out.print ("merci de saisir le prix HT:");
        float prixHt = myKeyboard.nextFloat();
        System.out.print ("merci de saisir le prix HT:");
        float pcTva = myKeyboard.nextFloat();
        float mtTva = prixHt * pcTva /100;
        float prixTtc = mtTva + prixHt;

        System.out.println("Le prix HT : " + prixHt + "€");
        System.out.println("Le montant de tva : " + mtTva+ "€");
        System.out.println("Le prix TTC : " + prixTtc+ "€");
        System.out.printf("Le prix TTC du prix HT %.2f est %.2f", prixHt, prixTtc);
    }
}