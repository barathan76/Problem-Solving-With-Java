import java.util.Scanner;
class MaxDiff{
static int solve(int arr[],int n){
int max = Integer.MIN_VALUE;
for(int i =0;i<n;i++){
for(int j =0;j<n;j++){
if(arr[j]>arr[i])
	if(j-i>max)
		max = j-i;
}
}
return max;
}
public static void main(String args[]){
Scanner scan = new Scanner(System.in);
int n = scan.nextInt();
int arr[] = new int[n];
for(int i =0;i<n;i++)
	arr[i] = scan.nextInt();
System.out.println(solve(arr,n));
}
}