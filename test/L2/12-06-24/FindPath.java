import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
class FindPath{

static boolean solve(int arr[][],int n,int i,int j,boolean visited[][],List<String> ans){

if(i == n-1 && j == n-1){
	ans.add("("+i+","+j+")"+" ");
	return true;
}

if(i<0 || i>=n || j<0 || j>=n || visited[i][j])
	return false;

visited[i][j] = true;
if(solve(arr,n,i+arr[i][j],j,visited,ans)){
	ans.add("("+i+","+j+")"+" ");
	return true;
}

else if(solve(arr,n,i-arr[i][j],j,visited,ans)){
	ans.add("("+i+","+j+")"+" ");
	return true;
}
else if(solve(arr,n,i,j+arr[i][j],visited,ans)){
	ans.add("("+i+","+j+")"+" ");
	return true;
}

else if(solve(arr,n,i,j-arr[i][j],visited,ans)){
	ans.add("("+i+","+j+")"+" ");
	return true;
}

return false;
}
public static void main(String args[]){
Scanner scan = new Scanner(System.in);
int n = scan.nextInt();
int arr[][]= new int[n][n];
for(int i =0;i<n;i++){
for(int j = 0;j<n;j++){
arr[i][j] = scan.nextInt();
}
}
boolean visited[][] = new boolean[n][n];
List<String> ans = new ArrayList<String>();
solve(arr,n,0,0,visited,ans);
for(int i =ans.size()-1;i>=0;i--)
	System.out.print(ans.get(i)+" ");
}
}