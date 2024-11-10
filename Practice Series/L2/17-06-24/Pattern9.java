import java.util.Scanner;
class Pattern9{
static void print(int i,int k){
for(int j= i;j<i+k;j++)
	System.out.print((char) j+ " ");
System.out.println();
}
static void solve(int i,int n,int k){
if(k == 0)
	return;
print(i,k);
solve(i,n,k-1);
print(i,k);
}
public static void main(String args[]){
Scanner scan = new Scanner(System.in);
int n = scan.nextInt();
solve('A',n,n);
}
}