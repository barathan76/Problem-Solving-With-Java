import java.util.Scanner;
class XORTotal{
static int solve(int arr[],int i,int n,int val){
if(i==n)
	return val;

return solve(arr,i+1,n,val^arr[i]) + solve(arr,i+1,n,val);
}
public static void main(String args[]){
Scanner scan = new Scanner(System.in);
int n = scan.nextInt();
int arr[] = new int[n];
for(int i =0;i<n;i++)
	arr[i] = scan.nextInt();
System.out.println(solve(arr,0,n,0));
}
}