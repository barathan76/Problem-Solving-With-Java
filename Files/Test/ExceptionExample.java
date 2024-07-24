import java.util.Scanner;
class ExceptionSample{
public static void main(String args[]){
Scanner scan = new Scanner(System.in);

System.out.println("Enter a number:");

try{
int n = scan.nextInt();
}catch(NumberFormatException e){
System.out.println("Enter a number, don't enter something else");
}
}
}