import java.util.Scanner;
class MaxJump{
static int solve(int arr[],int n){
int dp[] = new int[n];
if(n == 0 || arr[0] == 0)
	return -1;
dp[0] = 0;
for(int i =1;i<n;i++){
dp[i] = Integer.MAX_VALUE;
for(int j =0;j<i;j++){
if(i<=j+arr[j] && dp[j]!=Integer.MAX_VALUE){
	dp[i] = Math.min(dp[i],dp[j]+1);
	break;}	
}
}
return dp[n-1];
}
public static void main(String args[]){
Scanner scan = new Scanner(System.in);
System.out.print("Enter the size of the array : ");
int n =scan.nextInt();
System.out.println("Enter the array elements ");
int arr[] = new int[n];
for(int i =0;i<n;i++)
	arr[i] = scan.nextInt();
System.out.println(solve(arr,n));
}
}