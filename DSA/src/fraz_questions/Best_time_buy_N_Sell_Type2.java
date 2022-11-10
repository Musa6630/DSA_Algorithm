package fraz_questions;

public class Best_time_buy_N_Sell_Type2 {
    public static int maxProfit2(int[] prices) {

        int profit=0;
        for(int i=1; i<prices.length; i++)
        {
            if(prices[i]>prices[i-1])
            {
                profit=profit+(prices[i]-prices[i-1]);
            }
        }
        return profit;
    }

    public static void main(String[] args) {
        int[] prices={7,1,5,3,6,4};
        System.out.println(maxProfit2(prices));
    }
}
