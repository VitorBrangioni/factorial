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
	private static BigInteger calculateRecursiveFactorial(Integer n, BigInteger nBigInteger) {
		if (n == 0 || n == 1) {
			return nBigInteger;
		}
		return calculateRecursiveFactorial(n -1, nBigInteger.multiply(new BigInteger(n.toString())));
	}
	
	/**
	 * @param n
	 * @return factorial value of n
	 */
	public static BigInteger calculateRecursiveFactorial(Integer n) {
		return calculateRecursiveFactorial(n, new BigInteger("1"));
	}
	
	public static BigInteger calculateIterativeFactorial(Integer n) {
		BigInteger nBigInteger = new BigInteger(n.toString());
		
		while (n > 1) {
			n--;
			nBigInteger = nBigInteger.multiply(new BigInteger(n.toString()));
		}
		return nBigInteger;
	}
}
