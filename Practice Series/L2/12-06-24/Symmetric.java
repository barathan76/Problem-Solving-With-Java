import java.util.Scanner;
class Symmetric{
static int solve(int low,int high){
int ans = 0;
for(int i =low;i<=high;i++){
String str = i+"";
int n = str.length();
if(n%2==1)
	continue;
int left = 0;
int right = 0;
for(int j=0;j<n/2;j++)
	left+= str.charAt(j) - '0';
for(int j = n/2;j<n;j++)
	right+=str.charAt(j) - '0';
if(left == right)
	ans++;
}
return ans;
}
public static void main(String args[]){
Scanner scan = new Scanner(System.in);
int low = scan.nextInt();
int high = scan.nextInt();
System.out.println(solve(low,high));
}
}