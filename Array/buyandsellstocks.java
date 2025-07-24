

import java.util.Scanner;

public class buyandsellstocks {
    // best time to  buys and sell stocks problem (I)
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        int minPrice = Integer.MAX_VALUE;
        for (int price : prices) {
            // Update the minimum price if the current price is lower
            if (price < minPrice) {
                minPrice = price;
            }
            // Calculate profit if we sell at the current price
            int profit = price - minPrice;
            // Update max profit if the current profit is greater
            if (profit > maxProfit) {
                maxProfit = profit;
            }
        }
        return maxProfit;
    }

     // best time to  buys and sell stocks problem (II)
    public int maxProfitB(int[] prices) {
        int maxProfit = 0;
        for (int i = 1; i < prices.length; i++) {
            // If the current price is greater than the previous price, add to profit
            if (prices[i] > prices[i - 1]) {
                maxProfit += prices[i] - prices[i - 1];
            }
        }
        return maxProfit;
    }
    
    // best time to  buys and sell stocks problem (III)
    public int maxProfitC(int[] prices) {
        int n = prices.length;
        if (n < 2) return 0; // No profit possible with less than 2 prices
        int[] leftProfits = new int[n];
        int[] rightProfits = new int[n];
        int minPrice = prices[0];
        for (int i = 1; i < n; i++) {
            minPrice = Math.min(minPrice, prices[i]);
            leftProfits[i] = Math.max(leftProfits[i - 1], prices[i] - minPrice);
        }
        int maxPrice = prices[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            maxPrice = Math.max(maxPrice, prices[i]);
            rightProfits[i] = Math.max(rightProfits[i + 1], maxPrice - prices[i]);
        }
        int maxProfit = 0;
        for (int i = 0; i < n; i++) {
            maxProfit = Math.max(maxProfit, leftProfits[i] + rightProfits[i]);
        }
        return maxProfit;
    }


    public static void main(String[] args) {
        buyandsellstocks solution = new buyandsellstocks();
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of days: ");
        int n = sc.nextInt();
        int[] prices = new int[n];
        System.out.print("Enter the stock prices for each day:");
        for (int i = 0; i < n; i++) {
            prices[i] = sc.nextInt();
        }
        // Example usage for maxProfit I
        System.out.println("Max Profit I: " + solution.maxProfit(prices));
        // Example usage for maxProfit II
        // Uncomment the line below to test maxProfit II
        System.out.println("Max Profit II: " + solution.maxProfitB(prices));
        // Example usage for maxProfit III
        System.out.println("Max Profit III: " + solution.maxProfitC(prices));
        sc.close();
    }
}
