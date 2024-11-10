/*5:01 - 5:05*/
import java.util.Scanner;
class MissingNumber{
static int solve(int arr[],int n){
	int sum = 0;
	for(int i =0;i<n;i++)
		sum+=arr[i];
	int act = (n*(n+1))/2;
	return act - sum;
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

/*


3
3 0 1


9
9 6 4 2 3 5 7 0 1

*/