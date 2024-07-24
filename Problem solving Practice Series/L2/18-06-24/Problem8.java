import java.util.Scanner;
class Problem8{

static int getSum(int arr[],int n){
int sum = 0;
for(int i : arr)
	sum+=i;
return sum;
}


static void recursive(int arr[],int index,int val,int n,int k,int dp[]){

if(index == n){
if(val == k)
	dp[0]++;
return;
}

recursive(arr,index+1,val+arr[index],n,k,dp);
recursive(arr,index+1,val-arr[index],n,k,dp);
}
static int solve(int arr[],int n,int k){
int dp[] = new int[1];
recursive(arr,0,0,n,k,dp);
return dp[0];
}
public static void main(String args[]){
Scanner scan = new Scanner(System.in);
int n = scan.nextInt();
int arr[] = new int[n];
for(int i =0;i<n;i++)
	arr[i] = scan.nextInt();
int k = scan.nextInt();
System.out.println(solve(arr,n,k));
}
}