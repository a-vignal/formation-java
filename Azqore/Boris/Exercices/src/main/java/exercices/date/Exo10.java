package exercices.date;

import java.time.LocalDate;
import java.time.Month;

/*
 ** Consigne **
 *
 * Nous essayons de savoir programmatiquement si une date est avant ou après une autre. Affichez un message pour
 * indiquer les cas.
 *
 * date 1 : aujourd'hui
 * date 2 : 22 02 2022
 *
 *
 * ASTUCE : Vous devez utiliser isAfter ou isBefore
 *
 *************
 *
 * Resultat attendu :
 */
class Exo10 {

    public static void main(String[] args) {
        LocalDate date2 = LocalDate.of(2024, Month.NOVEMBER, 30);;
        System.out.println("Date2  : " + date2);
        LocalDate date1 = LocalDate.now();
        System.out.println("Date du jour: " + date1);

        if(date1.isBefore(date2)){
            System.out.println("Date du jour < date2");
        }else{
            if(date1.isAfter(date2)) {
                System.out.println("Date du jour > date2");
            }else{ System.out.println("Date du jour = date2");
            };
        }
    }

}
