import java.util.Scanner;

class Frequency{


static void swap(int arr[],int i,int j){

int temp = arr[i];
arr[i] = arr[j];
arr[j] = temp;

}

static int partition(int arr[],int low,int high){

int pivot = arr[high];

int i = low - 1;

for(int j = low;j<high;j++){

if(arr[j]<pivot){
i++;
swap(arr,i,j);
}
}
swap(arr,i+1,high);
return i+1;
}
static void quickSort(int arr[],int low,int high){

if(low>high)
	return;
int pi = partition(arr,low,high);
quickSort(arr,low,pi-1);
quickSort(arr,pi+1,high);

}
static void solve(int arr[],int n){
quickSort(arr,0,n-1);
for(int i =0;i<n;i++){
int j;
for(j = i+1;j<n;j++){
if(arr[i] != arr[j])
	break;
}
System.out.print(arr[i]+ " "+ (j-i));
System.out.println();
i = j-1;
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