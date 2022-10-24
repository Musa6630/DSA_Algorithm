package Array_DSA;

public class Buy_Sell_Stock_Naive {
    static int max_profit(int[] price, int start, int end)
    {
        if(end <= start)
            return 0;

        int profit = 0;

        for(int i = start; i < end; i++)
        {
            for(int j = i + 1; j <= end; j++)
            {
                if(price[j] > price[i])
                {
                    int curr_profit = price[j] - price[i]
                            + max_profit(price, start, i - 1)
                            + max_profit(price, j + 1, end);

                    profit = Math.max(profit, curr_profit);
                }
            }
        }

        return profit;
    }

    public static void main(String[] args) {
        int[] price={1,2,3,1,9,4,2,12,1,3,16};
        System.out.println(max_profit(price,0,10));
    }
}
