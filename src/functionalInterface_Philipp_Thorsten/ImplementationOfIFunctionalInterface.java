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
		System.out.println(result);
		System.out.println(result.mathOperation(5));



		System.out.println("Used Lambda expression:");
		IFunctionalInterface resultLambda = n -> n + 1;
		System.out.println(resultLambda.mathOperation(8));



		System.out.println("Lambda with no input parameter");
		IOtherFunctionalInterface stringResult = () -> "Here is your String";
		System.out.println(stringResult.stringOperation());


		System.out.println("Lambda with two parameters");
		ITwoParameterInterface twoParameterResult = (n, m) -> (n + 1) * (m + 5);
		System.out.println(twoParameterResult.computeWithTwoParameters(3, 8));


		System.out.println("Boolean validation using lambda");
		IBooleanReturnInterface resultBooleanInterface = (n, m) -> {
			try {
				return Integer.parseInt(n) == m;
			} catch (Exception e) {
				e.printStackTrace();
			}
			return false;
		};
		System.out.println(resultBooleanInterface.booleanReturnInterface("5", 5));

	}
}
