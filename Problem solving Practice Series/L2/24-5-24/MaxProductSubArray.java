import java.util.Scanner;
class MaxProductSubArray{
static int solve(int arr[],int n){
int maxProduct = Integer.MIN_VALUE;
int max = 1;
for(int i =0;i<n;i++){
max*=arr[i];
if(maxProduct<max)
	maxProduct = max;
if(max == 0)
	max = 1;
}
return maxProduct;

}
public static void main(String args[]){
Scanner scan = new Scanner(System.in);
int n = scan.nextInt();
int arr[] = new int[n];
for(int i =0;i<n;i++)
	arr[i] = scan.nextInt();
System.out.println(solve(arr,n));
}
}