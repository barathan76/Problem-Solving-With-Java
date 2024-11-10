import java.util.Scanner;
class LargestSubSet{
static int solve(String arr[],int m,int n){
int dp[][] = new int[m+1][n+1];
for(String s : arr){
int zero = 0,one = 0;
for(char c : s.toCharArray()){
	if(c == '0')	
		zero++;
	else
		one++;
}
for(int i = m;i>=zero;i--){
for(int j = n;j>=one;j--){
dp[i][j] = Math.max(dp[i][j],dp[i-zero][j-one]+1);
}
}
}
return dp[m][n];
}
public static void main(String args[]){
Scanner scan = new Scanner(System.in);
int l = scan.nextInt();
int m = scan.nextInt();
int n = scan.nextInt();
scan.nextLine();
String arr[] = new String[l];
for(int i =0;i<l;i++)
	arr[i] = scan.nextLine();
System.out.println(solve(arr,m,n));
}
}