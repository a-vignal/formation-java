package exercices.date;

import java.time.LocalDate;
import java.time.Month;
import java.time.MonthDay;

/*
 ** Consigne **
 *
 * Vérifier si la date de l'événement périodique est arrivé
 * Date 1 : la date de votre anniversaire
 * Date 2 : la date du jour
 *
 * Affichez un message pour indiquer si c'est votre anniversaire ou non.
 *
 * ASTUCE : Vous pouvez utiliser L'objet MonthDay
 *
 *************
 *
 * Resultat attendu :
 */
class Exo5 {

    public static void main(String[] args) {
        LocalDate date1 = LocalDate.of(1972, Month.OCTOBER, 31);;
        System.out.println("Date du premier jour de ma formation java 8 : " + date1);
        LocalDate date2 = LocalDate.now();
        System.out.println("Date du jour: " + date2);
        MonthDay birthday= MonthDay.from(date1);
        MonthDay currentMonthDay= MonthDay.from(date2);


        if(currentMonthDay.equals(birthday)){
        System.out.println("C'est votre anniversaire");
        }else {
        System.out.println("Votre anniversaire n'est pas encore arrivé");
        }
    }


}
