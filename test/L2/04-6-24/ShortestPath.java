import java.util.Scanner;
class ShortestPath{


static boolean check(int arr[][],int i,int j,int n){
if(i>=0 && i<n && j>=0 && j<n && arr[i][j] == 0)
	return true;
else
	return false;
}

static int recursive(int arr[][],int n,int i, int j){
if(i == n -1 && j == n-1)
	return 1;
int min = Integer.MAX_VALUE;
if(check(arr,i,j,n)){
if(check(arr,i+1,j,n))
	min = Math.min(min,1+recursive(arr,n,i+1,j));
if(check(arr,i,j+1,n))
	min = Math.min(min,1+recursive(arr,n,i,j+1));
if(check(arr,i+1,j+1,n))
	min = Math.min(min,1+recursive(arr,n,i+1,j+1));

return min;
}else 
	return -1;
}
static int shortestPath(int arr[][],int n){
return recursive(arr,n,0,0);



}
public static void main(String args[]){
Scanner scan = new Scanner(System.in);
int n = scan.nextInt();
int matrix[][] = new int[n][n];
for(int i =0;i<n;i++){
for(int j = 0 ;j<n;j++){
matrix[i][j] = scan.nextInt();
}
}
int ans = shortestPath(matrix,n);
if(ans<0)
	System.out.println(-1);
else
	System.out.println(ans);
}
}