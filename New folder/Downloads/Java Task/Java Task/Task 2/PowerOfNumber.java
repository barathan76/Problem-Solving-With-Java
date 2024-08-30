import java.util.Scanner;
class PowerOfNumber
{
public static void main(String args[])
{
Scanner scan = new Scanner(System.in);
System.out.print("Enter the value of the number : ");
int n = scan.nextInt();
System.out.println();
System.out.print("Enter the value of the power : ");
int p = scan.nextInt();
System.out.println();
int val = 0;
for(int i =0;i<=p;i++)
{
if(i==0){
val = 1;
}
else{
val*=n;
}
}
System.out.println("The number "+n+" with power "+p+" is : "+val);
}
}
	


