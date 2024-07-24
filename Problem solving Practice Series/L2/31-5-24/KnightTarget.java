import java.util.Scanner;
class KnightTarget{
static class Pair{
int x;
int y;
int dist;
Pair(int x,int y,int dist){
this.x =x;
this.y = y;
this.dist =dist;
}
}
static int solve(int x,int y,int tx,int ty, int n){

int[] dx = {-2, -1, 1, 2, -2, -1, 1, 2};
int[] dy = {-1, -2, -2, -1, 1, 2, 2, 1};
Pair[] queue = new Pair[n*n];
boolean visited[][] = new boolean[n][n];
int front = -1,rear = -1;

queue[++rear] = new Pair(x,y,0);

visited[x][y] = true;

while(front!=rear){
Pair current = queue[++front];
if(current.x == tx && current.y == ty)
	return current.dist;
for(int i =0;i<8;i++){
if(check(current.x+dx[i],current.y+dy[i],n) && !visited[current.x+dx[i]][current.y+dy[i]]){
visited[current.x+dx[i]][current.y+dy[i]] = true;
queue[++rear] = new Pair(current.x+dx[i],current.y+dy[i],current.dist+1);
}
}
}
return -1;
}

static boolean check(int x,int y, int n){
return (x>=0 && y>=0 && x<n && y<n);
}

public static void main(String args[]){
Scanner scan = new Scanner(System.in);
System.out.print("Enter the size of the chess board : ");
int n = scan.nextInt();
System.out.print("\nEnter the location of the knight : ");
int x= scan.nextInt();
int y= scan.nextInt();
System.out.print("\nEnter the target location : ");
int tx = scan.nextInt();
int ty = scan.nextInt();
System.out.print(solve(x,y,tx,ty,n));
}
}