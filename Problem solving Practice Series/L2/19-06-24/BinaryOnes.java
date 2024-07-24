import java.util.Scanner;
class BinaryOnes{
static int solve(int n){
if(n == 1 || n == 0)
	return n;
if(n%2 == 1)
	return 1+solve(n/2);
return solve(n/2);

}
public static void main(String args[]){
Scanner scan = new Scanner(System.in);
int n = scan.nextInt();
System.out.println(solve(n));
}
}