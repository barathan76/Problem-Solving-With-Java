import java.util.Scanner;
class Rotate{
static void shift(int arr[],int n){
int temp = arr[0];
for(int i =1;i<n;i++){
int val = arr[i];
arr[i]= temp;
temp = val;

}
}
static void rotate(int arr[],int n){
int val = arr[n-1];
shift(arr,n);
arr[0] = val;
}
static void print(int arr[]){
for(int i: arr)
	System.out.print(i+" ");
}
public static void main(String args[]){
Scanner scan = new Scanner(System.in);
int n = scan.nextInt();
int arr[] = new int[n];
for(int i =0;i<n;i++){
arr[i] = scan.nextInt();
}
rotate(arr,n);
print(arr);
}
}
