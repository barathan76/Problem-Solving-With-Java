import java.util.Scanner;
class FloorCeil{
	
	
static int floor(int arr[],int low,int high,int k){
if(low>high){
	if(high == -1)
		return -1;
	else	
		return arr[high];
}
int mid = (low+high)/2;
if(arr[mid] == k)
	return arr[mid];
else if(arr[mid]<k)
	return floor(arr,mid+1,high,k);
else
	return floor(arr,low,mid-1,k);
}


static int ceil(int arr[],int low,int high,int k){
if(low>high){
	return arr[low];
}
int mid = (low+high)/2;


if(arr[mid] == k)
	return arr[mid];
else if(arr[mid]<k)
	return ceil(arr,mid+1,high,k);
else
	return ceil(arr,low,mid-1,k);
}






static void solve(int arr[],int n, int k){
	System.out.println(ceil(arr,0,n,k));
	System.out.println(floor(arr,0,n,k));
}
public static void main(String args[]){
	Scanner scan = new Scanner(System.in);
	int n = scan.nextInt();
	int arr[] = new int[n];
	for(int i =0;i<n;i++)
		arr[i] = scan.nextInt();
	int i = scan.nextInt();
	solve(arr,n,i);
}
}