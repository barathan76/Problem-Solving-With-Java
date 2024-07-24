import java.util.Scanner;
class MergeSort{



public static void merge(int arr[],int low,int mid,int high){

int l = mid-low+1;
int r = high-mid;

int left[] = new int[l];
int right[] = new int[r];
for(int i=0;i<l;i++)
	left[i] = arr[low+i];
for(int j=0;j<r;j++)
	right[j] = arr[mid+1+j];

int i =0,j=0;

int k = low;

while(i<l && j<r){

if(left[i] <= right[j]){
arr[k] = left[i];
i++;

}else{
arr[k] = right[j];
j++;
}
k++;
}

while(i<l){
arr[k] = left[i];
i++;
k++;
}

while(j<r){
arr[k] = right[j];
j++;
k++;
}


}

public static void sort(int arr[],int low,int high){
if(low>=high)
	return;

int mid = (low+high)/2;
sort(arr,low,mid);
sort(arr,mid+1,high);
merge(arr,low,mid,high);

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