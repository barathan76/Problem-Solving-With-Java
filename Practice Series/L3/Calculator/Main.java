import java.util.Scanner;
import java.util.InputMismatchException;
import pack1.Calculator;
class Main{
public static void main(String args[]){
Scanner scan = new Scanner(System.in);
Calculator calc = new Calculator();
System.out.println("...........Welcome to the calculator.........");
while(true){
System.out.println("Enter two numbers");
System.out.print("Number 1 : ");
int a,b;
try{a = scan.nextInt();}catch(InputMismatchException e ){System.out.println("Enter valid integer");
scan.nextLine();
continue;
}
System.out.println();
System.out.print("Number 2 : ");
try{b = scan.nextInt();}catch(InputMismatchException e ){System.out.println("Enter valid integer");
scan.nextLine();
continue;
}
System.out.println("..........Select Operation.........");
scan.nextLine();
while(true){
System.out.println("Enter the operation... \nAddition (+)\nSubtraction(-)\nMultiplication(*)\nDivision(/)\nPercentage(%)\nPercentOf(?)\nPercentIncrease or Decrease($)");
char c;
try{c = scan.next().charAt(0);
System.out.println(calc.calculate(a,b,c));
break;}catch(InputMismatchException e){System.out.println("Enter valid operation");
scan.nextLine();}

}
}
}
}




