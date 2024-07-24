/*5:40 - 5:53*/
import java.util.Scanner;
class Q6{


static int getSum(int n){
if(n>=0 && n<=9)
		return n*n;
	
int c = n%10;

return c*c + getSum(n/10);	
}


static boolean solve(int n){


n = getSum(n);
if(n>=1 && n<=9){
if(n == 1)
	return true;
else 
	return false;
}
return solve(n);	
}
public static void main(String args[]){
Scanner scan = new Scanner(System.in);
int n = scan.nextInt();
if(solve(n)){
	System.out.println(n+" is a happy number.");
}
else{
	System.out.println(n+" is not a happy number.");
}
}
}

/*
C:\Users\inc5540-32\Documents\Main test\L2\Test 4>java Q6
7
7 is a happy number.

C:\Users\inc5540-32\Documents\Main test\L2\Test 4>java Q6
58
58 is not a happy number.


*/