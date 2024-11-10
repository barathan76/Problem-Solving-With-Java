import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
class Q1{

 
static void recursive(int adj[][],int index,int prev,int n,int steps,List<Integer> ans){

if(index == n-1){
if(adj[index][prev]!=0){
ans.add(steps);
}
return;
}

for(int i= prev+1;i<n;i++){
if(adj[index][i]!=0)
	recursive(adj,i,index,n,steps+adj[index][i],ans);
}
}
public static int solve(int arr[][],int n,int e){

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

List<Integer> ans = new ArrayList<Integer>();
recursive(adj,0,-1,n,0,ans);
int min = Integer.MAX_VALUE;
for(int i : ans){
	min = Math.min(i,min);
}

int count = 0;
for(int i : ans){
	if(i == min)
		count++;
}
return count;

}



public static void main(String args[]){
Scanner scan = new Scanner(System.in);
int n = scan.nextInt();
int e = scan.nextInt();
int arr[][] = new int[e][3];
for(int i =0;i<e;i++){
arr[i][0] = scan.nextInt();
arr[i][1] = scan.nextInt();
arr[i][2] = scan.nextInt();
}
System.out.println(solve(arr,n,e));
}
}