import java.util.Scanner;
class MatrixDeterminant{



public static int[][] getMatrix(int matrix[][],int col,int n){

int arr[][] = new int[n][n];
for(int i =1;i<n+1;i++){
int c = 0;
for(int j= 0;j<n+1;j++){
if(j == col)
	continue;
arr[i-1][c++] = matrix[i][j];
}
}
return arr;
}

public static int find(int matrix[][],int n){
if(n==1)
	return matrix[0][0];

int determinant = 0;

for(int i =0;i<n;i++){
if(i%2 == 0)
	determinant += matrix[0][i]*find(getMatrix(matrix,i,n-1),n-1);
else
	determinant -= matrix[0][i]*find(getMatrix(matrix,i,n-1),n-1);
}

return determinant;
}

public static void main(String args[]){
Scanner scan = new Scanner(System.in);
int n = scan.nextInt();

int matrix[][] = new int[n][n];
for(int i =0;i<n;i++){
for(int j = 0;j<n;j++){
matrix[i][j] = scan.nextInt();
}
}

System.out.println(find(matrix,n));

}

}