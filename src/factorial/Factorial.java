package factorial;

import java.math.BigInteger;

public class Factorial {
	
	private static BigInteger result = new BigInteger("1");
	
	private Factorial() {
	}

	// @TODO
	public static String calculateFactorial(Integer n) {
		BigInteger nBigInteger = new BigInteger(n.toString());
		
		if (n == 0) {
			return result.toString();
		}
		result = result.multiply(nBigInteger);
		
		
		return null;
	}
}
