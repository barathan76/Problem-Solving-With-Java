import java.util.Scanner;
class Q1{
	public static boolean solve(int arr[][],int n){
		int val = (n*(n+1))/2;
		int rowSum[] = new int[n];
		int colSum[] = new int[n];
		for(int i =0;i<n;i++){
			for(int j =0;j<n;j++){
				if(arr[i][j]<1 || arr[i][j]>n)
					return false;
				rowSum[i]+=arr[i][j];
				colSum[j]+=arr[i][j];
			}
		}
		for(int i =0;i<n;i++){
			if(rowSum[i]!= val || colSum[i]!=val)
				return false;
		}
		return true;
				/*Set<Integer> set1 = new HashSet<Integer>();
		Set<Integer> set2 = new HashSet<Integer>();*/
	}
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int arr[][] = new int[n][n];
		for(int i=0;i<n;i++){
			for(int j =0;j<n;j++)
				arr[i][j] = scan.nextInt();
		}
		System.out.println(solve(arr,n));
	}
}