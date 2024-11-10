import java.util.Scanner;
class Triplets{
static boolean recursive(int arr[],int i, int n,int sum,int k){
if(sum == k){
	return true;
}
if(i>=n)
	return false;

if(recursive(arr,i+1,n,sum+arr[i],k)){
	System.out.print(arr[i]+ " ");
	return true;
}

return recursive(arr,i+1,n,sum,k);

}
static boolean solve(int arr[],int n,int k){
System.out.println(k);
return recursive(arr,0,n,0,k);
}
public static void main(String args[]){
Scanner scan = new Scanner(System.in);
System.out.print("Enter the size of the array : ");
int n =scan.nextInt();
System.out.print("Enter the sum : ");
int sum = scan.nextInt();
System.out.println("Enter the array elements ");
int arr[] = new int[n];
for(int i =0;i<n;i++)
	arr[i] = scan.nextInt();
System.out.println(solve(arr,n,sum));
}
}