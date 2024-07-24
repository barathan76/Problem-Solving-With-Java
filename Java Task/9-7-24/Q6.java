import java.util.Scanner;
class Q6{


static double recursive(double arr[][],int n,int start,int end,double cost){
if(start == end)
	return cost;

double max = Integer.MIN_VALUE;

for(int i =start;i<n;i++){
	if(arr[start][i]!=0)
		max = Math.max(recursive(arr,n,i,end,cost*arr[start][i]),max);
}
return max;
}
static double solve(int edges[][],double prob[],int n,int e,int start,int end){

double adj[][] = new double[n][n];
for(int i =0;i<e;i++){
adj[edges[i][0]][edges[i][1]] = prob[i];
adj[edges[i][1]][edges[i][0]] = prob[i];
}

for(int i =0;i<n;i++){
for(int j =0;j<n;j++)
	System.out.print(adj[i][j]+ " ");
System.out.println();

}

double ans = recursive(adj,n,start,end,1);
if(ans < 0)
	return 0.0;
return ans;
}
public static void main(String args[]){
Scanner scan = new Scanner(System.in);
int n = scan.nextInt();
int e = scan.nextInt();
int start = scan.nextInt();
int end = scan.nextInt();
int edges[][] = new int[e][2];
double prob[] = new double[e];
for(int i =0;i<e;i++){
	edges[i][0] = scan.nextInt();
	edges[i][1] = scan.nextInt();
}
for(int i =0;i<e;i++){
prob[i] = scan.nextDouble();
}

System.out.println(solve(edges,prob,n,e,start,end));
}
}