import java.util.Scanner;
class Pattern{
static void solve(String str,int i,int n){
if(i == n+1){
return;
}
for(int j = 0;j<n-i;j++)
	System.out.print(" ");
for(int j =0;j<i;j++)
	System.out.print(str.charAt(j));
System.out.println();
solve(str,i+1,n);
}
public static void main(String args[]){
Scanner scan = new Scanner(System.in);
String str = scan.nextLine();
solve(str.substring(str.length()/2,str.length())+str.substring(0,str.length()/2),1,str.length());
}
}