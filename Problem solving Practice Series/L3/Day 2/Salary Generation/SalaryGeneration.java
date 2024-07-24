import java.util.Scanner;
class Salary{
private int salary;
Salary(int salary){
this.salary = salary;
}
public float getNetSalary(){
float da = (float)(12*salary)/100;
int hra = 150;
int ta = 120;
int others = 450;
return salary+da+hra+ta+others - getTaxCuts();
}
private float getTaxCuts(){
float pf = (float)(14*salary)/100;
float it = (float)(15*salary)/100;
return pf+it;
}
}

class SalaryGeneration{

public static void main(String args[]){
Scanner scan = new Scanner(System.in);
System.out.println("Enter the basic salary ");
int n = scan.nextInt();
Salary salary = new Salary(n);
System.out.println(salary.getNetSalary());
}
}