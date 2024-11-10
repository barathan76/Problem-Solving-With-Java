import components.Player;
import components.Point;
import mechanics.Game;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

class Main{
	
	
static void stage1(Scanner scan,Game game){

System.out.print("Dimensions of the dungeon(Row X Column) : ");
	int m = scan.nextInt();
	int n = scan.nextInt();
	System.out.println();
	System.out.print("Position of adventurer : ");
	int x = scan.nextInt();
	int y = scan.nextInt();
	System.out.println();
	Point player = new Point(x,y,0);
	System.out.print("Position of gold : ");
	x = scan.nextInt();
	y = scan.nextInt();
	Point gold = new Point(x,y,0);
	System.out.println();
	System.out.println(game.stage1(m,n,player,gold));

}

static void stage2(Scanner scan,Game game){

System.out.print("Dimensions of the dungeon(Row X Column) : ");
	int m = scan.nextInt();
	int n = scan.nextInt();
	System.out.println();
	System.out.print("Position of adventurer : ");
	int x = scan.nextInt();
	int y = scan.nextInt();
	System.out.println();
	Point player = new Point(x,y,0);
	System.out.println();
	System.out.print("Position of Monster : ");
	x = scan.nextInt();
	y = scan.nextInt();
	Point monster = new Point(x,y,0);
	System.out.println();
	System.out.print("Position of gold : ");
	x = scan.nextInt();
	y = scan.nextInt();
	Point gold = new Point(x,y,0);
	System.out.println();
	System.out.println(game.stage2(m,n,player,monster,gold));

}
static void stage3(Scanner scan,Game game){

System.out.print("Dimensions of the dungeon(Row X Column) : ");
	int m = scan.nextInt();
	int n = scan.nextInt();
	System.out.println();
	System.out.print("Position of adventurer : ");
	int x = scan.nextInt();
	int y = scan.nextInt();
	System.out.println();
	Point player = new Point(x,y,0);
	System.out.println();
	System.out.print("Position of Monster : ");
	x = scan.nextInt();
	y = scan.nextInt();
	Point monster = new Point(x,y,0);
	System.out.println();
	System.out.print("Position of gold : ");
	x = scan.nextInt();
	y = scan.nextInt();
	Point gold = new Point(x,y,0);
	System.out.println();
	System.out.println(game.stage3(m,n,player,monster,gold));

}
static void stage4(Scanner scan,Game game){
System.out.print("Dimensions of the dungeon(Row X Column) : ");
int m = scan.nextInt();
	int n = scan.nextInt();
	System.out.println();
	System.out.print("Position of adventurer : ");
	int x = scan.nextInt();
	int y = scan.nextInt();
	System.out.println();
	Point player = new Point(x,y,0);
	System.out.println();
	System.out.print("Position of Monster : ");
	x = scan.nextInt();
	y = scan.nextInt();
	Point monster = new Point(x,y,0);
	System.out.println();
	System.out.println("Enter Trigger : ");
	x = scan.nextInt();
	y = scan.nextInt();
	Point trigger = new Point(x,y,0);
	System.out.println();
	System.out.print("Position of gold : ");
	x = scan.nextInt();
	y = scan.nextInt();
	Point gold = new Point(x,y,0);
	System.out.println();
	
	System.out.println(game.stage4(m,n,player,monster,trigger,gold));

}
static void stage5(Scanner scan,Game game){

System.out.print("Dimensions of the dungeon(Row X Column) : ");
	int m = scan.nextInt();
	int n = scan.nextInt();
	System.out.println();
	System.out.print("Position of adventurer : ");
	int x = scan.nextInt();
	int y = scan.nextInt();
	System.out.println();
	Point player = new Point(x,y,0);
	System.out.print("Position of gold : ");
	x = scan.nextInt();
	y = scan.nextInt();
	Point gold = new Point(x,y,0);
	System.out.println();
	System.out.println("Enter number of Pits : ");
	int p = scan.nextInt();
	List<Point> pits = new ArrayList<Point>();
	for(int i =0;i<p;i++){
		x = scan.nextInt();
		y = scan.nextInt();
		Point pit = new Point(x,y,0);
		pits.add(pit);
	}
	System.out.println(game.stage5(m,n,player,gold,pits));

}


static void stage6(Scanner scan,Game game){

System.out.print("Dimensions of the dungeon(Row X Column) : ");
	int m = scan.nextInt();
	int n = scan.nextInt();
	System.out.println();
	System.out.print("Position of adventurer : ");
	int x = scan.nextInt();
	int y = scan.nextInt();
	System.out.println();
	
	Point player = new Point(x,y,0);
	System.out.print("Position of Monster : ");
	x = scan.nextInt();
	y = scan.nextInt();
	Point monster = new Point(x,y,0);
	System.out.println();
	System.out.print("Position of gold : ");
	x = scan.nextInt();
	y = scan.nextInt();
	Point gold = new Point(x,y,0);
	System.out.println();
	System.out.println("Enter number of Pits : ");
	int p = scan.nextInt();
	List<Point> pits = new ArrayList<Point>();
	for(int i =0;i<p;i++){
		x = scan.nextInt();
		y = scan.nextInt();
		Point pit = new Point(x,y,0);
		pits.add(pit);
	}
	System.out.println(game.stage6(m,n,player,monster,gold,pits));

}

static void stage7(Scanner scan,Game game){

System.out.print("Dimensions of the dungeon(Row X Column) : ");
	int m = scan.nextInt();
	int n = scan.nextInt();
	System.out.println();
	System.out.print("Position of adventurer : ");
	int x = scan.nextInt();
	int y = scan.nextInt();
	System.out.println();
	
	Point player = new Point(x,y,0);
	System.out.print("Position of Monster : ");
	x = scan.nextInt();
	y = scan.nextInt();
	Point monster = new Point(x,y,0);
	System.out.println();
	System.out.println("Enter Trigger : ");
	x = scan.nextInt();
	y = scan.nextInt();
	Point trigger = new Point(x,y,0);
	System.out.println();
	System.out.print("Position of gold : ");
	x = scan.nextInt();
	y = scan.nextInt();
	Point gold = new Point(x,y,0);
	System.out.println();
	System.out.println("Enter number of Pits : ");
	int p = scan.nextInt();
	List<Point> pits = new ArrayList<Point>();
	for(int i =0;i<p;i++){
		x = scan.nextInt();
		y = scan.nextInt();
		Point pit = new Point(x,y,0);
		pits.add(pit);
	}
	
	System.out.println(game.stage7(m,n,player,monster,trigger,gold,pits));

}
public static void main(String args[]){
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter 1 to execute stage1\nEnter 2 to execute stage 2\nEnter 3 to execute stage 3\nEnter 4 to execute stage 4 \nEnter 5 to execute stage 5\nEnter 6 to execute stage 6\nEnter 7 to execute stage 7\nEnter 8 to exit");
	int c= scan.nextInt();
	Game game = new Game();
	
	switch(c){
		case 1: stage1(scan,game);
				break;
		case 2: stage2(scan,game);
				break;
		case 3: stage3(scan,game);
				break;
		case 4: stage4(scan,game);
				break;
		case 5: stage5(scan,game);
				break;
		case 6: stage6(scan,game);
				break;
		case 7: stage7(scan,game);
				break;
		case 8: return;
	}
	
}
}
	
	