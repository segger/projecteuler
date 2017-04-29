package se.johannalynn.euler.A;

/**
 * @answer 4613732
 *
 */
public class Problem002_FibonacciNumbers {

	public static void main(String[] args) {
		int max = 4000000;
		int sum = 0;
		int term1 = 1, term2 = 1;
		int next = term1 + term2;
		while(next < max) {
			if(next % 2 == 0) {
				sum += next;
			}
			term1 = term2;
			term2 = next;
			next = term1 + term2;
		}
		System.out.println(sum);
	}

}
