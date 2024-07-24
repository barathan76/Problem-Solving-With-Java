import java.util.Scanner;
class PascalTriangle{
static void solve(int arr[],int i,int n){
for(int j = i;j<n;j++)
	System.out.print(" ");
for(int j = 0;j<i;j++)
	System.out.print(arr[j]+ " ");
System.out.println();

if(i == n)
	return;
int ans[] = new int[i+1];
ans[0] = 1;
ans[i] = 1;
for(int j =1 ;j<i;j++)
	ans[j] = arr[j]+arr[j-1];
solve(ans,i+1,n);
}
public static void main(String args[]){
Scanner scan = new Scanner(System.in);
int n = scan.nextInt();
int arr[] = new int[1];
arr[0] = 1;
solve(arr,1,n);
}
}