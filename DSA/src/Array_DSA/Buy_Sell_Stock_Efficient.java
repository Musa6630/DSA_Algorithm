package Array_DSA;

public class Buy_Sell_Stock_Efficient {
    static int max_profit(int[] price)
    {
        int profit=0;
        for (int i = 1; i < price.length; i++) {
            if (price[i]>price[i-1])
                profit+=price[i]-price[i-1];
        }
        return profit;
    }

    public static void main(String[] args) {
        int[] price={1,5,3,8,15};
        System.out.println(max_profit(price));
    }
}
