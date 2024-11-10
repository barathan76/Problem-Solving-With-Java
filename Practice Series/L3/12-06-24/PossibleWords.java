import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

class PossibleWords{

static boolean checkBoundry(int i,int j,int n,int m){
return (i>=0 && i<n && j>=0 && j<m);
}


static boolean check(char arr[][],int i,int j,int n,int m,String word,int index,int row[],int col[],boolean visited[][]){

if(arr[i][j] != word.charAt(index))
	return false;
if(visited[i][j] == true)
	return false;

if(arr[i][j] == word.charAt(index) && index == word.length()-1)
	return true;

if(arr[i][j] == word.charAt(index)){
visited[i][j] = true;
for(int k =0;k<row.length;k++){
if(checkBoundry(i+row[k],j+col[k],n,m)){
	if(check(arr,i+row[k],j+col[k],n,m,word,index+1,row,col,visited))	
		return true;
}
}
}
return false;
}

static boolean possible(char arr[][],int n,int m,String word){

int row[] = {-1, 0,0,1};
int col[] = { 0,-1,1,0};

for(int i =0;i<n;i++){
for(int j = 0;j<m;j++){
if(arr[i][j] == word.charAt(0)){
boolean visited[][] = new boolean[n][m];
	if(check(arr,i,j,n,m,word,0,row,col,visited))
		return true;
}
}
}
return false;

}








static List<String> solve(char arr[][], int n,int m, String[] words,int l){
List<String> list = new ArrayList<String>();
for(int i =0;i<l;i++){
if(possible(arr,n,m,words[i]))
	list.add(words[i]);
}

return list;

}

public static void main(String args[]){
Scanner scan = new Scanner(System.in);
int n = scan.nextInt();
int m = scan.nextInt();
scan.nextLine();
char arr[][] = new char[n][m];
for(int i=0;i<n;i++){
for(int j=0;j<m;j++){
	arr[i][j] = scan.next().charAt(0);
}
}
scan.nextLine();
int l = scan.nextInt();
scan.nextLine();
String[] words = new String[l];
for(int i =0;i<l;i++){
words[i] = scan.nextLine();
}
List<String> ans = solve(arr,n,m,words,l);
System.out.println("Possible Words");
for(String s: ans){
System.out.println(s);
}
}
}