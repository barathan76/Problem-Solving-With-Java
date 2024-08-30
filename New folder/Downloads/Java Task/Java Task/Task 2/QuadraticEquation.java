import java.util.Scanner;
class QuadraticEquation
{
public static void main(String args[])
{
Scanner scan = new Scanner(System.in);
System.out.println("The Quadratic Equation");
System.out.println("Ax^2 + Bx + C = 0");
System.out.print("Enter the Value of A : ");
int A = scan.nextInt();
System.out.println();
System.out.print("Enter the Value of B : ");
int B = scan.nextInt();
System.out.println();
System.out.print("Enter the Value of C : ");
int C = scan.nextInt();
System.out.println();
scan.close();
int d = (B*B) - (4*A*C);
if(d==0){
	System.out.println("The roots are real and equal and the value of X = "+ (-B)/(2*A));
}else if(d>0){
	int k = (int)Math.sqrt(d)/(2*A);
	System.out.println("The roots are real and not equal and the value of X1 = "+ (-B/(2*A) + k) + " and the value of X2 = "+ (-B/(2*A) - k));
}else{
	int k = (int)Math.sqrt(-d)/(2*A);
	System.out.println("The roots are not real and not equal and the value of X1 = "+ (-B/(2*A))+"+i"+k + " and the value of X2 = "+ (-B/(2*A))+ "-i"+k);
}
}
}

	


