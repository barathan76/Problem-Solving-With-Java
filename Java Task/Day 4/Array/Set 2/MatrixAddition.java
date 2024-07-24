class MatrixAddition
{
static int[][] addMatrix(int[][] matrix1,int[][] matrix2){
int r1 = matrix1.length;
int r2 = matrix2.length;
int c1 = matrix1[0].length;
int c2 = matrix2[0].length;

if(r1==r2 && c1 == c2){
int ans[][] = new int[r1][c1];
for(int i=0;i<r1;i++){
for(int j =0;j<c1;j++){
ans[i][j] = matrix1[i][j] + matrix2[i][j];
}
}
return ans;
}
return null;
}

public static void main(String args[]){
int matrix1[][]  = {{1,2,3},{4,5,6},{7,8,9}};
int matrix2[][] = {{9,8,7},{6,5,4},{3,2,1}};

int ans[][] = addMatrix(matrix1,matrix2);
for(int[] row : ans){
for(int i : row){
System.out.print(i+" ");
}
System.out.println();
}
}
}
