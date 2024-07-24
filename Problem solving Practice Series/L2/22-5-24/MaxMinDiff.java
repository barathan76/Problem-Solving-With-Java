import java.util.Scanner;
class MaxMinDiff{
static void printArray(int arr[][]){
for(int i=0;i<arr.length;i++){
for(int j =0;j<arr[0].length;j++){
System.out.print(arr[i][j]+" ");
}
System.out.println();
}
}
static int[][] solve(int arr[],int n){
int max = arr[0];
int min = arr[0];
int secondMin = arr[0];
for(int i =1;i<n;i++){
if(arr[i]>max)
	max = arr[i];
if(arr[i]<min){
	secondMin = min;
	min = arr[i];
}
}
int ans[][] = new int[2][2];
ans[0][0] = max;
ans[0][1] = min;
ans[1][0] = secondMin;
ans[1][1] = min;
return ans;
}
public static void main(String args[]){
Scanner scan = new Scanner(System.in);
int n = scan.nextInt();
int arr[] = new int[n];
for(int i =0;i<n;i++){
arr[i] = scan.nextInt();
}
int ans[][] = solve(arr,n);
printArray(ans);
}
}