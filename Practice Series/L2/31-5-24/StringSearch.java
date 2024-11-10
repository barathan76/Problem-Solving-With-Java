import java.util.Scanner;
class StringSearch{
static void search(char matrix[][],int n,int m, String str){
for(int i =0;i<n;i++){
String ans = "";
for(int j = 0;j<m;j++){
ans+=matrix[i][j];
}
if(ans.equals(str)){
	System.out.println("Yes");return;
}
}
for(int i = 0;i<m;i++){
String ans = "";
for(int j =0;j<n;j++){
ans+=matrix[j][i];
}

if(ans.equals(str)){
	System.out.println("Yes");return;
}
}
System.out.println("No");
}

public static void main(String args[]){
Scanner scan = new Scanner(System.in);
int n = scan.nextInt();
int m = scan.nextInt();
scan.nextLine();
char matrix[][] = new char[n][m];
for(int i =0;i<n;i++){
for(int j =0;j<m;j++){
matrix[i][j] = scan.next().charAt(0);
}
}
scan.nextLine();
String str = scan.nextLine();
search(matrix,n,m,str);
}
}