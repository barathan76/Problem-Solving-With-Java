import java.util.Scanner;
class ThousandDot{
static String solve(int n){
String ans = "";
while(n>0){
if(ans.length() == 3)
	ans+=".";
ans+=(n%10);
n = n/10;

}

StringBuilder builder = new StringBuilder(ans);
return builder.reverse().toString();

}
public static void main(String args[]){
Scanner scan = new Scanner(System.in);
int n = scan.nextInt();
System.out.println(solve(n));
}
}