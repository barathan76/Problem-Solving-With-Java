import java.util.Scanner;
class AlternateSequence{
static int solve(int arr[],int n){
int i = 1;
int j = 1;
for(int k =1;k<n;k++){
if(arr[k]>arr[k-1])
	i=j+1;
if(arr[k]<arr[k-1])
	j = i+1;
}
return Math.max(i,j);
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