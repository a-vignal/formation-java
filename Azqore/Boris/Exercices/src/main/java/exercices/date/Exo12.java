package exercices.date;

import java.time.*;
import java.time.temporal.ChronoUnit;

/*
 ** Consigne **
 *
 * 1) Une grande période s'est écoulée depuis la date de sortie de java 8 le 1er mars 2014.
 * Affichez le nombre d'année, de mois et de jours écoulés (avec la classe Period)
 *
 * 2) La date Java 8 se précise avec une date + une heure : le 1er mars 2014 à 19h30 et 50 secondes
 * Affichez le nombre d'année, de mois et jours  ainsi que le nombre total d'heures, minutes et secondes écoulés (avec la classe Duration)
 *
 * 3) : Vous pourrez utilisez ChronoUnit pour obtenir les données d'heures et de secondes par exemple
 *
 *************
 *
 * Resultat attendu :
 */
class Exo12 {

    public static void main(String[] args) {
        //       1er mars 2014
        LocalDate java8 = LocalDate.of(2014, Month.MARCH, 1);;
        System.out.println("Date sortie java8  : " + java8);

        //      Aujourd'hui
        LocalDate today = LocalDate.now();
        System.out.println("Date du jour: " + today);

//        1)
        Period period = Period.between(java8,today);
        System.out.println(period.getYears() + " années");
        System.out.println(period.getMonths() + " mois");
        System.out.println(period.getDays() + " jours");
        int years = period.getYears();
        int months = period.getMonths();
        int days = period.getDays();
        System.out.println("il s'est écoulé " + years + " années et " + months + " mois");

//        2)
        //       1er mars 2014 à 19h30 et 50 secondes
        LocalDateTime java8T = LocalDateTime.of(2014, Month.MARCH, 1, 19, 30, 50, 000000);
        System.out.println("Date sortie java8  : " + java8T);

        //      Aujourd'hui
        LocalDateTime todayT = LocalDateTime.now();
        System.out.println("Date du jour: " + todayT);
        Duration duration = Duration.between(java8T,todayT);
        long totalSeconds = duration.getSeconds();
        long totalHours = duration.toHours();
        System.out.println("il s'est écoulé au total " + totalSeconds + " secondes, ou bien encore, " + totalHours + " heures");

//        3)
        LocalDateTime date3 = LocalDateTime.of(2014, Month.MARCH, 1, 19, 30, 50, 000000);
        LocalDateTime today3 = LocalDateTime.now();
        Duration duration3 = Duration.between(date3,today3);
        long hours = duration3.toHours();
        hours = ChronoUnit.HOURS.between(date3,today3);
        Duration duration4 = Duration.between((date3.plusHours(hours)),today3);
        long minutes = duration4.toMinutes();
        minutes = ChronoUnit.MINUTES.between(date3.plusHours(hours),today3);
       // long seconds = Duration.between((date3.plusHours(hours).plusMinutes(minutes)),today3).toSeconds();
        long seconds = Duration.between(date3.plus(hours , ChronoUnit.HOURS).plus(minutes,ChronoUnit.MINUTES),today3).toSeconds();
        System.out.println("il s'est écoulé " + hours + " heures, " + minutes + " minutes et " + seconds + " secondes");

    }
}

