import java.util.Scanner;
import java.util.Arrays;
class EqualSumSubSet{
static int getTarget(int arr[],int n){
int sum = 0;
for(int i =0;i<n;i++)
	sum+=arr[i];
return sum/2;
}
static boolean recursive(int arr[],int i,int n,int sum){
if(sum == 0)
	return true;
if(i==n-1 && sum!=0)
	return false;
if(arr[i]>sum)
	return recursive(arr,i+1,n,sum);
return recursive(arr,i+1,n,sum) || recursive(arr,i+1,n,sum-arr[i]);
}
static boolean solve(int arr[],int n){
int k = getTarget(arr,n);
return recursive(arr,0,n,k);
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