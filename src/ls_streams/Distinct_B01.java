package ls_streams;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Distinct_B01 {


        public static void main(String[] args) {
            // Create a list of integers with duplicates
            List<Integer> numbers = Arrays.asList(1, 2, 2, 3, 4, 4, 5, 6, 7, 8, 8, 9, 10);

            // Use the distinct method to remove duplicates
            List<Integer> distinctNumbers = numbers.stream()
                    .distinct()
                    .collect(Collectors.toList());


            distinctNumbers.forEach(n->System.out.print(" "+n));
        }
    }


