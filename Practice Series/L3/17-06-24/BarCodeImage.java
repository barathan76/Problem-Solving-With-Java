import java.util.Scanner;
import java.util.Arrays;
class BarCodeImage{
static int solve(char arr[][],int index,int m,int n,int x,int y){





int[] dp = new int[m + 1];
        Arrays.fill(dp, Integer.MAX_VALUE);
        dp[0] = 0;
        
        for (int j = 0; j < n; j++) {
            int[] costWhite = new int[m + 1];
            int[] costBlack = new int[m + 1];
            
            for (int i = 0; i < m; i++) {
                if (arr[i][j] == '#') {
                    costWhite[i + 1] = costWhite[i];
                    costBlack[i + 1] = costBlack[i] + 1;
                } else {
                    costWhite[i + 1] = costWhite[i] + 1;
                    costBlack[i + 1] = costBlack[i];
                }
            }
            
            for (int i = 1; i <= m; i++) {
                for (int k = x; k <= y; k++) {
                    if (i - k >= 0) {
                        dp[i] = Math.min(dp[i], dp[i - k] + Math.min(costWhite[i] - costWhite[i - k], costBlack[i] - costBlack[i - k]));
                    }
                }
            }
        }
        
        return dp[m];

}

/*if(index == n)
	return 0;
int count = 0;
int dotCount = 0;
int hashCount = 0;
for(int i =0;i<m;i++){
if(arr[i][index] == '.')
	dotCount++;
else
	hashCount++;
}
int a,b;
a = dotCount+ solve(arr,index+1,m,n,x+1,y,true);
b = hashCount+ solve(arr,index+1,m,n,x+1,y,true);

c = dotCount+solve(arr,index+1,m,n,1,y);
d = hashCount+ solve(arr,index+1,m,n,1,y);

return Math.min(a,b);
	


}*/
public static void main(String args[]){
Scanner scan = new Scanner(System.in);
int m = scan.nextInt();
int n = scan.nextInt();
char arr[][] = new char[m][n];
for(int i =0;i<m;i++){
for(int j = 0;j<n;j++)
	arr[i][j] = scan.next().charAt(0);
}
scan.nextLine();
int x = scan.nextInt();
int y = scan.nextInt();
System.out.println(solve(arr,0,m,n,x,y));
}
}