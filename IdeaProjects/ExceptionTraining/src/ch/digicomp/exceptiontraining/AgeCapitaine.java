package ch.digicomp.exceptiontraining;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class AgeCapitaine {
    public static void main(String[] args) {
        boolean isCorrectAge = false;
        int nbTry=0;
        int age= 0;
        Scanner clavier = new Scanner(System.in);


        while ((age < 18 || age > 65) && nbTry <3) {
            try {
                System.out.println("Age du capitaine: ");
                age = clavier.nextInt();
                getAgeCap(age);
            } catch (AgeCapException e) {
                nbTry++;
                e.getMessage();
                System.out.println("Essai infructueux n°" + nbTry +  ": " + e.getMessage());;
            } catch (InputMismatchException e) {
                nbTry++;
                clavier.next();
                System.out.println("Essai infructueux n°" + nbTry +  ":  L'age du capitaine doit être un entier");

            } finally {
                age=0;
            }
        }
        System.out.println("L'age du capitaine est :" + age);
    }

    public static void getAgeCap(int age) throws AgeCapException  {
        double number= Math.random()*100;
        if (age <18 || age > 65){
            throw new AgeCapException(age);
        }
    }



}
