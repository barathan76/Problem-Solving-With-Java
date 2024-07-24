import java.util.Scanner;
public class Main{
public static void main(String args[]){
Scanner scan = new Scanner(System.in);
System.out.println("Enter the size of the game : ");
int n = scan.nextInt();
System.out.println("Enter the number of bricks : ");
int b = scan.nextInt();
int arr[][] = new int[b][2];
System.out.println("Enter the bricks position : ");
for(int i =0;i<b;i++){
	arr[i][0] = scan.nextInt();
	arr[i][1] = scan.nextInt();
}
System.out.println("Enter ball life : ");
int life = scan.nextInt();
scan.nextLine();
BallGame game = new BallGame(n,b,arr,life);
System.out.println("Enter the number of higher bricks : ");
b = scan.nextInt();
if(b >0){
System.out.println("Enter the position of the higher bricks with the value of it : ");
int numB[][] = new int[b][3];
for(int i =0;i<b;i++){
System.out.println("Enter position : ");
numB[i][0] = scan.nextInt();
numB[i][1] = scan.nextInt();
System.out.println("Enter the value of the brick : ");
numB[i][2] = scan.nextInt();	
}
game.assignBricks(numB);
}
while(true){
System.out.println("Enter command : ");
String command = scan.nextLine();
if(command.equals("St"))
	game.moveStraight();
else if(command.equals("It"))
	game.moveLeft();
	
else if(command.equals("Rt"))
	game.moveRight();
game.printChart();
if(!game.isGameOn())
	return;
System.out.println("Enter 1 to continue\nEnter 2 to exit");
int c = scan.nextInt();
scan.nextLine();
if(c == 2)
	return;
}

}
}