package implementedfunctionalinterfaces_Yasin_Osama;

import java.util.function.Predicate;

public class _Predicate {
	public static void main(String[] args) {

		System.out.println("Without predicate");
		System.out.println(isPhoneNumberValid("07000000000000"));
		System.out.println(isPhoneNumberValid("0700000000"));
		System.out.println(isPhoneNumberValid("09000000000000"));

		System.out.println("With predicate");
		isPhoneNumberValidPredicate.test("07000000000000");
		isPhoneNumberValidPredicate.test("07000000000");
		isPhoneNumberValidPredicate.test("09000000000000");

		System.out.println(
				"Is phone number valid and contains number 3 = " +
				isPhoneNumberValidPredicate.and(containsNumber3Predicate).test("073000000000")
		);
		System.out.println(
				"Is phone number valid and contains number 3 = " +
				isPhoneNumberValidPredicate.and(containsNumber3Predicate).test("070000000000")
		);

	}

	static boolean isPhoneNumberValid (String phoneNumber) {
		return phoneNumber.startsWith("07") && phoneNumber.length() >= 11;
	}

	static Predicate<String> isPhoneNumberValidPredicate = phoneNumber ->
			phoneNumber.startsWith("07") && phoneNumber.length() >= 11;

	static Predicate<String> containsNumber3Predicate = phoneNumber ->
			phoneNumber.contains("3");
}
