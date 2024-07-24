import java.util.Scanner;
class Q6{
	static void print(int m,int k,int l){			
		for(int i =0;i<=m;i++){
			if(i == k || i == l)
				System.out.print("*");
			else
				System.out.print(" ");
			
		}
		System.out.println();
	}
	static void printTriangle1(int n,int index,int k,int l,int m){
		if(index == n){
			print(m,k,l);
			return;
		}
		print(m,k,l);
		printTriangle1(n,index+1,k-1,l+1,m);
		print(m,k,l);
		}
		
	static void solve(int n){
		printTriangle1(n,1,n,n,2*n-1);
	}
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		solve(n);
	}
}