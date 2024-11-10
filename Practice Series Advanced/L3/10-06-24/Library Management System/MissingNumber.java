/*5:01 - */

class MissingNumber{
static int solve(int arr[],int n){
	int sum = 0;
	for(int i =0;i<n;i++)
		sum+=arr[i];
	int act = (n*(n-1))/2;
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