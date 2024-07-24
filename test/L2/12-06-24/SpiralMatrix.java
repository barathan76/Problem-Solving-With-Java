/* 12:02 - 12:13*/
import java.util.Scanner;
class SpiralMatrix{



static void spiralRPrint(int matrix[][],int left,int right,int top,int bottom){
if(left>right || top>bottom)
	return;

for(int i =left;i<=right;i++)
	System.out.print(matrix[top][i]+" ");
top++;
for(int i = top;i<=bottom;i++)
	System.out.print(matrix[i][right]+" ");
right--;
if(bottom>top){
for(int i =right;i>=left;i--)
	System.out.print(matrix[bottom][i]+ " ");
bottom--;
}
if(right>left){
for(int i =bottom;i>=top;i--)
	System.out.print(matrix[i][left]+ " ");
}
left++;

spiralRPrint(matrix,left,right,top,bottom);

}
static void spiralPrint(int matrix[][],int n,int m){
int left = 0,right = m-1,top = 0,bottom = n-1;

while(left<=right && top<=bottom){
for(int i =left;i<=right;i++)
	System.out.print(matrix[top][i]+" ");
top++;
for(int i = top;i<=bottom;i++)
	System.out.print(matrix[i][right]+" ");
right--;
if(bottom>top){
for(int i =right;i>=left;i--)
	System.out.print(matrix[bottom][i]+ " ");
bottom--;
}
if(right>left){
for(int i =bottom;i>=top;i--)
	System.out.print(matrix[i][left]+ " ");
}
left++;
}
}
public static void main(String args[]){
Scanner scan = new Scanner(System.in);
int n = scan.nextInt();
int m = scan.nextInt();
int matrix[][]= new int[n][m];
for(int i =0;i<n;i++){
for(int j = 0;j<m;j++){
matrix[i][j] = scan.nextInt();
}
}
spiralPrint(matrix,n,m);
System.out.println();
spiralRPrint(matrix,0,m-1,0,n-1);

}
}