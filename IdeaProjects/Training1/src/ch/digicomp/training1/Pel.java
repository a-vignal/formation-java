package ch.digicomp.training1;

import java.util.Scanner;

public class Pel {
    public static void main(String[] args) {
        Scanner myKeyboard = new Scanner(System.in);
    //    System.out.printf("merci de saisir le montant du PEL:");
    //    float MontantPel = myKeyboard.nextFloat();
        float MontantPel = 8502;
        float TauxPelPel = 3.27f;
        float TauxImpot = 17.20f;
        float MontantDu = 0;
        float MontantImpot = 0;
        float MontantImpotTotal = 0;
        float MontantTotal = 0;

        for (int i = 1; i <= 24; i++) {
            MontantDu = MontantPel * (TauxPelPel / 100);
            MontantImpot = MontantDu * (TauxImpot / 100) ;
            MontantDu = MontantDu - MontantImpot;
            MontantPel = MontantPel + MontantDu;
            MontantTotal = MontantTotal + MontantDu;
            MontantImpotTotal = MontantImpotTotal + MontantImpot;
            System.out.println("Le montant du pour l'annee " + i + " est de: " + MontantDu);
            System.out.println("Le prelevemant social sur cette annee est de: " + MontantImpot);
            System.out.println("Le MontantTotal sur cette annee est de: " + MontantTotal);
            System.out.println("Le MontantImpotTotal sur cette annee est de: " + MontantImpotTotal);

        }

    }
}

