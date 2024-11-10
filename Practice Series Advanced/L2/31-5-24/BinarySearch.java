import java.util.Scanner;
class BinarySearch{
static int binarySearch(int arr[],int low,int high,int k){
if(high>=low){
int mid = low + (high - low)/2;
if(arr[mid] == k)
	return mid;
else if(arr[mid]<k)
	return binarySearch(arr,mid+1,high,k);
else 
	return binarySearch(arr,low,mid-1,k);
}
return -1;
}
static int search(int arr[],int n,int k){
return binarySearch(arr,0,n-1,k);

}
public static void main(String args[]){
Scanner scan = new Scanner(System.in);
int n = scan.nextInt();
int k = scan.nextInt();
int arr[] = new int[n];
for(int i =0;i<n;i++)
	arr[i] = scan.nextInt();
System.out.println(search(arr,n,k));
}
}