import java.util.Scanner;
class RobotMove{
static int solve(int m,int n){
int dp[][] = new int[m][n];
for(int i =0;i<m;i++)
	dp[i][0] = 1;
for(int i=0;i<n;i++)
	dp[0][i] = 1;
for(int i =1;i<m;i++){
for(int j = 1;j<n;j++){
dp[i][j] = dp[i-1][j]+dp[i][j-1];
}
}
for(int i =0;i<m;i++){
for(int j =0;j<n;j++){
System.out.print(dp[i][j]+ " ");
}
System.out.println();
}
return dp[m-1][n-1];
}
public static void main(String args[]){
Scanner scan = new Scanner(System.in);
int m = scan.nextInt();
int n = scan.nextInt();
System.out.println(solve(m,n));
}
}