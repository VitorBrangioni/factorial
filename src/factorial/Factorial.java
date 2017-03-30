package factorial;

import java.math.BigInteger;

/**
 * Calculate Factorial
 * 
 * @author vitorbrangioni
 */
public class Factorial {
	
	private Factorial() {
	}

	/**
	 * Calculates factorial using recursion
	 * 
	 * @param n
	 * @param nBigInteger
	 * @return
	 */
	private static BigInteger calculateFactorial(Integer n, BigInteger nBigInteger) {
		if (n == 0 || n == 1) {
			return nBigInteger;
		}
		return calculateFactorial(n -1, nBigInteger.multiply(new BigInteger(n.toString())));
	}
	
	/**
	 * @param n
	 * @return factorial value of n
	 */
	public static BigInteger calculateFactorial(Integer n) {
		return calculateFactorial(n, new BigInteger("1"));
	}
}
