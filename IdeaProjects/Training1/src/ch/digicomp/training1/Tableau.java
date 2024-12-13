package ch.digicomp.training1;

import java.util.Scanner;

public class Tableau {
    public static void main(String[] args) {
        // Tableau des notes
        // Tableau des prenoms
        String [][] bulletin =  new String[100][2];
        Scanner myKeyboard = new Scanner(System.in);
        boolean sortie = false;
        int j=0;
        for (int i = 0; !sortie ; i++) {
            System.out.print("Note:");
            String note = myKeyboard.nextLine();
            //note = note.intern();
            //if (note != "-1") {
            if (note.equals("-1")) {
                sortie = true;
                }else {
                System.out.print("Prenom:");
                String prenom = myKeyboard.nextLine();
                bulletin[i][1] = note;
                bulletin[i][0] = prenom;
            }
        }
        System.out.println(java.util.Arrays.deepToString(bulletin));
    }

}

