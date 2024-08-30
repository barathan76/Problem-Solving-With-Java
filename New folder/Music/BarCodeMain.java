import java.util.*;

public class BarCodeMain {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        scanner.nextLine(); // move to next line

        char[][] pixels = new char[n][m];
        for (int i = 0; i < n; i++) {
            String line = scanner.nextLine();
            pixels[i] = line.toCharArray();
        }

        // DP array initialization
        int[][] dp = new int[m + 1][2];
        final int INF = 1000000000;
        Arrays.fill(dp[0], INF);
        dp[0][0] = 0;
        dp[0][1] = 0;

        // DP table computation
        for (int i = 1; i <= m; i++) {
            for (int len = x; len <= y; len++) {
                if (i - len >= 0) {
                    // Check if segment from i-len+1 to i can be all white or all black
                    int whiteCount = 0;
                    int blackCount = 0;
                    for (int k = i - len; k < i; k++) {
                        if (pixels[k][i - 1] != '.') whiteCount++;
                        if (pixels[k][i - 1] != '#') blackCount++;
                    }
                    // Update dp[i][0] (for all white)
                    dp[i][0] = Math.min(dp[i][0], dp[i - len][1] + whiteCount);
                    // Update dp[i][1] (for all black)
                    dp[i][1] = Math.min(dp[i][1], dp[i - len][0] + blackCount);
                }
            }
        }

        // The answer is the minimum of dp[m][0] and dp[m][1]
        int result = Math.min(dp[m][0], dp[m][1]);
        System.out.println(result);

        scanner.close();
    }
}
