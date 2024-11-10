import java.util.Scanner;
class Pattern1{
static void print(String str,int i,int n){
for(int j =0;j<i;j++)
	System.out.print(" ");
System.out.println(str.charAt(i)+" "+str.charAt(n));
}
static void solve(String str,int i,int n){
if(i == n){
for(int j =0;j<i;j++)
	System.out.print(" ");
System.out.println(str.charAt(i));
return;
}

print(str,i,n);
solve(str,i+1,n-1);
print(str,i,n);
}

public static void main(String args[]){
Scanner scan = new Scanner(System.in);
String str = scan.nextLine();
if(str.length()%2==0)
	System.out.println("Pattern can't be generated");
else
	solve(str,0,str.length()-1);
}
}