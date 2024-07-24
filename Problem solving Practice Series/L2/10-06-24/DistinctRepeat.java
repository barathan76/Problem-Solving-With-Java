import java.util.Scanner;
class DistinctRepeat{
static void combination(int arr[],int temp[],int start,int end,int index,int k){

if(index == k){
for(int i =0;i<k;i++)
	System.out.print(temp[i]+" ");
System.out.println();
return;
}

for(int i =start;i<=end && end-i+1>=k-index;i++){
temp[index] = arr[i];
index++;
combination(arr,temp,i,end,index,k);
temp[index] = 0;
index--;
}
}
static void solve(int arr[],int n,int k){
int temp[] = new int[n];
combination(arr,temp,0,n-1,0,k);
}

public static void main(String args[]){
Scanner scan = new Scanner(System.in);
int n = scan.nextInt();
int arr[] = new int[n];
for(int i =0;i<n;i++)
	arr[i] = scan.nextInt();
int k = scan.nextInt();
solve(arr,n,k);
}
}