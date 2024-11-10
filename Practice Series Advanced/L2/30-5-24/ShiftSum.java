import java.util.Scanner;
class ShiftSum{

static void shift(int arr[],int n){
int temp = arr[0];
for(int i =0;i<n-1;i++){
arr[i] = arr[i+1];
}
arr[n-1] = temp;
}
static void solve(int arr[],int n){
int max = Integer.MIN_VALUE;
for(int i =0;i<n;i++){
int sum = 0;
for(int j = 1;j<n;j++){
sum+= j*arr[j];
}
max = Math.max(sum,max);
shift(arr,n);
}
System.out.println(max);

}
public static void main(String args[]){
Scanner scan = new Scanner(System.in);
int n = scan.nextInt();
int arr[] = new int[n];
for(int i =0;i<n;i++)
	arr[i] = scan.nextInt();
solve(arr,n);
}
}