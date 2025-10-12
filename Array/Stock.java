package Array;

public class Stock {
    public static void main(String[] args) {
        int[] stocks = {7, 6, 5, 3, 6, 9};
        bestTimeToBuyAndSell(stocks);
    }

    private static void bestTimeToBuyAndSell(int[] stocks) {
        int bestBuy = stocks[0];
        int profit = 0;

        for(int i = 1; i< stocks.length; i++){
            if(stocks[i] < bestBuy){
                bestBuy = stocks[i];
            }else{
                profit = Math.max (profit, stocks[i] - bestBuy);
            }
        }
        System.out.println(profit);
    }
}
