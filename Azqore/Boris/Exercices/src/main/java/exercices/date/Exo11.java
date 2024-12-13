package exercices.date;

import java.time.LocalDate;
/*
 ** Consigne **
 *
 * Vous souhaitez partir fin février de l'année prochaine, mais vous avez besoin de savoir si l'année prochaine
 *  est bissextile.
 *
 * Affichez le résultat
 *
 *************
 *
 * Resultat attendu :
 */
class Exo11 {

    public static void main(String[] args) {
        LocalDate date1 = LocalDate.now();
        System.out.println("Date du jour: " + date1);
        LocalDate date2 = date1.plusYears(4);

        if(date2.isLeapYear()){
           System.out.println("L'année " + date2.getYear() + " est bissextile");
        }else{
            System.out.println("L'année " + date2.getYear() + " n'est pas bissextile");
        }
    }
}

