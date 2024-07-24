import java.util.Scanner;
class SpiralForm{

static void solve(int arr[][],int n,int m){
int top = 0,bottom = n-1,left = 0,right = m-1;
while(top<=bottom && left<=right){
for(int i =left;i<=right;i++)
	System.out.print(arr[top][i]+" ");
top++;
for(int i =top;i<=bottom;i++)
	System.out.print(arr[i][right]+" ");
right--;
if(top<=bottom){
for(int i =right;i>=left;i--)
	System.out.print(arr[bottom][i]+" ");
bottom--;
}
if(left<=right){
for(int i =bottom;i>=top;i--)
	System.out.print(arr[i][left]+" ");
left++;
}
}
}
public static void main(String args[]){
Scanner scan = new Scanner(System.in);
System.out.print("Enter no of the rows : ");
int n =scan.nextInt();
System.out.print("Enter no of columns : ");
int m = scan.nextInt();
System.out.println("Enter the array elements ");
int arr[][] = new int[n][m];
for(int i =0;i<n;i++)
	for(int j=0;j<m;j++)
		arr[i][j] = scan.nextInt();
solve(arr,n,m);

}
}