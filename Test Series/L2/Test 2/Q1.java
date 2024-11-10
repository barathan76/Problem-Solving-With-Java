import java.util.Scanner;

class Q1{
static int solve(int arr[],int n){
if(n == 0)
	return 0;
if(n == 1)
	return arr[0];
int sum = arr[0];
for(int i =1;i<n;i++){
if(arr[i]%2 == 0)
	sum+=arr[i];
else if(arr[i]%2 == 1 && arr[i-1]%2 == 1)
	sum+=arr[i];
}
return sum;
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