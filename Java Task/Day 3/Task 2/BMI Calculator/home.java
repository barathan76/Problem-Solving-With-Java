package home;
import calc.BMICalculator;
import java.util.Scanner;
class Home{
public static void main(String args[]){
Scanner scan = new Scanner(System.in);
System.out.println("BMI Calculator");
while(true){
System.out.println("1. Calculate in Standard Measurement ");
System.out.println("2. Calculate in Metrics Measurement ");
System.out.println("3. Exit ");
System.out.print("Enter your choice : ");
int n = scan.nextInt();
System.out.println();
BMICalculator calc = new BMICalculator();
switch(n)
{
case 1:
	System.out.print("Enter Feet in height : ");
	int feet = scan.nextInt();
	System.out.println();
	System.out.print("Enter inch in height : ");
	int inch = scan.nextInt();
	calc.setHeightInFeetInch(feet,inch);
	System.out.println();
	System.out.print("Enter weight in pounds : ");
	calc.setWeight(scan.nextInt());
	System.out.println();
	System.out.println("BMI Value in pounds per square inch : "+calc.calculateInStandard());
	System.out.println();
	break;
case 2:
	System.out.print("Enter height in cm: ");
	calc.setHeight(scan.nextInt());
	System.out.println();
	System.out.print("Enter weight in kilograms : ");
	calc.setWeight(scan.nextInt());
	System.out.println();
	System.out.println("BMI Value in pounds per square inch : "+calc.calculateInMetrics());
	System.out.println();
	break;
case 3:
	scan.close();
	return;
default:
	System.out.println("Invalid input");
	break;
}
}
}
}
	