import java.util.Scanner;
class Pattern7{
static void solve(int i,int n,boolean condition){
if(i>n)
	return;
boolean flag = condition;
for(int j = 1;j<=n;j++){
if(flag){
	System.out.print(1+" ");
	flag = false;
}
else{
	System.out.print(0+" ");
	flag = true;
}
}
System.out.println();
if(condition)
	solve(i+1,n,false);
else
	solve(i+1,n,true);
}
public static void main(String args[]){
Scanner scan = new Scanner(System.in);
int n = scan.nextInt();
solve(1,n,true);
}
}