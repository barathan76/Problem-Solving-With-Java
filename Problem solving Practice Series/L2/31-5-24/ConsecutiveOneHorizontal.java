import java.util.Scanner;
class ConsecutiveOneHorizontal{
static int countHorizontal(int matrix[][],int n,int m){
int count = 0;
for(int i = 0;i<n;i++){
int subcount = 0;
int k = 0;
for(int j = 0;j<m;j++){
if(subcount == 0 && matrix[i][j] == 1){
count++;
subcount++;
}
if(subcount>0 && matrix[i][j] ==0){
subcount--;
}

}
System.out.println(count);
}
return count;
}

static boolean check(int j,int m){
return j>=0 && j<m;
}
public static void main(String args[]){
Scanner scan = new Scanner(System.in);
int n = scan.nextInt();
int m = scan.nextInt();
int matrix[][] = new int[n][m];
for(int i =0;i<n;i++){
for(int j = 0;j<m;j++){
matrix[i][j] = scan.nextInt();
}
}
System.out.println(countHorizontal(matrix,n,m));
}
}