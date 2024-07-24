import java.util.Scanner;
class MazeRunner{

static boolean check(int i,int j,int n,int arr[][]){
return (i>=0 && i<n && j>=0 && j<n && arr[i][j] == 1);
}


static boolean recursive(int arr[][],int i,int j,int n,int row[],int col[]){
if(i == n-1 && j == n-1){
System.out.println("("+i+","+j+")");
	return true;
}

for(int k = 0;k<2;k++){
if(check(i+row[k],j+col[k],n,arr)){
	if(recursive(arr,i+row[k],j+col[k],n,row,col)){
		System.out.println("("+i+","+j+")");
		return true;
}
}
}

return false;
}
static void findPath(int arr[][],int n){

int row[] = {0,1};
int col[] = {1,0};
if(!recursive(arr,0,0,n,row,col))
	System.out.println("No path found the rat shall die in the maze :( ");	
}
public static void main(String args[]){
Scanner scan = new Scanner(System.in);
int n = scan.nextInt();
int arr[][] = new int[n][n];
for(int i =0;i<n;i++){
for(int j =0;j<n;j++){
arr[i][j] = scan.nextInt();
}
}
findPath(arr,n);
}
}