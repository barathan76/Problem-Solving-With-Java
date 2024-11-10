import java.util.Scanner;
class Islands{
static void recursive(int arr[][],int i,int j,int n,boolean visited[][]){

if(i<0 || i>=n || j<0 || j>=n||arr[i][j] == 0 || visited[i][j])
	return;

int x[] = {-1,-1,-1,0,0,0,1,1,1};
int y[] = {-1,0,1,-1,0,1,-1,0,1};

if(arr[i][j] == 1 && !visited[i][j]){
visited[i][j] = true;
for(int k = 0;k<x.length;k++){
recursive(arr,i+x[k],j+y[k],n,visited);
}
}
}


static int solve(int arr[][],int n){
boolean visited[][] = new boolean[n][n];
int count = 0;
int x[] = {-1,-1,-1,0,0,0,1,1,1};
int y[] = {-1,0,1,-1,0,1,-1,0,1};
for(int i= 0;i<n;i++){
for(int j =0;j<n;j++){
if(arr[i][j] == 1 && !visited[i][j]){
visited[i][j] = true;
count++;
for(int k = 0;k<x.length;k++){
recursive(arr,i+x[k],j+y[k],n,visited);
}
}
}
}

return count;

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
System.out.println(solve(arr,n));
}
}