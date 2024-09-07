import java.util.Scanner;

public class Tribonacci {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the index n for the Tribonacci number: ");
        int n = scanner.nextInt();

        int result = tribonacci(n);

        System.out.println("The " + n + "th Tribonacci number is: " + result);
    }

    public static int tribonacci(int n) {

        if (n == 0) return 0;
        if (n == 1 || n == 2) return 1;

        int t0 = 0, t1 = 1, t2 = 1;
        int tn = 0;

        for (int i = 3; i <= n; i++) {
            tn = t0 + t1 + t2;  
            t0 = t1;            
            t1 = t2;            
            t2 = tn;         
        }

        return tn;
    }
}
