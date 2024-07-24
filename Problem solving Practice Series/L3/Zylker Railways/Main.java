
import java.util.Random;
import java.util.Scanner;
class Main{
	
	
	
	
static void bookTicket(Scanner scan,CoachData coachData){
	
	Random r = new Random();
	String pnr = r.nextInt(10000)+"";
	while(true){
		scan.nextLine();
	System.out.println("Enter Name of the person : ");
	String name = scan.nextLine();
	System.out.println("Enter age : ");
	int age = scan.nextInt();
	String berth = "";
	System.out.println("Enter berth preferece(optional) : 1 to select berth 2 to ignore");
	int c = scan.nextInt();
	if(c ==1){
		System.out.println("Enter 1 to LB,Enter 2 to MB, Enter 3 to UB, Enter 4 to SU");
		int b = scan.nextInt();
		if(b == 1)
			berth = "LB";
		else if(b == 2)
			berth = "MB";
		else if(b == 3)
			berth = "UB";
		else if(b == 4)
			berth = "SU";
	}
	Person p = new Person(name,age);
	coachData.bookTicket(pnr,p,berth);
	System.out.println("Enter 1 to book ticket\nEnter 2 to exit");
	c = scan.nextInt();
	if(c == 2)
		return;
	}
	
}
public static void main(String args[]){
CoachData coachData = new CoachData();
Scanner scan = new Scanner(System.in);
while(true){
	System.out.println("Enter 1 to bookTicket\nEnter 2 to printSlots\nEnter 3 to getPnrDetails\nEnter 4 to exit");
	int n = scan.nextInt();
	if(n == 1)
		bookTicket(scan,coachData);
	else if(n==2)
		coachData.printSlots();
	else if(n == 3){
		scan.nextLine();
		System.out.println("Enter pnr number : ");
		String pnr = scan.nextLine();
		coachData.getPnrDetails(pnr);
	}else if(n==4)
		return;
}
}
}