import java.util.Scanner;
class Q1{
static int solve(int n){
	
	int dp[] = new int[n+1];
	dp[0]= 0;
	dp[1] = 1;
	for(int i =2;i<=n;i++){
	int c = i/2;
	int rem = i%2;
	if(rem !=0)
		dp[i] = dp[c]+dp[c+1];
	else
		dp[i] = dp[c];
	}
	int max = 0;
	for(int i =0;i<=n;i++){
		System.out.print(dp[i]+" ");
		max = Math.max(max,dp[i]);
	}
	System.out.println();
	return max;
 }
public static void main(String args[]){
Scanner scan = new Scanner(System.in);
int n = scan.nextInt();
System.out.println(solve(n));
}
}