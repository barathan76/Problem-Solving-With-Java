import java.util.Scanner;
class Main{

static void window(Scanner scan, LiftManager liftManager){
while(true){
System.out.println("Enter start and end floor");
int i = scan.nextInt();
int j = scan.nextInt();
liftManager.assignLift(i,j);
liftManager.getLiftsPosition();
return;
}
}
public static void main(String args[]){
LiftManager liftManager = new LiftManager();
Scanner scan = new Scanner(System.in);
while(true){
System.out.println("\nEnter 1 to continue\nEnter 2 to getLiftsPosition \nEnter 3 to exit");
int n = scan.nextInt();
switch(n){
case 1:
	window(scan,liftManager);
	break;
case 2:
	liftManager.getLiftsPosition();
	break;
case 3:
	return;
}
}

}
}