package se.johannalynn.euler.helpers;

public class Fibonacci {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int N = 1000;
		System.out.println("Fibonacci up to " + N);
		fibonacciRecursion(N);
		fibonacciLoop(N);
	}

	private static void fibonacciRecursion(int max) {
		for(int i = 1; i <= max; i++) {
			System.out.println(fibonacci(i));
		}
	}
	
	private static int fibonacci(int nbr) {
		if(nbr <= 2) return 1;
		return fibonacci(nbr-1) + fibonacci(nbr-2);
	}
	
	private static void fibonacciLoop(int max) {
		int term1 = 1;
		int term2 = 2;
		System.out.println(term1);
		System.out.println(term2);
		
		for(int i = 3; i <= max; i++) {
			int next = term1 + term2;
			term1 = term2;
			term2 = next;
			System.out.println(next);
		}
	}
}
