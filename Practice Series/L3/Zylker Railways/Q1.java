import java.util.Scanner;
class Q1{
	static void solve(int index,int n){
		if(index == n+1)
			return;
		for(int i =index;i<=n;i++)
			System.out.print(" ");
		for(int i =1;i<=index;i++)
			System.out.print(*+" ");
		System.out.println();
		solve(index+1,n);
	}
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		solve(1,n);
	}
}