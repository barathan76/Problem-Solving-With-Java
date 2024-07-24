import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
class Q7{




static void recursive(int adj[][],int index,int prev,int n,int d,List<List<Integer>> list,boolean visited[]){

if(d == 0)
	return;

for(int i =0;i<n;i++){
if(adj[prev][i] == 0)
	continue;
if(adj[prev][i]<=d && !visited[i]){
	List<Integer> sub = list.get(index);
	sub.add(i);
	visited[i] = true;
	recursive(adj,index,i,n,d-adj[prev][i],list,visited);
}

}
}
static int solve(int arr[][],int n,int e,int d){

int adj[][] = new int[n][n];
for(int i =0;i<e;i++){
adj[arr[i][0]][arr[i][1]] = arr[i][2];
adj[arr[i][1]][arr[i][0]] = arr[i][2];
}
for(int i =0;i<n;i++){
for(int j =0;j<n;j++)
	System.out.print(adj[i][j]+ " ");
System.out.println();

}



List<List<Integer>> list = new ArrayList<>();
for(int i =0;i<n;i++)
	list.add(new ArrayList<Integer>());



for(int i =0;i<n;i++){
boolean visited[] = new boolean[n];
visited[i] = true;
for(int j =0;j<n;j++){
if(adj[i][j] == 0)
	continue;
if(adj[i][j]<=d && !visited[j]){
	List<Integer> sub = list.get(i);
	sub.add(j);
	visited[j] = true;
	recursive(adj,i,j,n,d-adj[i][j],list,visited);
}
}
}
int nb[] = new int[n];
System.out.println("-------------------");
int min = Integer.MAX_VALUE;
for(int i = 0;i<list.size();i++){
List<Integer> sub = list.get(i);
min = Math.min(sub.size(),min);
for(int j : sub){
	if(adj[i][j]<=d)
		nb[i]++;
	System.out.print(j+ " ");
}
System.out.println();
}

System.out.println("-------------------");

int ans = Integer.MIN_VALUE;
for(int i =0;i<list.size();i++){
if(list.get(i).size() == min)
	ans = Math.max(i,ans);
}
return ans;
}
public static void main(String args[]){
Scanner scan = new Scanner(System.in);
int n = scan.nextInt();
int e = scan.nextInt();
int d = scan.nextInt();
int arr[][] = new int[e][3];
for(int i =0;i<e;i++){
arr[i][0] = scan.nextInt();
arr[i][1] = scan.nextInt();
arr[i][2] = scan.nextInt();
}
System.out.println(solve(arr,n,e,d));
}
}