public class BallGame{
int size;
int brickCount;
int brickPositions[][];
int ballLife;
char arr[][];
Ball ball;
BallGame(int size,int brickCount,int brickPositions[][],int ballLife){
this.size = size;
this.brickCount = brickCount;
this.brickPositions = brickPositions;
this.ballLife = ballLife;
ball = new Ball(size-1,size/2);
arr = new char[size][size];
initGame();
printChart();
}

public void initGame(){
	int n = size;
	for(int i =0;i<n;i++){
		arr[0][i] = 'w';
		arr[i][0] = 'w';
		arr[i][n-1] = 'w';
	}
	for(int i =1;i<n-1;i++){
		arr[n-1][i] = 'g';
	}
	arr[n-1][n/2] = 'o';
	for(int i = 0;i<brickPositions.length;i++){
		arr[brickPositions[i][0]][brickPositions[i][1]] = '1';
	}
}


public void printChart(){
	for(char sub[] : arr){
		for(char c : sub)
			System.out.print(c+" ");
		System.out.println();
	}
}

public boolean isGameOn(){
	if(brickCount <= 0){
		System.out.println("You have won.....");
		return false;
	}
	if(ballLife <= 0){
		System.out.println("You have lost all your life......");
		return false;
	}
	return true;
}

public void moveStraight(){
	int n = size;
	int y = ball.y;
	for(int i =n-1;i>=0;i--){
	if(arr[i][y] == 'w'){
		ballLife--;
		ball.setPosition(n-1,y);
		updateState();
		break;
	}
	if(arr[i][y] == '1'){
		brickCount--;
		arr[i][y] = '\0';
		ball.setPosition(n-1,y);
		updateState();
		break;
	}
	else if(isNum(arr[i][y])){
		int c = arr[i][y] - '0' - 1;
		arr[i][y] = (char) (c+'0');
		ball.setPosition(n-1,y);
		updateState();
		break;
	}
	
	else
		ball.setPosition(i,y);
	}
}

public boolean isNum(char c){
	if(c == '\0')
		return false;
	int i = (int) c;
	if(i>=48 && i<=57)
		return true;
	else
		return false;
}


public void updateState(){
	int y = ball.y;
	int n = size;
	for(int i =1;i<n-1;i++){
		if(i == y)
			arr[n-1][i] = 'o';
		else	
			arr[n-1][i] = 'g';
	}
}



public void moveDownwards(int i,int j){
	if(arr[i][j] == 'g' || arr[i][j] == 'o'){
		ball.setPosition(i,j);
		updateState();
		return;	
	}
	if(arr[i][j] == '1'){
		arr[i][j] = '\0';
		brickCount--;
	}
	else if(isNum(arr[i][j])){
		int c = arr[i][j] - '0' - 1;
		arr[i][j] = (char) (c+'0');	
	}
	
	moveDownwards(i+1,j);
}

public void moveHorizantal(int i,int j,int d){
	int n = size;
	if(arr[i][j] == 'w'){
	ballLife--;
		return;
}
	if(arr[i][j] == '1'){
		arr[i][j] = '\0';
		brickCount--;
		moveDownwards(i+1,j);
		return;
	}
	else if(isNum(arr[i][j])){
		int c = arr[i][j] - '0' - 1;
		arr[i][j] = (char) (c+'0');
		moveDownwards(i+1,j);
		return;	
	}
	moveHorizantal(i,j+d,d);
}
public void move(int d,int i,int j){
	
	int n =size;
	if(arr[i][j] == 'w'){
		moveHorizantal(i,j-d,-d);
		return;
	}
	if(arr[i][j] == '1'){
		arr[i][j] = '\0';
		brickCount--;
		ball.setPosition(n-1,j);
		updateState();
		return;
	}
	else if(isNum(arr[i][j])){
		int c = arr[i][j] - '0' - 1;
		arr[i][j] = (char) (c+'0');
		ball.setPosition(n-1,j);
		updateState();
		return;	
	}
	
	System.out.println("Ball position : "+i+" "+j);
	move(d,i-1,j+d);
		
	
}
public void moveLeft(){
	move(-1,size-1,ball.y);
}

public void moveRight(){
	move(1,size-1,ball.y);
}

public void assignBricks(int p[][]){
		for(int i =0;i<p.length;i++){
			arr[p[i][0]][p[i][1]] = (char)(p[i][2]+'0');
		}
}
}