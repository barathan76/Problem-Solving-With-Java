import java.util.Scanner;
import java.util.Queue;
import java.util.LinkedList;
class NearestZero{
static int[][] solve(int[][] mat,int m,int n) {
        class Pair{
            int row;
            int col;
            Pair(int row, int col){
                this.row = row;
                this.col = col;
            }
        }
        Queue<Pair> queue = new LinkedList<>();
        int ans[][] = new int[m][n];
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                if(mat[i][j] == 0){
                    queue.offer(new Pair(i, j));
                    ans[i][j] = 0;
                }
                else{
                    ans[i][j] = -1;
                }
            }
        }
        while(!queue.isEmpty()){
            Pair temp = queue.poll();
            int row = temp.row;
            int col = temp.col;
            if(isValid(row, col+1, m,n) && ans[row][col+1] == -1){
                queue.offer(new Pair(row, col+1));
                ans[row][col+1] = ans[row][col] + 1;
            }
            if(isValid(row, col-1, m,n) && ans[row][col-1] == -1){
                queue.offer(new Pair(row, col-1));
                ans[row][col-1] = ans[row][col] + 1;
            }
            if(isValid(row+1, col, m,n) && ans[row+1][col] == -1){
                queue.offer(new Pair(row+1, col));
                ans[row+1][col] = ans[row][col] + 1;
            }
            if(isValid(row-1, col, m,n) && ans[row-1][col] == -1){
                queue.offer(new Pair(row-1, col));
                ans[row-1][col] = ans[row][col] + 1;
            }
        }
        return ans;
}

static boolean isValid(int i, int j, int m, int n){
if(i < 0 || i >= m || j < 0 || j >= n)
        return false;
return true;
}
static void printArray(int arr[][],int m,int n){
for(int i =0;i<m;i++){
for(int j =0;j<n;j++){
System.out.print(arr[i][j]+" ");
}
System.out.println();
}
}
public static void main(String args[]){
Scanner scan = new Scanner(System.in);
int m  = scan.nextInt();
int n = scan.nextInt();
int arr[][] = new int[m][n];
for(int i =0;i<m;i++){
for(int j =0;j<n;j++){
arr[i][j] = scan.nextInt();
}
}
int ans[][] = solve(arr,m,n);
printArray(ans,m,n);
}
}