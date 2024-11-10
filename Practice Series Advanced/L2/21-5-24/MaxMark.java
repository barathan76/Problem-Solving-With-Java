import java.util.Scanner;
class MaxMark{
static int max(int arr[],int n){
int max = arr[0];
for(int i =1;i<n;i++){
if(arr[i]>max)
max = arr[i];
}
return max;
}
static int solve(int arr[],int n){
int count = 0;
int maxMark = max(arr,n);
for(int i =0;i<n;i++){
if(arr[i] == maxMark)
	count++;
}
return count;
}
public static void main(String args[]){
Scanner scan = new Scanner(System.in);
int n = scan.nextInt();
int arr[] = new int[n];
for(int i =0;i<n;i++){
arr[i] = scan.nextInt();
}
System.out.println(solve(arr,n));
}
}
