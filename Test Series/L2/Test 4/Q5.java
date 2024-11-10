/*5:32 - 5:39*/
import java.util.Scanner;
class Q5{
	
	
static int getSum(int n){

if(n>=1 && n<=9)
	return n;

return (n%10)+ getSum(n/10);
	
}
static int solve(int n){
	
if(n >=1 && n<9)
	return n;

return solve(getSum(n));


}
public static void main(String args[]){
Scanner scan = new Scanner(System.in);
int n = scan.nextInt();
System.out.println(solve(n));
}
}