import java.util.Scanner;
import java.util.Arrays;
class DistinctNonRepeat{

static void combination(int arr[],int temp[],int start,int end,int index, int k){

if(index == k){
for(int i = 0;i<k;i++)
	System.out.print(temp[i]+" ");
System.out.println();
return;
}


for(int i = start;i<=end && end - i+1>=k-index;i++){
temp[index] = arr[i];
combination(arr,temp,i+1,end,index+1,k);
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