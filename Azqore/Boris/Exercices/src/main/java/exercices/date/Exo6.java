package exercices.date;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

/*
 ** Consigne **
 *
 * Coder le main pour obtenir l'heure complete du jour, sans la date du jour
 *
 *************
 *
 * Resultat attendu : Heure actuelle sans la date : 10:46:20
 */
class Exo6 {

    public static void main(String[] args) {
        //assertTrue(result instanceof Localdate);

        LocalTime ltime = LocalTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("hh:mm:ss");
        String formattedTime = ltime.format(formatter);
        System.out.println("Heure actuelle sans la date :  " + formattedTime);
    }

}
