package ch.digicomp.exceptiontraining;

import java.util.InputMismatchException;

public class OubliStupide {
    public static void main(String[] args) {
        int[] tab = null;
        try {
        System.out.println(tab[2]);
            } catch (NullPointerException e) {
            System.out.println("NullPointerException, implémenter la solution : int[] tab = new int[10];");
            }
    }
}
