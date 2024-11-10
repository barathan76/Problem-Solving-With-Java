import java.util.Scanner;
class Pattern3{
static void solve(int n,int i,int k){
if(i>n)
	return;

for(int j = i;j<i+k;j++)
	System.out.print(j+" ");
System.out.println();
solve(n,i+k,k+1);
}
public static void main(String args[]){
Scanner scan = new Scanner(System.in);
int n = scan.nextInt();
solve(n,1,1);
}
}