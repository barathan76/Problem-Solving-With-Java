import java.util.Scanner;
class ZeroSum{
static boolean solve(int arr[],int n){
for(int i =0;i<n;i++){
int sum = 0;
for(int j =i;j<n;j++){
sum+=arr[j];
if(sum == 0)
	return true;
}
}
return false;
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