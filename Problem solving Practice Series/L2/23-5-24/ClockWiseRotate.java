import java.util.Scanner;
class ClockWiseRotate{
static void rotate(int arr[],int n){
int temp = arr[0];
arr[0] = arr[n-1];
for(int i=1;i<n;i++){
int val = arr[i];
arr[i] = temp;
temp = val;	
}
}
static void printArray(int arr[]){
for(int i : arr)
	System.out.print(i+ " ");
System.out.println();
}
public static void main(String args[]){
Scanner scan = new Scanner(System.in);
System.out.print("Enter the size of the array : ");
int n =scan.nextInt();
System.out.println("Enter the array elements ");
int arr[] = new int[n];

for(int i =0;i<n;i++)
	arr[i] = scan.nextInt();
rotate(arr,n);
printArray(arr);


}
}