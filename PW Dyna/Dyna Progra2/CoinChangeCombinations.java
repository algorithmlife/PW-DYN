public class CoinChangeCombinations {
    public static int combinationSum4(int amount, int[] coins) {

        int[] dp = new int[amount + 1];
        dp[0] = 1;  

        for (int i = 1; i <= amount; i++) {

            for (int coin : coins) {
                if (i >= coin) {
                    dp[i] += dp[i - coin];
                }
            }
        }

        return dp[amount];
    }

    public static void main(String[] args) {
        int amount1 = 5;
        int[] coins1 = {1, 2, 5};
        int amount2 = 3;
        int[] coins2 = {2};
        int amount3 = 10;
        int[] coins3 = {10};

        System.out.println(combinationSum4(amount1, coins1));  
        System.out.println(combinationSum4(amount2, coins2));  
        System.out.println(combinationSum4(amount3, coins3));  
    }
}
