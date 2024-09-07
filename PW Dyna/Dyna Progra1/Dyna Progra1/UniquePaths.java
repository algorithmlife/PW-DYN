import java.util.Scanner;

public class UniquePaths {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of rows (m): ");
        int m = scanner.nextInt();
        System.out.print("Enter the number of columns (n): ");
        int n = scanner.nextInt();

        int result = uniquePaths(m, n);
        
        System.out.println("Number of unique paths: " + result);
    }

    public static int uniquePaths(int m, int n) {

        int[][] dp = new int[m][n];


        for (int i = 0; i < m; i++) {
            dp[i][n - 1] = 1; 
        }
        for (int j = 0; j < n; j++) {
            dp[m - 1][j] = 1; 
        }

        for (int i = m - 2; i >= 0; i--) {
            for (int j = n - 2; j >= 0; j--) {
                dp[i][j] = dp[i + 1][j] + dp[i][j + 1];
            }
        }

        return dp[0][0];
    }
}

