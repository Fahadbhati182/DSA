package Arrays;

public class BestTimeToBuyAndSellStock {

  public static int maxProfitOne(int[] prices) {
    // LeetCode 121 (single transaction) → You can only buy once and sell once.
    // → Answer = max single profit (e.g., 5 in your first code).

    int maxProfit = 0;
    int bestBuy = prices[0];

    for (int i = 0; i < prices.length; i++) {
      if (prices[i] > bestBuy) {
        maxProfit = Math.max(maxProfit, prices[i] - bestBuy);
      }
      bestBuy = Math.min(bestBuy, prices[i]);
    }

    return maxProfit;

  }

  public static int maxProfitTwo(int[] prices) {
    // LeetCode 122 (multiple transactions) → You can buy and sell as many times as
    // you want, as long as you don’t hold more than one stock at a time.
    // → Answer = sum of all profitable trades.

    // We don’t add 3 - 1 separately because that profit is already included when we
    // do the bigger jump 1 → 5.
    int Profit = 0;
    int bestBuy = prices[0];

    for (int i = 1; i < prices.length; i++) {
      if (prices[i] > prices[i - 1]) {
        Profit += prices[i] - prices[i - 1];
      }
      bestBuy = Math.min(bestBuy, prices[i]);
    }

    return Profit;

  }

  public static void main(String[] args) {
    int[] arr = { 7, 1, 5, 3, 6, 4 };
    int n = maxProfitTwo(arr);
    System.out.println(n);
    
  }
}
