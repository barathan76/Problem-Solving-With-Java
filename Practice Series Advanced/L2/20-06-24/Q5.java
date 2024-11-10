import java.util.Scanner;
class Q5{
	
	static void printTriangle(int n,int index,int k,int l,int m){
		if(index == n-1){
			for(int i =0;i<=k;i++){
				if(i == k || i == l)
				System.out.print("*");
			else
				System.out.print(" ");
			}
			System.out.println();
			return;
		}
			
		for(int i =0;i<m;i++){
			if(i == k || i == l)
				System.out.print("*");
			else
				System.out.print(" ");
			
		}
		System.out.println();
		printTriangle(n,index+1,k+1,l-1,m);
		}
		
	static void solve(int n){
		for(int i =0;i<2*n-1;i++)
			System.out.print("*");
		System.out.println();
		printTriangle(n,1,1,2*n-3,2*n-1);
		
	}
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		solve(n);
	}
}