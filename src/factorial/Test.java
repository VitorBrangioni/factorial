package factorial;

import java.math.BigInteger;

public class Test {

	private static BigInteger calculateFactorial;

	public static void main(String[] args) {
		calculateFactorial = Factorial.calculateFactorial(30000);
		System.out.println(calculateFactorial.toString() + "\n");
	}

}
