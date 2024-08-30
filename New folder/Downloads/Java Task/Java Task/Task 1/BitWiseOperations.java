import java.util.Scanner;
class BitWiseOperations
{
public static void main(String args[]){
Scanner scan = new Scanner(System.in);
System.out.print("Enter a number : ");
int a = scan.nextInt();
System.out.println();
System.out.print("Enter another number : ");
int b = scan.nextInt();
scan.close();
System.out.println("Bitwise operations between two numbers");
System.out.println("And : "+(a&b));
System.out.println("Or : "+(a&b));
System.out.println("Not : "+(a&b));
System.out.println("Xor : "+(a^b));
System.out.println("LeftShift  : "+(a<<b));
System.out.println("RightShift : "+(a>>b));
}
}