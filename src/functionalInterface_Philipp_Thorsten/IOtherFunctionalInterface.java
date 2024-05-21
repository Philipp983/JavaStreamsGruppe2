package functionalInterface_Philipp_Thorsten;

/**
 * Also a functional interface: it has one abstract method, but multiple
 * default methods
 */
interface IOtherFunctionalInterface {

	String stringOperation();

	default void firstDefaultMethod() {
		System.out.println("I'm a default method");
	}
	default void secondDefaultMethod() {
		System.out.println("I'm the second default method");
	}

}
