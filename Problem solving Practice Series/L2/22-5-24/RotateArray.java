import java.util.Scanner;
class RotateArray{
static void shift(int arr[],int n,int val){
int temp = arr[0];
arr[0] = val;
for(int j =1;j<n;j++){
int k = arr[j];
arr[j] = temp;
temp = k;
}
}
static void printArray(int arr[]){
for(int i :arr){
System.out.print(i+" ");
}
System.out.println();
}
static void rotate(int arr[],int n,int k){

while(k>0){
shift(arr,n,arr[n-1]);
k--;
}

}

public static void main(String args[]){
Scanner scan = new Scanner(System.in);
int n = scan.nextInt();
int arr[] = new int[n];
for(int i =0;i<n;i++){
arr[i] = scan.nextInt();
}
System.out.print("Enter rotate factor : ");
int k = scan.nextInt();
System.out.println("Before Rotate");
printArray(arr);
rotate(arr,n,k);
System.out.println("After Rotate");
printArray(arr);
}
}