package ch.digicomp.collection;

import java.util.*;
import java.util.Map;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.

      /*  List<Country> country =  List.of(
        new Country ("FRANCE"),
        new Country("Espagne"),
        new Country("Italie"));
*/
     /*   List<Country> country = new ArrayList<>();
        country.add(new Country ("FRANCE"));
        country.add(new Country ("Espagne"));
        country.add(new Country ("Italie"));
        System.out.println("La collection créée contient " + country.size() + " pays" );

        for (Country c : country) {
            System.out.println(c.getName());
        }

        Iterator<Country> countryIterator = country.iterator();
        while(countryIterator.hasNext()) {
            System.out.println(countryIterator.next().getName());

        }
        ListIterator<Country> listIterator = country.listIterator();
        while(listIterator.hasNext()) {
            //listIterator.remove();
            listIterator.next();
            listIterator.remove();
            if (country.isEmpty()) {
                System.out.println("Liste vide");
            } else {
                for (Country c2 : country) {
                    System.out.println(c2.getName());
                }
            }

        }
        country.add(new Country ("FRANCE"));
        country.add(new Country ("Espagne"));
        country.add(new Country ("Italie"));
        System.out.println("La collection créée contient " + country.size() + " pays" );

        country.set(1,new Country("ESPAGNE"));
        for (Country c3 : country) {
            System.out.println(c3.getName());
        }

       // Collections.sort(country);

        Collections.sort(country, new CountryComparator());

        for (Country c : country) {
            System.out.println(c.getName());
        }
        // Exercice sur les set
        Set<String> colors = new HashSet<>();
        colors.add("Rouge");
        colors.add("Cyan");
        colors.add("Bleu");
        colors.add("Vert");
        System.out.println(colors);

        colors.removeIf(color -> color.equals("Rouge"));

        System.out.println(colors);

        Set<String> others = new HashSet<>();
        colors.add("Jaune");
        colors.add("Magenta");
        colors.addAll(others);
        System.out.println(others);

        System.out.println(colors);

        colors.removeIf(color -> color.equals("Vert"));

        System.out.println(colors);

        colors.removeAll(others);

        System.out.println(colors);
        System.out.println(others);*/

        // Exercice sur les maps

        Map<String, String> contact = new HashMap<>();
        contact.put("Boris", "0680000000");
        contact.put("Arthur","0607070606");
        contact.put("Thibault", "0605000005");
        contact.put("Estelle", "0700000700");

        System.out.println("Le numéro de Arthur : " + contact.get("Arthur"));

        for (Map.Entry<String, String> entry : contact.entrySet()) {
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }

        contact.replace("Boris", "0799999907");

        for (Map.Entry<String, String> entry : contact.entrySet()) {
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }

    }


}