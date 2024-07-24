import java.util.Scanner;
class SpiralMatrix{
static void spiralPrint(int arr[][],int m,int n){
int top = 0,bottom = m-1,left = 0,right = n-1;
while(left<=right && top<=bottom){
for(int i =left;i<=right;i++)
	System.out.print(arr[top][i]+" ");
top++;

for(int i = top;i<=bottom;i++)
	System.out.print(arr[i][right]+" ");	

right--;


if(bottom>=top)
{
	for(int i =right;i>=left;i--)
		System.out.print(arr[bottom][i]+" ");
bottom--;
}

if(right>=left){
	for(int i =bottom;i>=top;i--)
		System.out.print(arr[i][left]+" ");
left++;
}

}
}
public static void main(String args[]){
Scanner scan = new Scanner(System.in);
int m = scan.nextInt();
int n = scan.nextInt();
int matrix[][] = new int[m][n];

for(int i =0;i<m;i++)
	for(int j =0;j<n;j++)
		matrix[i][j] = scan.nextInt();

spiralPrint(matrix,m,n);
}
}