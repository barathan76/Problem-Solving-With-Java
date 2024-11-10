import java.util.Scanner;
class ClimbStairs{


static int recursive(int arr[],int i,int n){

if(i >=n)
	return 0;

int a = arr[i] + recursive(arr,i+1,n);
int b = arr[i] + recursive(arr,i+2,n);
return Math.min(a,b);
}

static int solve(int arr[],int n){

int dp[] = new int[n];
dp[0] = arr[0];
dp[1] = arr[1];
for(int i = 2;i<n;i++){

dp[i] = arr[i] + Math.min(dp[i-1],dp[i-2]);

}
return Math.min(dp[n-1],dp[n-2]);




/*return Math.min(recursive(arr,0,n),recursive(arr,1,n));*/

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


