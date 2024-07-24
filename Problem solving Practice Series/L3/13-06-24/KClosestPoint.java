import java.util.Scanner;
class KClosestPoint{
static int findDistance(int arr[]){
return arr[0]*arr[0] + arr[1]*arr[1] ;
}

static void swap(int arr[][],int i,int j){
int temp[] = new int[2];
temp[0] = arr[i][0];
temp[1] = arr[i][1];
arr[i][0] = arr[j][0];
arr[i][1] = arr[j][1];
arr[j][0] = temp[0];
arr[j][1] = temp[1];
}
static int partition(int arr[][],int low,int high){

int pivot = findDistance(arr[high]);
int index = low-1;
for(int i =low;i<=high;i++){
if(findDistance(arr[i]) < pivot){
	index++;
	swap(arr,i,index);
}	
}
swap(arr,index+1,high);
return index+1;
}
static void sort(int arr[][],int low,int high){
if(low>=high)
	return;
int pi = partition(arr,low,high);
sort(arr,low,pi-1);
sort(arr,pi+1,high);
}



static int[][] solve(int arr[][],int n,int k){
sort(arr,0,n-1);
int ans[][] = new int[k][2];
for(int i =0;i<k;i++){
ans[i][0] = arr[i][0];
ans[i][1] = arr[i][1];
}
return ans;
}
public static void main(String args[]){
Scanner scan = new Scanner(System.in);
int n = scan.nextInt();
int arr[][] = new int[n][2];
for(int i=0;i<n;i++){
arr[i][0] = scan.nextInt();
arr[i][1] = scan.nextInt();
}
int k = scan.nextInt();
int ans[][] = solve(arr,n,k);
for(int i =0;i<ans.length;i++){
System.out.print("("+ans[i][0]+","+ans[i][1]+")"+" ");
}
}
}