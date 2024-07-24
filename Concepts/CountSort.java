import java.util.Scanner;

class CountSort{
static int getMax(int arr[],int n){
int max = 0;
for(int i =0;i<n;i++)
	max = Math.max(arr[i],max);
return max;
}
static void solve(int arr[],int n){
int max = getMax(arr,n);
int temp[] = new int[max+1];
for(int i=0;i<n;i++)
	temp[arr[i]]++;
for(int i =1;i<=max;i++)
	temp[i] = temp[i]+temp[i-1];
int ans[] = new int[n];
for(int i =n-1;i>=0;i--){
ans[--temp[arr[i]]] = arr[i];
}
for(int i =0;i<n;i++)
	arr[i] = ans[i];
}
public static void main(String args[]){
Scanner scan= new Scanner(System.in);
int n = scan.nextInt();
int arr[] = new int[n];
for(int i =0;i<n;i++)
	arr[i] = scan.nextInt();
solve(arr,n);
for(int i =0;i<n;i++)
	System.out.print(arr[i]+" ");
}
}