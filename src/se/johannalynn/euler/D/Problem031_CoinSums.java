package se.johannalynn.euler.D;

/**
 * @answer 73682
 */
public class Problem031_CoinSums {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	    int start = 200;

        //int[] coins = new int[] {1, 2, 5, 10, 20, 50};
        int[] coins = new int[] {1, 2, 5, 10, 20, 50, 100, 200};

        int[] mutations = new int[start+1];
        mutations[0] = 1; // at least one way

        for (int i = 0; i < coins.length; i++) {
            for (int j = coins[i]; j <= start; j++) {
                int tmp = mutations[j - coins[i]];
                mutations[j] += tmp;
            }
        }
        System.out.println(mutations[start]);
	}

}
