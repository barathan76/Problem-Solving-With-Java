import java.util.Scanner;
class TollGate{


static void createVechile(Scanner scan, JourneyMap journey){
	
	while(true){
	System.out.println("Enter vechile id :");
	int n = scan.nextInt();
	scan.nextLine();
	System.out.println("Enter vechile type :");
	String type =scan.nextLine();
	System.out.println("Enter 1 if vechile is vip  else press anything:");
	int vip = scan.nextInt();
	boolean flag = false;
	if(vip == 1)
		flag = true;
	Vechile vechile = new Vechile(n,type,flag);
	journey.displayMap();
	System.out.println("Enter the start and stop position to make the journey");
	int start = scan.nextInt();
	int stop = scan.nextInt();
	journey.navigate(start,stop,vechile);
	System.out.println("Your journey with tolls");
	vechile.getChargesInJourney();
	System.out.println("Total charges : " +vechile.getTotalCharges());
	
	System.out.println("Enter 2 to exit or press any number to continue");
	int c = scan.nextInt();
	if(c == 2)
		return;
	}
}

static void viewStats(Scanner scan, JourneyMap journey){
	while(true){
	System.out.println();
	journey.displayTolls();
	System.out.println("Enter the toll number to view the stats");
	int n = scan.nextInt();
	journey.displayStats(n);
	System.out.println("Enter 2 to exit and any number to continue");
	int c = scan.nextInt();
	if(c==2)
			return;
	}
	
}

public static void main(String args[]){
JourneyMap journey = new JourneyMap();
Scanner scan = new Scanner(System.in);
while(true){
	System.out.println("Enter 1 to create vechile and make journey\nEnter 2 to view stats from a respective toll gate\nEnter 3 to exit");
	int n = scan.nextInt();
	switch(n){
		case 1:
			createVechile(scan,journey);
			break;
		case 2:
			viewStats(scan,journey);
			break;
		case 3:
			return;
	}
}
}
}