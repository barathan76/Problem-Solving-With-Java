import java.util.Scanner;
class Pattern10{
static void solve(int i,int n){
if(i>n)
	return;
boolean flag = true;
for(int j = 0;j<i;j++){
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
solve(i+1,n);
}
public static void main(String args[]){
Scanner scan = new Scanner(System.in);
int n = scan.nextInt();
solve(1,n);
}
}