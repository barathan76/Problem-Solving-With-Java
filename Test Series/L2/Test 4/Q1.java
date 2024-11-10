/*4:38 - 4:48*/
import java.util.Scanner;
class Q1{
	static void print(int index,char c,int n){
		for(int i = index;i<n;i++)
			System.out.print(" ");
		for(int i =0;i<=index;i++)
			System.out.print(c+" ");
		System.out.println();
	}
	static void pattern1(int index,int n){
		if(index == n)
			return;
		print(index,'*',n);
		pattern1(index+1,n);
	}
	static void pattern2(int index,int n){
		if(index == n/2){
			print(index,'R',n);
			return;
		}
		print(index,'R',n);
		pattern2(index+1,n);
		print(index,'R',n);
	}
	static void solve(int n){
		pattern1(0,n);
		pattern2(0,n);
		
	}
public static void main(String args[]){
	Scanner scan = new Scanner(System.in);
	int n = scan.nextInt();
	solve(n);
}
}