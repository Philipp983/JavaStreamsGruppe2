package functionalInterface_Philipp_Thorsten;

public class ImplementationOfIFunctionalInterface {

	public static void main(String[] args) {

		// Anonymous inner class -> we only want to call the method, not
		// declaring the whole class for it!
		IFunctionalInterface result = new IFunctionalInterface() {
			@Override
			public Integer mathOperation(Integer number) {
				return number + 1;
			}
		};

		System.out.println("Used Anonymous inner class:");
		System.out.println(result.mathOperation(5));

		System.out.println("Used Lambda expression:");

		IFunctionalInterface resultLambda = n -> n + 1;

		System.out.println(resultLambda.mathOperation(8));

	}
}
