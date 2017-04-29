package se.johannalynn.euler.A;

import java.math.BigInteger;

/**
 * @answer 6857
 *
 */
public class Problem003_LargestPrimeFactor {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		BigInteger nbr = new BigInteger("600851475143");
		
		for(BigInteger i = new BigInteger("2"); i.compareTo(nbr) < 0; i = i.add(BigInteger.ONE)) {
			
		}
	}

}
