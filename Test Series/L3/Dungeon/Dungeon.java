import java.util.Scanner;






public class Dungeon{

static int minT = Integer.MAX_VALUE;
static int minG = Integer.MAX_VALUE;
static String minPathT = "";
static String minPathG = "";



static int findM(char arr[][],int x,int y,int n,boolean visited[][],int steps){
if(x == n || y == n || x<0 || y<0 || visited[x][y])
	return Integer.MAX_VALUE;


if(arr[x][y] == 'G'){
	return steps;
}



int direction[][] = {{-1,0},{0,-1},{0,1},{1,0}};
int minVal = Integer.MAX_VALUE;
for(int i =0;i<direction.length;i++){
visited[x][y] = true;
minVal = Math.min(findM(arr,x+direction[i][0],y+direction[i][1],n,visited,steps+1),minVal);
visited[x][y] = false;
}

return minVal;
}




static int findT(char arr[][],int x,int y,int n,boolean visited[][],int steps,String movePath){
if(x == n || y == n || x<0 || y<0 || arr[x][y] == 'P'|| visited[x][y])
	return Integer.MAX_VALUE;


if(arr[x][y] == 'T'){
	if(steps < minT){
		minT = steps;
		minPathT = movePath;
}
	return steps;
}



int direction[][] = {{-1,0},{0,-1},{0,1},{1,0}};
int minVal = Integer.MAX_VALUE;
for(int i =0;i<direction.length;i++){
visited[x][y] = true;
minVal = Math.min(findT(arr,x+direction[i][0],y+direction[i][1],n,visited,steps+1,movePath+",(" +(x+direction[i][0])+"," +(y+direction[i][1])+")"),minVal);
visited[x][y] = false;
}

return minVal;
}


static int findG(char arr[][],int x,int y,int n,boolean visited[][],int steps,String movePath){
if(x == n || y == n || x<0 || y<0 || arr[x][y] == 'P'|| visited[x][y])
	return Integer.MAX_VALUE;


if(arr[x][y] == 'G'){
	if(steps < minG){
		minG = steps;
		minPathG = movePath;
}
	return steps;
}



int direction[][] = {{-1,0},{0,-1},{0,1},{1,0}};
int minVal = Integer.MAX_VALUE;
for(int i =0;i<direction.length;i++){
visited[x][y] = true;
minVal = Math.min(findG(arr,x+direction[i][0],y+direction[i][1],n,visited,steps+1,movePath+",(" +(x+direction[i][0])+"," +(y+direction[i][1])+")"),minVal);
visited[x][y] = false;
}

return minVal;
}

static void solve(char arr[][],int n){
int x = 0;
int y = 0;
int x1 = 0;
int y1 = 0;
int x2 = 0;
int y2 = 0;
boolean flag = false;
for(int i =0;i<n;i++){
for(int j =0;j<n;j++){
if(arr[i][j] == 'A'){
x = i;
y = j;
}
if(arr[i][j] == 'M'){
x1 = i;
y1 = j;
}
if(arr[i][j] == 'T'){
x2 = i;
y2 = j;
}
}
}


boolean visited[][] = new boolean[n][n];

int t = findT(arr,x,y,n,visited,0,"(" +(x)+"," +(y)+")");
int m = findM(arr,x1,y1,n,visited,0);
if(t == Integer.MAX_VALUE){
System.out.println("NO solution");
return;
}
int g = findG(arr,x2,y2,n,visited,0,"");
System.out.println((minT+minG) + " " +minPathT+minPathG);

}
public static void main(String args[]){
Scanner scan = new Scanner(System.in);
int n = scan.nextInt();
char arr[][] = new char[n][n];
for(int i =0;i<n;i++){
for(int j =0;j<n;j++)
	arr[i][j] = scan.next().charAt(0);
}
solve(arr,n);
}
}