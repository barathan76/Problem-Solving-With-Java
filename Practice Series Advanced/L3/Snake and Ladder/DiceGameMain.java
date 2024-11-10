import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;
import java.util.Arrays;
class DiceGameMain{
static void play(int board[][]){
int a[] = {1};
Scanner scan = new Scanner(System.in);
int n = scan.nextInt();
a[0]+=n;

printArrayWithA(board,a);
Map<Integer,Snake> snakeMap = addSnakes();
Map<Integer,Ladder> ladderMap = addLadders();
printArrayWithSnakeAndLadder(board,a,snakeMap,ladderMap);
System.out.println("Enter the number of players");
int l = scan.nextInt();
int players[] = new int[l];
Arrays.fill(players,0);
while(true){
System.out.println("Enter 1 to continue playing\nEnter 2 to exit");
int c = scan.nextInt();

switch(c){
	case 1:	for(int i =0;i<l;i++){
		throwDice(players,i,snakeMap,ladderMap);
		if(players[i] == 100){
		System.out.println("Player "+(i+1)+" won the match......"); return;
}
		printArrayWithSnakeAndLadder(board,players,snakeMap,ladderMap);
}
		break;
	case 2: return;
}
}
}


static void throwDice(int a[],int i ,Map<Integer,Snake> snakeMap,Map<Integer,Ladder> ladderMap){


System.out.println("Player "+(i+1));
Scanner scan = new Scanner(System.in);
System.out.println("Enter dice number (1-6) :" );
int n = scan.nextInt();
int k = a[i]+n;
if(k>100)
	k = 100;
if(snakeMap.containsKey(k)){
	Snake snake = snakeMap.get(k);
	if(snake.start == k)
		k = snake.end;
}
else if(ladderMap.containsKey(k)){
	Ladder ladder = ladderMap.get(k);
	if(ladder.end == k)
		k = ladder.start;
}
a[i] = k;
}



static Map<Integer,Snake> addSnakes(){
int snakes[][] = {{40,3},{43,18},{27,5},{54,31},{89,53},{66,45},{76,58},{99,41}};
Map<Integer,Snake> snakeMap = new HashMap<Integer,Snake>();
int count = 1;
for(int i =0;i<snakes.length;i++,count++){
Snake snake = new Snake(count,snakes[i][0],snakes[i][1]);
snakeMap.put(snakes[i][0],snake);
snakeMap.put(snakes[i][1],snake);
}
return snakeMap;
}


static void printArrayWithA(int board[][], int a[]){
for(int i=0;i<10;i++){
for(int j =0;j<10;j++){
if(board[i][j] != a[0])
	System.out.printf("%5s",board[i][j]);
else
	System.out.printf("%5s","A");

}
System.out.println();
}
}
static void printArrayWithSnakeAndLadder(int board[][],int a[],Map<Integer,Snake> snakeMap,Map<Integer,Ladder> ladderMap){
for(int i=0;i<10;i++){
for(int j =0;j<10;j++){
boolean flag = false;
for(int k = 0;k<a.length;k++){
if(board[i][j] == a[k]){
	String line = "[P"+(k+1)+"]";
	System.out.printf("%6s",line);
	flag = true;
}
}
if(!flag){
if(snakeMap.containsKey(board[i][j])){
	String line = "S"+snakeMap.get(board[i][j]).id+"";
	System.out.printf("%6s",line);
}
else if(ladderMap.containsKey(board[i][j])){
	String line = "L"+ladderMap.get(board[i][j]).id+"";
	System.out.printf("%6s",line);
}
else{
	String line = board[i][j]+"";
	System.out.printf("%6s",line);
	
}
}
}
System.out.println();
}
}
static void printArray(int board[][]){
for(int i=0;i<10;i++){
for(int j =0;j<10;j++){
System.out.print(board[i][j]+" ");
}
System.out.println();
}
}
static Map<Integer,Ladder> addLadders(){
int count =1;
int ladders[][] = {{25,4},{46,13},{49,33},{69,50},{63,42},{81,62},{92,74}};
Map<Integer,Ladder> ladderMap = new HashMap<Integer,Ladder>();
for(int i=0;i<ladders.length;i++,count++){
Ladder ladder = new Ladder(count,ladders[i][0],ladders[i][1]);

ladderMap.put(ladders[i][0],ladder);
ladderMap.put(ladders[i][1],ladder);
}
return ladderMap;
}


public static void main(String args[]){
int board[][] = new int[10][10];
int a = 100;
for(int i=0;i<10;i+=2){
for(int j =0;j<10;j++){
board[i][j] = a;
a--;
}
for(int j =9;j>=0;j--){
board[i+1][j] = a;
a--;
}
}

System.out.println("snake and ladder board");
printArray(board);

play(board);

}
}