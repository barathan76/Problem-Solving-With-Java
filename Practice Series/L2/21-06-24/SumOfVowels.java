import java.util.Scanner;
class SumOfVowels{
static boolean isVowel(char c){
if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U')
	return true;
else 
	return false;
}
static int solve(String str){
int n = str.length();
int dp[][] = new int[n][n+1];
int sum = 0;
for(int i =0;i<n;i++){
for(int j = i+1;j<=n;j++){
if(isVowel(str.charAt(j-1))){
	dp[i][j] = 1+dp[i][j-1];
}
else
	dp[i][j] = dp[i][j-1];

sum+=dp[i][j];
}
}
for(int a[] : dp){
for(int  i: a)
	System.out.print(i+ " ");
System.out.println();
}
return sum;
}
public static void main(String args[]){
Scanner scan = new Scanner(System.in);
String str = scan.nextLine();
System.out.println(solve(str));
}
}