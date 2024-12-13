package ch.digicomp.collection;

import java.util.Comparator;

public class CountryComparator implements Comparator<Country> {

        public int compare(Country c1, Country c2) {
        // Compare Country based on their names
        return c1.getName().compareTo(c2.getName());
    }
}
