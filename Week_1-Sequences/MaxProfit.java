public class MaxProfit {
    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};
        System.out.println(MaxProfitSolution(prices));
    }

    public static int MaxProfitSolution(int[] prices) {
        int max = Integer.MAX_VALUE;
        int optimal = 0;
        
        for(int i: prices) {
            if(i < max) {
                max = i;
            }
            optimal = (int) Math.max(optimal, i-max);
        }
        return optimal;
    }
}
