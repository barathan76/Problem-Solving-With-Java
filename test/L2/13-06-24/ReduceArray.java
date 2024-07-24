import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
class ReduceArray{
static int solve(int arr[],int n,boolean flag){
for(int i =0;i<n;i++)
	System.out.print(arr[i]+" ");
System.out.println();
if(arr.length == 1)
	return arr[0];
int ans[] = new int[n/2];
if(flag){
for(int i=1,j= 0;i<n && j<n/2;i+=2,j++)
	ans[j] = arr[i];
flag = false;
}
else
{
for(int i=n-2,j= n/2 - 1;i>=0 && j>=0;i-=2,j--)
	ans[j] = arr[i];
flag = true;
}

return solve(ans,n/2,flag);
}
public static void main(String args[]){
	Scanner scan = new Scanner(System.in);
	int n = scan.nextInt();
	int arr[] = new int[n];
	for(int i =1;i<=n;i++)
		arr[i-1] = i;
	System.out.println(solve(arr,n,true));
}
}