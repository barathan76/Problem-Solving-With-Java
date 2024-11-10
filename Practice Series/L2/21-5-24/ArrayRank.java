import java.util.Scanner;
class ArrayRank{
static void swap(int arr[],int i,int j){
arr[i] = arr[i]^arr[j];
arr[j] = arr[i]^arr[j];
arr[i] = arr[i]^arr[j];
}
static void rankSort(int arr[],int rank[],int n){
for(int i =0;i<n;i++){
for(int j=i+1;j<n;j++){
if(rank[i]>rank[j]){
swap(rank,i,j);
swap(arr,i,j);
}else if(rank[i] == rank[j]){
if(arr[i]>arr[j]){
swap(rank,i,j);
swap(arr,i,j);
}
}
}
}
}

static void printArray(int arr[]){
for(int i:arr){
System.out.print(i+" ");
}
}

public static void main(String args[]){
Scanner scan = new Scanner(System.in);
int n = scan.nextInt();
int arr[] = new int[n];
int rank[] = new int[n];
for(int i =0;i<n;i++){
arr[i] = scan.nextInt();
}
System.out.println();
for(int i =0;i<n;i++){
rank[i] = scan.nextInt();
}
rankSort(arr,rank,n);
printArray(arr);
}
}