import java.util.Scanner;
class ZeroSum{
static boolean solve(int arr[],int n){
for(int i =0;i<n;i++){
int sum =0;
for(int j =i;j<n;j++){
sum+=arr[j];
if(sum == 0)
	return true;
else
	continue;
}
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
if(solve(arr,n))
	System.out.println("Yes");
else
	System.out.println("No");
}
}