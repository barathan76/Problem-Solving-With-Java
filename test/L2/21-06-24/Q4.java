import java.util.Scanner;
class Q4{
static int solve(int arr[][],int n) {
	int dp[] = new int[n];
	dp[0] = 0;
	for(int i =1;i<n;i++){
		if(arr[i][0] == arr[i-1][1])
			dp[i] = dp[i-1];
		else
			dp[i] = 1+dp[i-1];
	}
	return dp[n-1];
}
public static void main(String args[]){
Scanner scan = new Scanner(System.in);
int n = scan.nextInt();
int arr[][] = new int[n][2];
for(int i =0;i<n;i++){
	arr[i][0] = scan.nextInt();
	arr[i][1] = scan.nextInt();
}
System.out.println(solve(arr,n));
}
}