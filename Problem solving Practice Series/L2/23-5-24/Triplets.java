import java.util.Scanner;
import java.util.Stack;
class Triplets{
static boolean solve(int arr[],int n){
Stack<Integer> stack = new Stack<>();
int k = Integer.MIN_VALUE;
for(int i = n-1;i>=0;i--){
if(arr[i]<k)
	return true;
while(!stack.isEmpty() && stack.peek() < arr[i])
	k = stack.pop();
stack.push(arr[i]);
}
return false;
}
public static void main(String args[]){
Scanner scan = new Scanner(System.in);
System.out.print("Enter the size of the array : ");
int n =scan.nextInt();
System.out.println("Enter the array elements ");
int arr[] = new int[n];

for(int i =0;i<n;i++)
	arr[i] = scan.nextInt();
System.out.println(solve(arr,n));
}
}