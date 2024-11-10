import java.util.Scanner;
class SurfaceArea{
static int solve(int arr[][],int n,int m){
int area  = 0;
for(int i =0;i<n;i++){
for(int j =0;j<m;j++){
area+=getArea(arr,i,j,n,m);
}
}
return area;
}

static int getArea(int arr[][],int i,int j,int n,int m){
if(arr[i][j] == 0)
	return 0;
int area = 2+(4*arr[i][j]);
if(i>0)
	area-=Math.min(arr[i][j],arr[i-1][j]);
if(i<n-1)
	area-=Math.min(arr[i][j],arr[i+1][j]);
if(j>0)
	area-=Math.min(arr[i][j],arr[i][j-1]);
if(j<m-1)
	area-=Math.min(arr[i][j],arr[i][j+1]);

return area;
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