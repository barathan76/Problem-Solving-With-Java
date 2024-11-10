import java.util.Scanner;
class MaxSumSubArray{
static int max(int a,int b){
if(a>b)
	return a;
else 
	return b;
}
static int solve(int arr[],int n){
int maxSum = Integer.MIN_VALUE;
for(int i =0;i<n;i++){
int sum = 0;
for(int j =i;j<n;j++){
sum+=arr[j];
maxSum = max(sum,maxSum);
}
}
return maxSum;
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