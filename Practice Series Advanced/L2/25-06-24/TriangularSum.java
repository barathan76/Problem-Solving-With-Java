import java.util.Scanner;
class TriangularSum{
static int solve(int arr[],int n){
if(n == 1)
	return arr[0];
int ans[] = new int[n-1];
for(int i =0;i<n-1;i++)
	ans[i] =  (arr[i] + arr[i+1])%10;
return solve(ans,n-1);
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