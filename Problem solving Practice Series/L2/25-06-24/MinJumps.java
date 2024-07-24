import java.util.Scanner;
class MinJumps{
static int solve(int arr[],int n){


if(arr[0] == 0 || n == 0)
	return Integer.MAX_VALUE;
int dp[] = new int[n];
dp[0] = 0;
for(int i =1;i<n;i++){
dp[i] = Integer.MAX_VALUE;
for(int j =0;j<i;j++){
if(i<=j+arr[j] && dp[j]!=Integer.MAX_VALUE){
dp[i] = Math.min(dp[i], dp[j]+1);
break;
}
}
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