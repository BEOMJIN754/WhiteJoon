import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        scanner.close();

        if (N == 1) {
            System.out.println(1);
            return;
        }

        long[] dp = new long[N + 1]; 
        dp[1] = 1;
        dp[2] = 1;

      
        for (int i = 3; i <= N; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }

        System.out.println(dp[N]);
    }
}
