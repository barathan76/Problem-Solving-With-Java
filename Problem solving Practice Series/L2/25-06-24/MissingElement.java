import java.util.Scanner;
class MissingElement{
static int solve(int arr[],int n){
int sum = 0;;
for(int i =0;i<n-1;i++)
	sum+=arr[i];
return (n*(n+1))/2  - sum;
}
public static void main(String args[]){
Scanner scan = new Scanner(System.in);
int n = scan.nextInt();
int arr[] = new int[n-1];
for(int i =0;i<n-1;i++)
	arr[i] = scan.nextInt();
System.out.println(solve(arr,n));
}
}