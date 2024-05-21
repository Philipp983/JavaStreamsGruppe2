package implementedfunctionalinterfaces_Yasin_Osama;

import java.util.function.BiFunction;
import java.util.function.Function;

public class _Function {
	public static void main(String[] args) {
		// Function takes 1 argument and gives 1 result
		int increment = increment(1);
		System.out.println(increment);


		Integer increment2 = incrementByOneFunction.apply(1);
		System.out.println(increment2);

		int multiply = multiplyByTenFunction.apply(increment2);
		System.out.println(multiply);

		Function<Integer, Integer> addBy1AndThenMultiplyBy10 = incrementByOneFunction.andThen(multiplyByTenFunction);

		System.out.println(addBy1AndThenMultiplyBy10.apply(4));

		// BiFunction takes two argument and produces 1 result
		System.out.println(incrementByOneAndMultilpy(4, 100));

	}

	static Function<Integer, Integer> incrementByOneFunction = number -> ++number;

	static Function<Integer, Integer> multiplyByTenFunction = number -> number * 10;

	static int increment (int number) {
		return number + 1;
	}

	BiFunction<Integer, Integer, Integer> incrementByOneAndMultiplyBiFunction =
			(numberToIncrementByOne, numberToMultiplyBy) -> (numberToIncrementByOne + 1) * numberToMultiplyBy;

	static int incrementByOneAndMultilpy (int number, int numToMultiplyBy) {
		return (number + 1) * numToMultiplyBy;
	}
}
