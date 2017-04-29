package se.johannalynn.euler.helpers;

import java.util.ArrayList;
import java.util.List;

public class ProperDivisors {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int nbr = 44;
		
		List<Integer> divisors = new ArrayList<Integer>();
		
		int n = nbr;
		for(int i = 2; i <= nbr; i++) {
			if(n%i == 0) {
				divisors.add(i);
			}
		}
		
		for(int divisor : divisors) {
			System.out.print(divisor + " ");
		}
	}
}
