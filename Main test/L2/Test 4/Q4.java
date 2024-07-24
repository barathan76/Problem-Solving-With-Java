/*5:13 - 5:31*/
import java.util.Scanner;
class Q4{


static void swap(int arr[],int i,int j){
int temp = arr[i];
arr[i] = arr[j];
arr[j] = temp;
}
	
static int partition(int arr[],int low,int high){
	int pivot = arr[high];
	int index = low - 1;
	for(int j = low;j<=high;j++){
	if(arr[j]<pivot){
		index++;
		swap(arr,index,j);
	}
	}
	swap(arr,index+1,high);
	return index+1;
}
static void quickSort(int arr[],int low,int high){
if(low>high)
	return;
int pi = partition(arr,low,high);
quickSort(arr,low,pi-1);
quickSort(arr,pi+1,high);
}
static void sort(int arr[],int n){
quickSort(arr,0,n-1);	
}







static void solve(int arr[],int n){
sort(arr,n);
int index  = 0;
String ans[] = new String[n-3];

int i = 0,j = n-2,k = n-1;
while(j>i && k>j){
int c = arr[i]+arr[j]+arr[k];
if(c == 0){
	ans[index] = "["+arr[i]+", "+arr[j]+", "+arr[k]+"]";
	index++;
	j = n-2;
	k = n-1;
	i++;
}
else{
if(j == i+1 && k == j+1){
	j = n-2;
	k = n-1;
	i++;
	continue;
}
j--;
if(j == i){
	k--;
	j = k-1;
	continue;
}
}	
}
for(int l = 0;l<index;l++){
boolean flag = true;
for(int m = 0;m<l;m++){
if(ans[m].equals(ans[l])){
	flag = false;
	break;
}
}
if(flag)
	System.out.println(ans[l]);
}

}
public static void main(String args[]){
Scanner scan = new Scanner(System.in);
int n = scan.nextInt();
int arr[] = new int[n];
for(int i =0;i<n;i++)
	arr[i] = scan.nextInt();
solve(arr,n);
}
}


/*

C:\Users\inc5540-32\Documents\Main test\L2\Test 4>java Q4
6
-1 0 1 2 -1 4
[-1, -1, 2]
[-1, 0, 1]



*/