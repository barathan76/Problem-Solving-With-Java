import java.util.Scanner;
class Richest{
static int calculate(int grid[][],int n,int m){
int max = Integer.MIN_VALUE;
for(int i =0;i<n;i++){
int sum = 0;
for(int j =0;j<m;j++){
sum +=grid[i][j];
}
max = Math.max(max,sum);
}
return max;
}
public static void main(String args[]){
Scanner scan = new Scanner(System.in);
System.out.print("Enter the number of customers  : ");
int n = scan.nextInt();
System.out.println();
System.out.print("Enter the number of banks : ");
int m = scan.nextInt();
int grid[][] = new int[n][m];

System.out.println("Enter the amount in the banks for each customer..................");
for(int i = 0;i<n;i++){
for(int j =0;j<m;j++){
grid[i][j] = scan.nextInt();
}
System.out.println();
}
System.out.println(calculate(grid,n,m));

}
}
