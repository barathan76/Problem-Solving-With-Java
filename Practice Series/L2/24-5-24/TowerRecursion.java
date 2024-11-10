import java.util.Scanner;
class TowerRecursion{
static int recursive(int arr[],int i,int n,int k,int sum){
if(arr[i]-k < 0)
	return arr[i]+k;
if(i>=n-1)
	return sum;

return Math.max(recursive(arr,i+1,n,k,sum+arr[i]-k),recursive(arr,i+1,n,k,sum+arr[i]+k));
}


static int solve(int arr[],int n,int k){
return recursive(arr,0,n,k,0);
}

public static void main(String args[]){
Scanner scan = new Scanner(System.in);
int n = scan.nextInt();
int k = scan.nextInt();
int arr[] = new int[n];
for(int i =0;i<n;i++)
	arr[i] = scan.nextInt();

System.out.println(solve(arr,n,k));
}
}