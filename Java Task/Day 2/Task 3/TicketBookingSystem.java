import java.util.ArrayList;
import java.util.Scanner;

abstract class Ticket {
protected String eventName;
protected double price;

public Ticket(String eventName, double price) {
this.eventName = eventName;
this.price = price;
}
public abstract void displayTicketDetails();
}

class RegularTicket extends Ticket {
private String seatNumber;
public RegularTicket(String eventName, double price, String seatNumber) {
super(eventName, price);
this.seatNumber = seatNumber;
}
@Override
public void displayTicketDetails() {
System.out.println("Regular Ticket Details:");
System.out.println("Event: " + eventName);
System.out.println("Price: $" + price);
System.out.println("Seat Number: " + seatNumber);
}
}


public class TicketBookingSystem {
public static void main(String[] args) {
Scanner scan = new Scanner(System.in);
ArrayList<Ticket> tickets = new ArrayList<>();
while (true) {
System.out.println("1. Book Ticket");
System.out.println("2. Display All Tickets");
System.out.println("3. Exit");
System.out.print("Enter your choice: ");
int choice = scan.nextInt();
scan.nextLine(); 
switch (choice) {
case 1:
System.out.print("Enter event name: ");
String EventName = scan.nextLine();
System.out.print("Enter price: ");
double Price = scan.nextDouble();
scan.nextLine();
System.out.print("Enter seat number: ");
String SeatNumber = scan.nextLine();
tickets.add(new RegularTicket(EventName, Price, SeatNumber));
System.out.println("Regular ticket booked successfully!");
break;
case 2:
System.out.println("All booked tickets:");
for (Ticket ticket : tickets) {
ticket.displayTicketDetails();
System.out.println();
}
break;
case 3:
System.out.println("Exiting program.");
scan.close();
return;
default:
System.out.println("Invalid choice! Please enter a valid option.");
break;
}
}
}
}
