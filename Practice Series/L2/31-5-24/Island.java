import java.util.Scanner;
class Island{
static int solve(int matrix[][],int n,int m){

}
public static void main(String args[]){
Scanner scan = new Scanner(System.in);
int n = scan.nextInt();
int m = scan.nextInt();
int matrix[][] = new int[n][m];
for(int i =0;i<n;i++){
for(int j = 0;j<m;j++){
matrix[i][j] = scan.nextInt();
}
}
System.out.println(solve(matrix,n,m));
}
}