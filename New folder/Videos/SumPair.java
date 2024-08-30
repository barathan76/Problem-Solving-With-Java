import java.util.Scanner;
class SumPair{
static int solve(int arr[],int n,int k){
int count = 0;
for(int i =0;i<n;i++){
for(int j =i+1;j<n;j++){
if(arr[i]+arr[j] == k)
	count++;
}
}
return count;
}
public static void main(String args[]){
Scanner scan = new Scanner(System.in);
int n = scan.nextInt();
int k = scan.nextInt();
int arr[] = new int[n];
for(int i =0;i<n;i++)
	arr[i] = scan.nextInt();
System.out.println(solve(arr,n,k));
}
}
