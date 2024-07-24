iimport java.util.Scanner;
class OddLenSubArray{
static int sum(int arr[],int n){
int sum = 0;
for(int i =0;i<n;i++){
int innerSum = 0;
for(int j =i;j<n;j++){
innerSum += arr[j];
if((j-i)%2  == 0)
	sum+=innerSum;
}
}
return sum;
}
static void display(int arr[],int n){
for(int i =0;i<n;i++){
System.out.print(arr[i]+" ");
}
System.out.println();
}
public static void main(String args[]){
Scanner scan = new Scanner(System.in);
System.out.print("Enter the length of the array : ");
int n = scan.nextInt();
System.out.println("Enter Array elements .......");
int arr[] = new int[n];
for(int i =0;i<n;i++){
arr[i] = scan.nextInt();
}
display(arr,n);
System.out.println("Sum of all possible odd length sub Arrays : "+sum(arr,n));

}
}