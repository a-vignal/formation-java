package exercices.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static java.util.Arrays.asList;

/*
 ** Consigne **
 *
 * Avec les Streams, codez getStringWithStream
 * Elle devra avoir le même comportement que getString
 *
 *************
 *
 * Resultat attendu :
 * i3,p44
 * i3
 */
public class Exo10 {

    public static void main(String[] args) {
        List<Integer> values1 = asList(3, 44);
        List<Integer> values2 = asList(3);

        String result1 = getString(values1);
        System.out.println(result1);

        String result2 = getString(values2);
        System.out.println(result2);
    }

    public static String getString(List<Integer> list) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < list.size(); i++) {
            int element = list.get(i);
            if (element % 2 == 0) {
                sb.append('p').append(element);
            } else {
                sb.append('i').append(element);
            }
            if (i < list.size() - 1) sb.append(',');
        }
        return sb.toString();
    }

    //TODO
    public static String getStringWithStream(List<Integer> list) {
        int element = 2;
        if(element %2 == 0){

        }
        return list.stream()
                .map(number -> switch(number % 2){
                    case 0 -> "p" + number;
                    default -> "i" + number;
                    })
                .collect(Collectors.joining(","));
        /*

        return list.stream()
                .map(number -> (number % 2 ==0) ? "p" + number : "i" + number)
                .collect(Collectors.joining(","));

        return list.stream()
                .map(number -> {
                            if (number % 2 == 0) {
                                return "p" + number;
                            } else {
                                return "i" + number;
                            }
                        })
                .collect(Collectors.joining(","));


*/

     //           .collect(() -> new StringBuilder(), (sb, s) -> sb.append(";");
    }

}

