import java.util.Scanner;
class Pattern2{

static void print(int a,int n,int c){
int k = 0;
for(int j = 0;j<n;j++){
System.out.print(a+" ");
if(k<c){
a--;
k++;
}
}
k = 2*n -n - 1;
for(int j =n;j<2*n-1;j++){
if(k<=c){
a++;
}
System.out.print(a+" ");
k--;
}
System.out.println();
}
static void solve(int a,int j,int n){
if(j == n-1){
print(a,n,j);
return;
}
print(a,n,j);
solve(a,j+1,n);
print(a,n,j);
}


public static void main(String args[]){
Scanner scan = new Scanner(System.in);
int n = scan.nextInt();
solve(n,0,n);
}
}