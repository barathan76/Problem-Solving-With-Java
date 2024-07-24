import java.util.Scanner;
class SumOfNOdd
{
public static void main(String args[])
{
Scanner scan = new Scanner(System.in);
System.out.print("Enter the nth term of odd numbers : ");
int n = scan.nextInt();
System.out.println();
int k = 1;
int sum = 1;
for(int i =1;i<n;i++)
{
System.out.print(k+" ");
k+=2;
sum+=k;
}
System.out.print(k);
System.out.println();
System.out.println("The sum of "+n+" odd numbers : "+sum);
}
}


