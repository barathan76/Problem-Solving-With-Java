import java.util.Scanner;
class ReverseSubArray{
	
static void swap(int arr[],int i,int j){
	int temp =arr[i];
	arr[i] = arr[j];
	arr[j] = temp;
}
static void solve(int arr[],int i,int j,int m,int n){

if( i>= j)
	return;
System.out.println(i+" "+j);
if(j-i+1>=m){
for(int k = i, l = i+m-1;k< l;k++,l--)
	swap(arr,k,l);
}

else{
for(int k = i,l = j; k <l ; k++,l--)
	swap(arr,k,l);
}
for(int k =0;k<n;k++)
		System.out.print(arr[k]+" ");
System.out.println();
solve(arr,i+m,j,m,n);
}
public static void main(String args[]){
	Scanner scan = new Scanner(System.in);
	int n = scan.nextInt();
	int arr[] = new int[n];
	for(int i =0;i<n;i++)
		arr[i] = scan.nextInt();
	int m = scan.nextInt();
	int i = scan.nextInt();
	int j = scan.nextInt();
	solve(arr,i,j,m,n);
	System.out.println();
	for(int k =0;k<n;k++)
		System.out.print(arr[k]+" ");
}
}