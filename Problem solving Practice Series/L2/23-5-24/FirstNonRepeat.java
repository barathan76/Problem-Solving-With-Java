import java.util.Scanner;
class FirstNonRepeat{
static int solve(int arr[],int n){
for(int i =0;i<n;i++){
boolean flag = true;
for(int j =0;j<n;j++){
if(arr[i] == arr[j] && i!=j){
	flag = false;
	break;
}
}
if(flag)
	return arr[i];
}
return 0;
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