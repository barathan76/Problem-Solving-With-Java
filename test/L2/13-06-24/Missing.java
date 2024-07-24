import java.util.Scanner;
class Missing{
static int search(int arr[],int low,int high,int k){
if(low>high)
		return -1;
int mid = (low+high)/2;

if(arr[mid] == k)
	return mid;
else if(arr[mid]<k)
	return search(arr,mid+1,high,k);
else
	return search(arr,low,mid-1,k);
}
static int solve(int arr[],int n){
	
	int max = Math.max(arr[n-1],n);
	for(int i =0;i<=max;i++){
		if(search(arr,0,n-1,i) == -1)
			return i;
	}
	return 0;

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