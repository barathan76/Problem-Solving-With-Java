import java.util.Scanner;
class BinarySearch{
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
public static void main(String args[]){
	Scanner scan = new Scanner(System.in);
	int n = scan.nextInt();
	int arr[] = new int[n];
	for(int i =0;i<n;i++)
		arr[i] = scan.nextInt();
	int k = scan.nextInt();
	System.out.println(search(arr,0,n-1,k));
	}
	}