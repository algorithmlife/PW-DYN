import java.util.Scanner;

public class ClimbingStairs {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of stairs (n): ");
        int n = scanner.nextInt();
        System.out.print("Enter the maximum steps at a time (m): ");
        int m = scanner.nextInt();

        int result = countWays(n, m);

        System.out.println("Number of ways to reach the top: " + result);
    }

    public static int countWays(int n, int m) {

        if (n == 0) return 1;

        int[] dp = new int[n + 1];
        dp[0] = 1;

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= m; j++) {
                if (i - j >= 0) {
                    dp[i] += dp[i - j];
                }
            }
        }

        return dp[n];
    }
}
