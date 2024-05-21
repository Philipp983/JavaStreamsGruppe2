package ls_streams;

import java.util.stream.Stream;

public class DistinctB02 {
    public static void main(String[] args) {
        Items[] items = {
                new Items("Coffee", 20),
                new Items("Milk", 40),
                new Items("Bread", 20),
                new Items("Coffee", 20)  // Duplicate item for testing
        };

        // Use the distinct method to remove duplicate items
        Stream.of(items)
                .distinct()
                .forEach(System.out::println);
    }
}
