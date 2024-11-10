import java.util.Scanner;
class FlowerPot{
static int solve(int n,int a,int b){
int min = Integer.MAX_VALUE;
for(int i =0;i<n;i++){
min = Math.min(a*i*i + b*(n-i)*(n-i),min);
}
return min;
}
public static void main(String args[]){
Scanner scan = new Scanner(System.in);
int n = scan.nextInt();
int a = scan.nextInt();
int b = scan.nextInt();
System.out.println(solve(n,a,b));
}
}