import java.util.*;

class sample
{
static void print(){
System.out.println("Hello");
}
static void print(int a){
System.out.println("Nothing");
}
public static void main(String args[])
{
Scanner scan = new Scanner(System.in);
int n = scan.nextInt();
int arr[] = new int[n];
for(int i =0;i<n;i++)
{
System.out.println("ooo");
arr[i] = scan.nextInt();
}
System.out.println("Array Elements are : " + Arrays.toString(arr));
print();
}
}
