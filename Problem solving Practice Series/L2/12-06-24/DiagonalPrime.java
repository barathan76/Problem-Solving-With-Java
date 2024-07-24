import java.util.Scanner;
class DiagonalPrime{
static boolean isPrime(int n){
if(n == 0 || n == 1)
	return false;
if(n == 2 || n == 3)
	return true;
for(int i =2;i<n;i++){
	if(n%i == 0)
		return false;
}
return true;
}
static int solve(int arr[][],int n){
int prime = 0;
for(int i =0,j = n-1;i<n && j>=0;i++,j--){
if(isPrime(arr[i][i]))
	prime = Math.max(prime,arr[i][i]);
if(isPrime(arr[i][j]))
	prime = Math.max(prime,arr[i][j]);
}
return prime;
}
public static void main(String args[]){
Scanner scan = new Scanner(System.in);
int n = scan.nextInt();
int arr[][] = new int[n][n];
for(int i =0;i<n;i++){
for(int j =0;j<n;j++){
arr[i][j] = scan.nextInt();
}
}
System.out.println(solve(arr,n));
}

}