import java.util.Scanner;
class Q2{

static int recursive(int adj[][],int n,int index,int k,int val,boolean visited[]){
if(visited[index])
	return -1;
System.out.println(val);
visited[index] = true;
if(adj[index][k]!=0)
	return val+adj[index][k];

int min = -1;
for(int i = 0;i<n;i++){
if(adj[index][i]!=0){
	visited[i] = true;
	int v = recursive(adj,n,i,k,val+adj[index][i],visited);
	if(v==-1)
		continue;
	if(min == -1)
		min = v;
	else
		min = Math.min(min,v);
	visited[i] = false;
}
}

return min;

}



public static int solve(int arr[][],int n,int e,int k){

int adj[][] = new int[n][n];
for(int i =0;i<e;i++){
adj[arr[i][1]-1][arr[i][0]-1] = arr[i][2];
}

for(int i = 0;i<n;i++){
for(int j = 0;j<n;j++)
	System.out.print(adj[i][j]+ " ");
System.out.println();
}
int ans = -1;

for(int i =0;i<n;i++){
boolean visited[] = new boolean[n];
visited[i] = true;
int min = -1;
if(adj[i][k]!=0){
min = Math.max(ans,adj[i][k]);
}

for(int j = 0;j<n;j++){
if(j == k)
	continue;
if(adj[i][j]!=0){
if(min == -1)
	min = recursive(adj,n,j,k,adj[i][j],visited);
else
	min = Math.min(min,recursive(adj,n,j,k,adj[i][j],visited));
}
}

ans = Math.max(min,ans);
}

return ans;
}

public static void main(String args[]){
Scanner scan = new Scanner(System.in);
int n = scan.nextInt();
int k = scan.nextInt();
int e = scan.nextInt();
int edges[][] = new int[e][3];

for(int i =0;i<e;i++){
edges[i][0] = scan.nextInt();
edges[i][1] = scan.nextInt();
edges[i][2] = scan.nextInt();
}
System.out.println(solve(edges,n,e,k-1));
}
}