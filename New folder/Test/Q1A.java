import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;
class Q1A{
	public static boolean solve(int arr[][],int n){
		int val = (n*(n+1))/2;
		for(int i =0;i<n;i++){
			int row = 0,col = 0;
			for(int j =0;j<n;j++){
				if(arr[i][j]<1 || arr[i][j]>n || arr[j][i]<1 || arr[j][i]>n)
					return false;
				row+=arr[i][j];
				col+=arr[j][i];
			}
			if(row!= val || col!=val)
				return false;
			}
		int diag1 = 0;
		int diag2 = 0;
		for(int i =0,j = n-1;i<n && j>=0;i++,j--){
			diag1+= arr[i][i];
			diag2+=arr[i][j];
		}
		if(diag1!=val || diag2!=val)
			return false;
		return true;
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