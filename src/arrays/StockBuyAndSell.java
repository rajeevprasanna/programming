package arrays;

public class StockBuyAndSell {

	public static void main(String[] args) {

		int[] a = { 100, 180, 260, 310, 40, 535, 695 };
		// We have to pick two days with maximum difference and left value is
		// more than right value.
		int bestSell = a[0];
		int bestBuy = a[0];

		int tempBuy = a[0];
		int tempSell = a[0];

		for (int i = 1; i < a.length; i++) {
			if (a[i] > tempSell) {
				tempSell = a[i];
			} else if (a[i] <= tempBuy) {
				tempBuy = a[i];
				if ((tempSell - tempBuy) > (bestSell - bestBuy)) {
					bestSell = tempSell;
					bestBuy = tempBuy;
				}
			}
		}
		System.out.println("BestSell and besBuy prices are : " + bestSell
				+ "  " + bestBuy);
	}
}
