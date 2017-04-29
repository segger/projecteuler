package se.johannalynn.euler.helpers;

import java.util.ArrayList;
import java.util.List;

public class PrimeFactors {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int nbr = 44;
		
		List<Integer> primes = new ArrayList<Integer>();
		
		int n = nbr;
		int max = (int)Math.sqrt(n) + 1;
		for(int i = 2; i <= max; i++) {
			while(n%i == 0) {
				primes.add(i);
				n /= i;
			}
		}
		
		for(int primefactor : primes) {
			System.out.print(primefactor + " ");
		}
	}
}
