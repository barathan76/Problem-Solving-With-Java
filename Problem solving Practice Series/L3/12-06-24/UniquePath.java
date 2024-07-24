import java.util.Scanner;

class UniquePath{
static int solve(String str){
int n =str.length();
int dp[] = new int[n];
dp[n-1] = 1;
int freq[] = new int[26];
freq[str.charAt(n-1) - 'a'] = 1;
for(int i = n-2;i>=0;i--){
if(str.charAt(i) == str.charAt(i+1)-1 || str.charAt(i) == 'z' && str.charAt(i+1) == 'a')
	dp[i] = 1+dp[i+1];
else
	dp[i] = 1;
int k = str.charAt(i) - 'a';
freq[k] = Math.max(freq[k],dp[i]);
}
int count =0;
for(int i  =0;i<26;i++)
	count+=freq[i];
return count;
}
public static void main(String args[]){
Scanner scan = new Scanner(System.in);
String str = scan.nextLine();
System.out.println(solve(str));
}
}