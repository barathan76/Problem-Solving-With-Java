import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
class ZeroConvert{
static void convert(int arr[][],int n,int m){
List<Integer[]> zeroList = new ArrayList<Integer[]>();
for(int i = 0;i<n;i++){
for(int j = 0;j<m;j++){
if(arr[i][j] == 0)
	zeroList.add(new Integer[]{i,j});
}
}

for(Integer[] a : zeroList){
int i = a[0];
int j = a[1];
for(int k =0;k<n;k++)
	arr[k][j] = 0;

for(int k= 0;k<m;k++)
	arr[i][k] = 0;
}


}
public static void main(String args[]){
Scanner scan = new Scanner(System.in);
int n = scan.nextInt();
int m = scan.nextInt();
int matrix[][] = new int[n][m];
for(int i =0;i<n;i++){
for(int j = 0 ;j<m;j++){
matrix[i][j] = scan.nextInt();
}
}
convert(matrix,n,m);
for(int i =0;i<n;i++){
for(int j = 0 ;j<m;j++){
System.out.print(matrix[i][j]);
}
System.out.println();
}
}
}