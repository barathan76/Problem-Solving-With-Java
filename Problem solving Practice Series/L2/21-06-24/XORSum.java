import java.util.Scanner;
class XORSum{
static int solve(int arr[],int n){
int dp[][] = new int[n+1][n];
int sum = 0;
for(int i =1;i<=n;i++){
for(int j =0;j<n;j++){
if(j == i-1){
sum+=arr[j];
dp[i][j] = arr[j];
sum+=dp[i][j];
}
dp[i][j] = Math.min(dp[i-1][j],arr[i-1]);
}
}
for(int i =0;i<=n;i++){
for(int j = 0;j<n;j++){
System.out.print(dp[i][j]+ " ");
}
System.out.println();
}
return sum;
}



static int recursive(int arr[],int i,int n,int val){

if(i == n)
	return val;

return recursive(arr,i+1,n,val^arr[i])+recursive(arr,i+1,n,val);
}
public static void main(String args[]){
Scanner scan = new Scanner(System.in);
int n = scan.nextInt();
int arr[] = new int[n];
for(int i =0;i<n;i++)
	arr[i] = scan.nextInt();
System.out.println(solve(arr,n));
System.out.println(recursive(arr,0,n,0));
}
}