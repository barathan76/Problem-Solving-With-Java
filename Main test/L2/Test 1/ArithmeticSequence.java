import java.util.Scanner;
class ArithmeticSequence{
static int solve(int arr[],int n){
if(n<2)
	return 0;
int original = arr[1] - arr[0];
int count = 0;

for(int i =0;i<n;i++){
for(int j =i+1;j<n;j++){
if(j-i>=2){
count++;
}
int diff = arr[j] - arr[j-1];
	if(diff == original)
		continue;
	else
		break;
}
}
return count;
}
public static void main(String args[]){
Scanner scan = new Scanner(System.in);
int n =scan.nextInt();
int arr[] = new int[n];
for(int i =0;i<n;i++)
	arr[i] = scan.nextInt();
System.out.println(solve(arr,n));
}
}