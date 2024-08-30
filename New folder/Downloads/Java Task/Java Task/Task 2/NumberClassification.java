import java.util.Scanner;

class NumberClassification
{
public static void main(String args[])
{
Scanner scan = new Scanner(System.in);
System.out.print("Enter a floating point number : ");
float n = scan.nextFloat();
System.out.println();
scan.close();
float d = Math.abs(n);
if(d==0){
System.out.println("The number is zero");
}else if (d>0){
System.out.println("The number is positive");
if(d>=1000000){
System.out.println("The number is large");
}
}else if(d<0){
System.out.println("The number is negative");}
if(d<1){
System.out.println("The number is small");
}
}
}


