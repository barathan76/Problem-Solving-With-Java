import java.util.Scanner;
class UglyNumber{
static boolean solve(int n){
if(n == 0)
	return false;
if(n == 1)
	return true;
while(n>1){
if(n%2==0)
	n = n/2;
else if(n%3 == 0)
	n = n/3;
else if(n%5 == 0)
	n = n/5;
else
	break;
}
if(n == 1)
	return true;
else 
	return false;
}

public static void main(String args[]){
Scanner scan = new Scanner(System.in);
int n = scan.nextInt();
System.out.println(solve(n));
}
}