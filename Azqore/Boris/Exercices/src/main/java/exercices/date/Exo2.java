package exercices.date;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

/*
 ** Consigne **
 *
 * Afficher l'année, le mois et le jour de l'année du jour
 *
 *************
 *
 */
class Exo2 {

    public static void main(String[] args) {
        LocalDate today = getToday();
        System.out.println("année:" + getToday().toString());
        int year = 0;
        int month = 0;
        int day = 0;
        LocalDate ldate = today;
        year=ldate.getYear();
        month = ldate.getMonthValue();
        day=ldate.getDayOfMonth();
        System.out.println("année:" + year);
        System.out.println("mois:" + month);
        System.out.println("jour:" + day);
    }

    private static LocalDate getToday() {

        DateTimeFormatter dfornater = DateTimeFormatter
                .ofPattern("uuMMdd")
                .withLocale(Locale.ENGLISH);
        return LocalDate.now();
    }

}
