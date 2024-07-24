import java.util.Scanner;
class Pattern8{
static void print(int n,int i){

for(int j = n;j> n - i;j--)
	System.out.print(" ");
for(int j= i;j<=n;j++){
System.out.print(j+ " ");
}
System.out.println();
}
static void solve1(int i,int n){
if(i==n){
print(n,i);
return;
}
print(n,i);
solve1(i+1,n);
print(n,i);
}

static void solve2(int i,int n){
if(i == 0)
	return;
for(int j = i;j>0;j--)
	System.out.print(" ");
for(int j= i;j<=n;j++){
System.out.print(j+ " ");
}
System.out.println();
solve2(i-1,n);
}
public static void main(String args[]){
Scanner scan = new Scanner(System.in);
int n = scan.nextInt();
solve1(1,n);
}
}