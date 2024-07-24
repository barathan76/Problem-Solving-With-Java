import java.util.Scanner;
class SwapVar
{
public static void swap(int arr[]){
arr[0] = arr[0] ^ arr[1];
arr[1] = arr[0] ^ arr[1];
arr[0] = arr[0] ^ arr[1];
}

public static void main(String args[])
{
Scanner scan = new Scanner(System.in);
int arr[] = new int[2];
System.out.print("Enter the value of number A : ");
arr[0] = scan.nextInt();
System.out.println();
System.out.print("Enter the value of number B : ");
arr[1] = scan.nextInt();
scan.close();
System.out.println();
swap(arr);
System.out.println("After swap the value of A : "+arr[0]+" and the value of B : "+arr[1]+".");
}
}
