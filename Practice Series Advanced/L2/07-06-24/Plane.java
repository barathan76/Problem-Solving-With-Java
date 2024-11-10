import java.util.Scanner;
class Plane{

static int solve(int arr[][],int n){

int sum = 0;
for(int i =0;i<n-1;i++){
int val = Math.max(Math.abs(arr[i][0] - arr[i+1][0]), Math.abs(arr[i][1] - arr[i+1][1]));
System.out.println(val);
sum+=val;
}
return sum;
}
public static void main(String args[]){
Scanner scan = new Scanner(System.in);

int n = scan.nextInt();
int arr[][] = new int[n][2];
for(int i =0;i<n;i++){
arr[i][0] = scan.nextInt();
arr[i][1] = scan.nextInt();
}

System.out.println(solve(arr,n));
}
}