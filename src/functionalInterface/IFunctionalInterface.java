package functionalInterface;

/**
 * This is a functional interface: definition: only one abstract Method
 */
public interface IFunctionalInterface {

	Integer mathOperation(Integer number);
}


/**
 * Also a functional interface: it has one abstract method, but multiple
 * default methods
 */
interface IOtherFunctionalInterface {

	String stringOperation(String string);

	default void firstDefaultMethod() {
		System.out.println("I'm a default method");
	}
	default void secondDefaultMethod() {
		System.out.println("I'm the second default method");
	}

}
