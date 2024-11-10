import java.util.Scanner;
class TribonacciSeries{

static int solve(int n){

int arr[] = new int[n+1];
arr[0] = 0;
arr[1] = 1;
arr[2] = 1;
for(int i =3;i<=n;i++)
	arr[i] = arr[i-1]+arr[i-2]+arr[i-3];

return arr[n];
}

public static void main(String args[]){
Scanner scan = new Scanner(System.in);
int n = scan.nextInt();
System.out.println(solve(n));
}


}