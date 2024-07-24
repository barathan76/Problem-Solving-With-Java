import java.util.Scanner;
class Q2{
	static void print(int index,int n,int k){
		for(int i =index;i<=n;i++)
			System.out.print(" ");
		for(int i =1;i<=k;i++)
			System.out.print("*");
		System.out.println();
	}
	static void solve(int index,int n,int k){
		if(index == n){
			print(index,n,k);
			return;
		}
			
		print(index,n,k);
		solve(index+1,n,k+2);
		print(index,n,k);
	}
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		solve(1,n,1);
	}
}