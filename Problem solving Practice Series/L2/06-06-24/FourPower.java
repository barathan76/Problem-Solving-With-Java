import java.util.Scanner;
class Power{
static boolean solve(int n,int p){
if(n == 1)
	return true;
if(n <= 0 )
	return false;

while(n>=p){
if(n == p)
	return true;
n/=p;
}

return false;

}
public static void main(String args[]){
Scanner scan = new Scanner(System.in);
int n = scan.nextInt();
int p = scan.nextInt();
System.out.println(solve(n,p));
}
}