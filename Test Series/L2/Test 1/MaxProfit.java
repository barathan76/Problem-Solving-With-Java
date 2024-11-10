import java.util.Scanner;
class MaxProfit{
static int max(int a,int b){
if(a>b)
	return a;
else
	return b;
}
static int solve(int arr[],int n){
int i = 0;
int j = n-1;
int maxDiff = 0;
while(i<n-1 && j>0){
int diff = arr[j] - arr[i];
if(diff<0){
	i++;
}
else if(diff>=0){
	j--;
	maxDiff = max(maxDiff,diff);
}
}
return maxDiff;
}
public static void main(String args[]){
Scanner scan = new Scanner(System.in);
int n = scan.nextInt();
int arr[] = new int[n];
for(int i = 0;i<n;i++)
	arr[i] = scan.nextInt();
System.out.println(solve(arr,n));
}
}