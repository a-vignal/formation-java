package exercices.date;

import java.time.LocalDate;
import java.time.Month;

/*
 ** Consigne **
 *
 * Evaluez si deux dates sont égales
 * Date 1 : la date du premier jour de votre formation Java 8
 * Date 2 : la date du jour
 *
 * Affichez un message pour indiquer si elles sont égales ou non
 *
 *************
 *
 * Resultat attendu :
 */
class Exo4 {

    public static void main(String[] args) {
        LocalDate date1 = LocalDate.of(2024, Month.OCTOBER, 31);;
        System.out.println("Date du premier jour de ma formation java 8 : " + date1);
        LocalDate date2 = LocalDate.now();
        System.out.println("Date du jour: " + date2);
        if(date1.equals(date2)){
            System.out.println("Date du jour egale date 1er jour formation");
        }else {
            System.out.println("Date du jour diff de date 1er jour formation");
        }

    }


}
