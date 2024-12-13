package exercices.date;

import java.time.Clock;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.LocalTime;

/*
 ** Consigne **
 *
 * Au sein d'un projet complexe, nous souhaitons récupérer le timestamp actuel du système, basé sur la zone UTC.
 * Nous souhaiterons afficher celui-ci, avec également, le timestamp par défault sans sa zone UTC
 *
 * ASTUCE : Vous devez utiliser la classe Clock et Instant
 *
 *************
 *
 * Resultat attendu :
 */
class Exo9 {

    public static void main(String[] args) {
        Clock clock = Clock.systemUTC();
        Instant now = Clock.systemUTC().instant();
        System.out.println("Timestamp UTC : " + clock.instant());
        System.out.println("Timestamp now : " + now);
        Object defaultClock = Clock.systemDefaultZone().instant();
        System.out.println("Timestamp basé sur la zone du Système : " + defaultClock);
    }

}
