import java.util.Scanner;
class Q2{
static int solve(int arr[],int n){
	if(n<3)
		return 0;
	int dp[] = new int[n];
	dp[0]= 1;
	int diff = arr[1] - arr[0];
	for(int i =1;i<n;i++){
		if(arr[i] - arr[i-1] == diff)
			if(i-0>=3){
			dp[i] = dp[i-1]*i;
		}
		else
			dp[i] = dp[i-1];
	}
	return dp[n-1];
 }
public static void main(String args[]){
Scanner scan = new Scanner(System.in);
int n = scan.nextInt();
int arr[] = new int[n];
for(int i =0;i<n;i++)
	arr[i] = scan.nextInt();
System.out.println(solve(arr,n));
}
}