package ch.digicomp.training1;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner myKeyboard = new Scanner(System.in);
        // lecture d'un float
        //myKeyboard.nextFloat();
        System.out.print ("merci de saisir un palindrome:");
        String Palindrome = myKeyboard.nextLine();
        //String Palindrome = "ANNA";
        boolean isPalindrome = true;
        int lPalindome = Palindrome.length();

        for (int i=0;lPalindome-i>0;i++) {
            int j = lPalindome - i -1;
            if (Palindrome.charAt(i) != Palindrome.charAt(j)) {
               isPalindrome = false;
            }
        }
        System.out.print (isPalindrome);
        // inverser une chaine de carractère, dans une boucle
        // inputInverse += Palindrome.charAt(i), i allant de lenght à 0
        // utiliser un objet StringBuilder et utiliser la méthode reverse

    }
}
