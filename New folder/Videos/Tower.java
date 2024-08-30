import java.util.Scanner;
import java.util.Arrays;
class Tower{
static int solve(int arr[],int n,int k){
Arrays.sort(arr);
int min = arr[0];
int max = arr[n-1];
int ans = max - min;
for(int i =1;i<n;i++){
if(arr[i]-k<0)
	continue;
else
	min = Math.min(arr[0]+k,arr[i]-k);
	max = Math.max(arr[i-1]+k,arr[n-1]-k);
	ans = Math.min(ans,max - min);	
}
return ans;
	
}

public static void main(String args[]){
Scanner scan =new Scanner(System.in);
int n = scan.nextInt();
int k = scan.nextInt();
int arr[] = new int[n];
for(int i =0;i<n;i++)
	arr[i] = scan.nextInt();
System.out.println(solve(arr,n,k));
for(int i:arr)
	System.out.print(i+ " ");
}
}