import java.util.Scanner;
class Richest{
static int solve(int arr[][],int n,int m){
int max = 0;
for(int i =0;i<n;i++){
int sum = 0;
for(int j = 0;j<m;j++){
	sum+=arr[i][j];
}
if(sum>max)
	max = sum;
}
return max;
}
public static void main(String args[]){
Scanner scan = new Scanner(System.in);
int n = scan.nextInt();
int m  = scan.nextInt();
int arr[][] = new int[n][m];
for(int i =0;i<n;i++){
for(int j = 0;j<m;j++)
	arr[i][j] = scan.nextInt();
}
System.out.println(solve(arr,n,m));
}
}