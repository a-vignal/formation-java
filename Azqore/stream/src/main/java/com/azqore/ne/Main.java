package com.azqore.ne;

import java.sql.SQLException;
import java.text.ParseException;
import java.util.Comparator;
import java.util.Random;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args)  {
        // define the range
        int max = 20;
        int min = 0;
        int range = max - min + 1;
        // generate random numbers within 1 to 10

        IntStream stream = IntStream
                .generate(() -> { return (int)(Math.random() * range) + min; });
        stream.limit(6).sorted().forEach(System.out::println);
        IntStream stream2 = IntStream
                .generate(() -> { return (int)(Math.random() * range) + min; });
        System.out.println(stream2.limit(6).findFirst());
        IntStream stream3 = IntStream
                .generate(() -> { return (int)(Math.random() * range) + min; });
        System.out.println(stream3.limit(6).filter(s->s>3).sum());

        Random random = new Random ();
        IntStream intStream = random.ints(6,0,21);

        int[] values = intStream.toArray();
        IntStream.of(values)
                        .sorted()
                                .forEach(System.out::println);
        IntStream.of(values)
                .sorted()
                .forEach(System.out::println);
        System.out.println("Nb entier: " + IntStream.of(values).count());
        System.out.println(IntStream.of(values).filter(s->s>3).sum());
    }
}
