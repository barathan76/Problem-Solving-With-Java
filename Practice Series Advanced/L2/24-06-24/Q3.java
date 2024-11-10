import java.util.Scanner;
class Q3{
static boolean solve(int arr[],int n,int k){
int val4 = arr[0];
for(int i =1;i<n;i++){
val4 = (val4 ^arr[i]) | k;
}
if(val4 == k)
	return true;
else
	return false;
}

public static void main(String args[]){
Scanner scan = new Scanner(System.in);
int n = scan.nextInt();
int arr[] = new int[n];
int k = scan.nextInt();
for(int i=0;i<n;i++)
	arr[i] = scan.nextInt();
System.out.println(solve(arr,n,k));
}
}