import java.util.Scanner;
class Q4{
public static int recursive(int arr[][],int n,int src,int dest,int k,int cost){
if(src == dest && k >=0)
	return cost;
if(k == 0)
	return Integer.MAX_VALUE;

int min = Integer.MAX_VALUE;

for(int i = src;i<n;i++){
if(arr[src][i]!=0)
	min = Math.min(min, recursive(arr,n,i,dest,k-1,cost+arr[src][i]));
}
return min;
}

public static int solve(int arr[][],int n,int e,int src,int dest,int k){

int adj[][] = new int[n][n];
for(int i =0;i<e;i++){
adj[arr[i][0]][arr[i][1]] = arr[i][2];
}

System.out.println("----------Matrix----------");
for(int i =0;i<n;i++){
for(int j =0;j<n;j++)
	System.out.print(adj[i][j]+ " ");
System.out.println();
}
System.out.println("---------------------------");
int ans = recursive(adj,n,src,dest,k,0);
if(ans == Integer.MAX_VALUE)
	return -1;
return ans; 
}

public static void main(String args[]){
Scanner scan = new Scanner(System.in);
int n = scan.nextInt();
int e = scan.nextInt();
int src = scan.nextInt();
int dest = scan.nextInt();
int k = scan.nextInt();
int arr[][] = new int[e][3];
for(int i =0;i<e;i++){
arr[i][0] = scan.nextInt();
arr[i][1] = scan.nextInt();
arr[i][2] = scan.nextInt();
}
System.out.println(solve(arr,n,e,src,dest,k+1));
}
}