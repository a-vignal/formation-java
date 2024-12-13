package ch.digicomp.exceptiontraining;

import java.util.InputMismatchException;
import java.util.Scanner;
public class EssaiException {
    public static void main(String[] args) {
        int a=0, b=1, res=0;
        Scanner clavier = new Scanner(System.in);
        try {
            System.out.println("valeur pour a:");
            a = clavier.nextInt();
            System.out.println("valeur pour b:");
            b = clavier.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Erreur de saisi ! ");
            System.out.println("le message officiel est " + e.getMessage());

        }

        try {
            res = a / b;
            System.out.println("le résultat de " + a + " divisé par " + b + " est " + res);
        } catch (ArithmeticException e) {
            System.out.println("oop ! un problème dans la division ");
            System.out.println("le message officiel est " + e.getMessage());
        }finally {
            System.out.println("le bloc finally sera toujours exécuté") ;
            System.out.println("et c'est là que l'on fermera par exemple les fichiers") ;

        }
        System.out.println("Fin du programme");
        System.out.println("le résultat de " + a + " divisé par " + b + " est " + res);
        System.out.println("Fin du programme");
    }
}