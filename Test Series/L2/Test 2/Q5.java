import java.util.Scanner;

class Q5{

static boolean check(int arr[][],int i,int j,int n){
return (i>=0 && i<n && j>=0 && j<n && arr[i][j]!=-1);
}



static int traverse(int arr[][],int i,int j,int n,int row[],int col[],int condition){

if(i == condition && j == condition)
	return arr[i][j];
int max = 0;
for(int k =0;k<2;k++){
if(check(arr,i+row[k],j+col[k],n)){
	if(arr[i][j] == 1){
		arr[i][j] = 0;
		max = Math.max(max, 1+traverse(arr,i+row[k],j+col[k],n,row,col,condition));
}else
	max = Math.max(max, traverse(arr,i+row[k],j+col[k],n,row,col,condition));
}	
}	


return max;
}



static int solve(int arr[][],int n){


int row1[] = {0,1};
int col1[] = {1,0};

int row2[] = {0,-1};
int col2[] = {-1,0};
int x = traverse(arr,0,0,n,row1,col1,n-1);
int y = traverse(arr,n-1,n-1,n,row2,col2,0);
System.out.print(x+","+y);

return (traverse(arr,0,0,n,row1,col1,n-1) + traverse(arr,n-1,n-1,n,row2,col2,0))*2 - 1;


}

public static void main(String args[]){
Scanner scan = new Scanner(System.in);
int n = scan.nextInt();
int arr[][] = new int[n][n];
for(int i =0;i<n;i++){
	for(int j =0;j<n;j++)
		arr[i][j] = scan.nextInt();
}

System.out.println(solve(arr,n));


}

}