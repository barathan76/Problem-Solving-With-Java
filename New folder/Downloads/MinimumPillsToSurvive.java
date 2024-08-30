import java.util.Scanner;
import java.util.Arrays;
public class MinimumPillsToSurvive {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input number of test cases
        int testCases = scanner.nextInt();

        for (int t = 0; t < testCases; t++) {
            // Input number of pills and initial health for each test case
            int n = scanner.nextInt();
            int v = scanner.nextInt();

            // Input characteristic values of pills
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = scanner.nextInt();
            }

            // Initialize dp array to store minimum pills needed to survive until day i
            int[] dp = new int[v + 1];
            Arrays.fill(dp, Integer.MAX_VALUE - 1); // Initialize with a value less than Integer.MAX_VALUE
            dp[0] = 0; // Base case

            // Iterate through each pill
            for (int i = 0; i < n; i++) {
                // Update dp array for each possible health value
                for (int j = a[i]; j <= v; j++) {
                    dp[j] = Math.min(dp[j], dp[j - a[i]] + 1);
                }
            }

            // If dp[v] is still Integer.MAX_VALUE - 1, it means it's not possible to reach the initial health
            int minPills = dp[v] == Integer.MAX_VALUE - 1 ? -1 : dp[v];
            System.out.println(minPills);

        }
    }
}
