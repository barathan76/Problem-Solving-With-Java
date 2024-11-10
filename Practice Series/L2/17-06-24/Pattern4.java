import java.util.Scanner;
class Pattern4{
static void print(int i,int n){
for(int j  = 2*i;j<2*n;j++)
	System.out.print(" ");
for(int j = i;j>1;j--)
	System.out.print(j+ " ");
System.out.print(1+" ");
for(int j = 2;j<=i;j++)
	System.out.print(j+" ");
System.out.println();
}
static void solve(int i,int n){

if(i == n){
	print(i,n);
	return;
}

print(i,n);
solve(i+1,n);
print(i,n);
}
public static void main(String args[]){
Scanner scan = new Scanner(System.in);
int n = scan.nextInt();
solve(1,n);
}
}