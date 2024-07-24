import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
class LuckyNumber{
static List<Integer> solve(int arr[][],int n,int m){
List<Integer> ans = new ArrayList<Integer>();

int minRow[] = new int[n];
int maxCol[] = new int[m];
for(int i =0;i<n;i++){
int min = arr[i][0];
for(int j =1;j<m;j++){
if(arr[i][j] < min)
	min = arr[i][j];
}
minRow[i] = min;
}

for(int i =0;i<m;i++){
int max = arr[0][i];
for(int j =1;j<n;j++){
if(arr[j][i] > max)
	max = arr[j][i];
}
maxCol[i] = max;
}

for(int i =0;i<n;i++){
for(int j =0;j<m;j++){
if(arr[i][j]<=minRow[i] && arr[i][j]>=maxCol[j])
	ans.add(arr[i][j]);
}
}
return ans;
}
public static void main(String args[]){
Scanner scan = new Scanner(System.in);
int n = scan.nextInt();
int m = scan.nextInt();
int arr[][] = new int[n][m];
for(int i =0;i<n;i++){
for(int j = 0;j<m;j++)
	arr[i][j] = scan.nextInt();
}
System.out.print(solve(arr,n,m));
}
}