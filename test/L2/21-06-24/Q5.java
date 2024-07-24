import java.util.Scanner;
class Q5{
static int solve(String str){
	int dp[] = new int[str.length()];
	dp[str.length()-1] = 1;
	int k = 1;
	for(int i =str.length()-2;i>=0;i--){
		if(str.charAt(i+1)-str.charAt(i) == 1 || str.charAt(i+1)-str.charAt(i)+26 == 1){
			dp[i] = (++k) * dp[i+1];
		}
		else if(str.charAt(i)<str.charAt(i+1)){
			k = 1;
			dp[i] = 1+dp[i+1];
		}
			
		else
			dp[i] = dp[i+1];
		}
	return dp[0];
	}

public static void main(String args[]){
Scanner scan = new Scanner(System.in);
String str = scan.nextLine();
System.out.println(solve(str));
}
}