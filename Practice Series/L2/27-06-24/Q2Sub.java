import java.util.Scanner;
class Q2Sub{
static int solve(String str,int n){
int dp[] = new int[n];
dp[0] = 0;
int k = 2;
int count = 0;
while(k <= n){
System.out.println(k+":"+count);
char i = str.charAt(0);
char j = str.charAt(k-1);
if(i == j && i == '1')
	count++;
for(int l =1;l<n-k+1;l++){

i = str.charAt(l);
j = str.charAt(l+k-1);
if(i == j && i == '1')
	count++;
}
k++;
}
return count;
}
public static void main(String args[]){
Scanner scan = new Scanner(System.in);
int n = scan.nextInt();
scan.nextLine();
String str = scan.nextLine();
System.out.println(solve(str,n));
}
}