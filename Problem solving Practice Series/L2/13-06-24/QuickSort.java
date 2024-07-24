import java.util.Scanner;
class QuickSort{
static void swap(int arr[],int i,int j){
int temp = arr[i];
arr[i] = arr[j];
arr[j] = temp;
}
static int partition(int arr[],int low,int high){

int pivot = arr[high];
int index = low - 1;

for(int i = low;i<=high;i++){

if(arr[i]<pivot){
index++;
swap(arr,index,i);
}
}
swap(arr,index+1,high);
return index+1;
}

static void sort(int arr[],int low,int high){
if(low >= high)
	return;

int pivot = partition(arr,low,high);
sort(arr,low,pivot-1);
sort(arr,pivot+1,high);
}
public static void main(String args[]){

Scanner scan = new Scanner(System.in);
int n = scan.nextInt();
int arr[] = new int[n];
for(int i =0;i<n;i++)
	arr[i] = scan.nextInt();
sort(arr,0,n-1);

for(int i =0;i<n;i++)
	System.out.print(arr[i]+" ");
}
}