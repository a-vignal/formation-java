package exercices.date;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Locale;

/*
 ** Consigne **
 *
 * Coder getTodayWithJava8 pour obtenir la date du jour en Java 8, avec le temps.
 *
 *************
 *
 * Resultat attendu : Date d'aujourd'hui :Thu Nov 25 10:46:20 CET 2021
 */
class Exo1 {

    public static void main(String[] args) {
        Object today = getTodayWithJava8();
        System.out.println("Date d'aujourd'hui :" + today.toString());
    }

    public static Date getToday() {
        // Creating Date Object
        Date dateOne = new Date();

        // Creating Instant object
        Instant inst = Instant.now();
        return Date.from(inst);
    }
    public static Object getTodayWithJava8() {
        DateTimeFormatter dfornater = DateTimeFormatter
                .ofPattern("E MMM d")
                .withLocale(Locale.ENGLISH);
        return LocalDateTime.now().format(dfornater);

    }
    // TODO
//    public static Date getTodayWithJava8() {
//        return new Date();
//    }
}
