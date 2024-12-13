package exercices.date;

import java.time.LocalDate;
import java.time.LocalDateTime;

/*
 ** Consigne **
 *
 * Votre avion décolle dans 3 jours et 5h. Affichez la date et l'horaire de décollage
 *
 *************
 *
 * Resultat attendu :
 */
class Exo7 {

    public static void main(String[] args) {
        Object departure = null;
        LocalDateTime date2 = LocalDateTime.now();
        System.out.println("Date du jour: " + date2);
        LocalDateTime dep = date2.plusDays(3).plusHours(5);
        System.out.println("Date et heure exacte du décollage :" + dep.toString());

    }

}
