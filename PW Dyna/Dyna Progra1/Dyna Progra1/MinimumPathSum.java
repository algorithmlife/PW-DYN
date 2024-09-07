import java.util.List;
import java.util.ArrayList;

public class MinimumPathSum {

    public static void main(String[] args) {

        List<List<Integer>> triangle = new ArrayList<>();
        triangle.add(List.of(2));
        triangle.add(List.of(3, 4));
        triangle.add(List.of(6, 5, 7));
        triangle.add(List.of(4, 1, 8, 3));

        int result = minimumTotal(triangle);

        System.out.println("Minimum path sum: " + result);
    }

    public static int minimumTotal(List<List<Integer>> triangle) {
        int n = triangle.size();

        if (n == 0) return 0;

        int[] dp = new int[n];

        for (int i = 0; i < n; i++) {
            dp[i] = triangle.get(n - 1).get(i);
        }

        for (int i = n - 2; i >= 0; i--) {
            for (int j = 0; j <= i; j++) {
                dp[j] = triangle.get(i).get(j) + Math.min(dp[j], dp[j + 1]);
            }
        }

        return dp[0];
    }
}
