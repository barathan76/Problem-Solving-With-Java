import java.util.Scanner;
class ContinuousSubArray{
static void solve(int arr[],int n,int sum){
int k = 1;
int min = Integer.MAX_VALUE;
int max = 0;
while(k<=n){

int ans = 0;
for(int i =0;i<k;i++)
	ans+=arr[i];

if(ans == sum){
	System.out.println(1+" "+k);
	return;
}
for(int i = k;i<n;i++){
ans-= arr[i-k];
ans+=arr[i];
if(ans == sum){
	if(i-k+1<min){
	min  = i-k+1;
	max = i;
}
}
}
k++;
}
if(min  == Integer.MAX_VALUE)
	System.out.println(-1);
System.out.println((min+1)+" "+(max+1));
}
public static void main(String args[]){
Scanner scan = new Scanner(System.in);
int n = scan.nextInt();
int sum= scan.nextInt();
int arr[] = new int[n];
for(int i =0;i<n;i++)
	arr[i] = scan.nextInt();
solve(arr,n,sum);
}
}