import java.util.Scanner;
class NonRepeatElement{
static int solve(int arr[],int n){
int ones = 0;
int twos = 0;
for(int i : arr){
ones = (ones^i) & (~twos);
twos = (twos^i) & (~ones);
}
return ones;
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