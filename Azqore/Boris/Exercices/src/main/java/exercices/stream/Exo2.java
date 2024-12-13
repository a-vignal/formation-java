package exercices.stream;

import java.util.Arrays;

/*
 ** Consigne **
 *
 * Avec les Streams, codez la méthode getTotalNumberOfLettersOfNamesLongerThanFiveWithStream afin d'avoir
 * le même comportement que getTotalNumberOfLettersOfNamesLongerThanFive
 *************
 *
 * Resultat attendu : 14
 *
 */
public class Exo2 {

    public static void main(String[] args) {
//        long value = getTotalNumberOfLettersOfNamesLongerThanFive("william", "jones", "aaron", "seppe", "frank", "gilliam");
//        System.out.println(value);
        long value2 = getTotalNumberOfLettersOfNamesLongerThanFiveWithStream("william", "jones", "aaron", "seppe", "frank", "gilliam");
        System.out.println(value2);
    }

    public static long getTotalNumberOfLettersOfNamesLongerThanFive(String... names) {
        long sum = 0;
        for (String name : names) {
            if (name.length() > 5) {
                for (int i = 0; i < name.length(); i++) {
                    if (name.charAt(i) != ' ')
                        sum++;
                }
            }
        }
        return sum;
    }

    // TODO
    public static long getTotalNumberOfLettersOfNamesLongerThanFiveWithStream(String... names) {

        return Arrays
                .stream(names)
                .map(name -> name.replaceAll(" ",""))
                .map(name -> name.length())
                .filter(l -> l > 5)
                .mapToInt(integer -> integer.intValue())
                .sum();
    }
}

