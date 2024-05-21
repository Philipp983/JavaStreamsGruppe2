package implementedfunctionalinterfaces;

import java.util.Arrays;
import java.util.List;

public class StreamExample {
	public static void main(String[] args) {

		List<Integer> numbers = Arrays.asList(1,2,3,4,5,6);

		numbers.stream()
				// Hover over Map: it is a Function
				.map(n -> n * 2)
				// Hover over filter: it is a Predicate
				.filter(n -> n % 2 == 0)
				// Hover over forEach: it is a Consumer
				.forEach(System.out::println);

	}
}
