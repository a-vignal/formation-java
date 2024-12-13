package exercices.date;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
/*
 ** Consigne **
 *
 * Convertissez la date du jour en chaine de caractère et affichez la comme : 2020/11/25 10:30:57
 * Puis, reconvertissez cette chaine en date du jour, et affichez la comme : 2020-11-25
 *
 * ASTUCE : Vous devez utiliser le pattern suivant : yyyy/MM/dd HH:mm:ss
 *
 *************
 *
 * Resultat attendu :
 */
class Exo13 {

    public static void main(String[] args) {
        LocalDateTime date = LocalDateTime.now();
        String dateStr = date.format(DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss"));
        LocalDate dateInDate = LocalDate.parse(dateStr,DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss"));

        System.out.println("La Date en string:    " + dateStr);

        System.out.println("La Date en type date: " + dateInDate);
    }
}

