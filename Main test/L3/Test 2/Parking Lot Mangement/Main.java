import java.util.Scanner;
import Vechile.Vechile;
import Vechile.Bike;
import Vechile.Car;
import parking.ParkingLot;
class Main{
static ParkingLot parkingLot = new ParkingLot();

public static void main(String args[]){
Scanner scan = new Scanner(System.in);
while(true){
System.out.println("Enter 1 to createVechile\nEnter 2 to park Vechile\nEnter 3 to exit Vechile from parking\nEnter 4 to exit system");
int n = scan.nextInt();
scan.nextLine();
switch(n){
case 1:
	createVechile(scan);
	break;
case 2:
	parkVechile(scan);
	break;
case 3:
	exitVechile(scan);
	break;
case 4:
	return;
}
}
}


static void createVechile(Scanner scan){
System.out.println("Enter 1 to bike\nEnter 2 to car");
int n = scan.nextInt();
scan.nextLine();
Vechile v;
if(n == 1)
	v = new Bike();
else
	v = new Car();

System.out.println("Enter regNo");
String no = scan.nextLine();
v.setRegNo(no);
parkingLot.addVechile(v);
}


static void parkVechile(Scanner scan){
System.out.println("Enter regNo");
String no = scan.nextLine();
Vechile v = parkingLot.getVechile(no);
if(parkingLot.parkVechile(v))
	System.out.println("Vechile parked at " + parkingLot.getparkedLot(v));
}
static void exitVechile(Scanner scan){
System.out.println("Enter regNo");
String no = scan.nextLine();
Vechile v = parkingLot.getVechile(no);
System.out.println(v.getRegNo());
double amount = parkingLot.exitVechile(v);

System.out.println("Your total bill : "+amount);
}

}