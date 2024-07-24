import java.util.Scanner;
import java.util.InputMismatchException;
class ExceptionSample{
public static void main(String args[]){
Scanner scan = new Scanner(System.in);

int n;
while(true){

System.out.println("Enter a number:");

try{
n = scan.nextInt();
break;
}catch(InputMismatchException e){
System.out.println("Enter a number, don't enter something else");
scan.nextLine();
}
}
System.out.println("The value is "+n);
}
}