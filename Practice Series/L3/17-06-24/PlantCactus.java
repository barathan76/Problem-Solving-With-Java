import java.util.Scanner;
class PlantCactus{

static void check(char arr[][],int i,int j,int n,int m){
if(i<0 || i>=n || j<0 ||j>m || arr[i][j] == '#')
	return false;
else 
	return true;
}
static boolean solve(char arr[],int n,int m,int index){

if(index == n){
for(int i =0;i<n;i++){

}
}
for(int i =0;i<n;i++){
for(int j = 0;j<m;j++){

}

}
}

}
public static void main(String args[]){
Scanner scan = new Scanner(System.in);
int n = scan.nextInt();
int m = scan.nextInt();
char arr[][] = new char[n][m];
for(int i =0;i<n;i++){
for(int j =0;j<m;j++){
arr[i][j] = scan.next().charAt(0);
}
}
if(solve(arr,n,m)){
System.out.println("YES");
for(int i =0;i<n;i++){
for(int j =0;j<m;j++){
System.out.println(arr[i][j]);
}
}
}
else{
System.out.println("NO");
}
}

}