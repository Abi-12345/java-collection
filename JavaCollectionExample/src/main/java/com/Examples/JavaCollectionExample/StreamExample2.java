package com.Examples.JavaCollectionExample;

import java.util.Arrays;
import java.util.List;

public class StreamExample2 {
    public static void main(String[] args) {
        // Display prices +12% GST in console
        List<Integer> prices = Arrays.asList(100, 200, 300, 400, 500);

        // Old way
        for (Integer p : prices) {
            Double d = p + 0.12 * p;
            System.out.println(d);
        }

        // New way
        prices.stream()
              .map(p -> p + 0.12 * p)
              .forEach(System.out::println);
    }
}
