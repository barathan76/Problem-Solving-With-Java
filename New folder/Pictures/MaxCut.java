import java.util.Scanner;
class MaxCut{
public static void main(String args[]){
Scanner scan = new Scanner(System.in);
int n = scan.nextInt();
int dp[] = new int[n+1];
dp[0] = 0;
for(int i =1;i<=n;i++){
dp[i] = Math.max(dp[i-1],i*(n-i));
}
System.out.println(dp[n]);
}
}