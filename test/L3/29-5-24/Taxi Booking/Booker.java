import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
class Booker{
TaxiMap taxiMap;
int k = 0;
List<TaxiBooking> bookings;
Booker(int n){
taxiMap = new TaxiMap(n);
bookings = new ArrayList<TaxiBooking>();
}
void getBooking(){
Scanner scan = new Scanner(System.in);
System.out.println("Enter the customer Id ");
int n = scan.nextInt();
System.out.println("Enter the pickupPoint " );
char c = scan.next().charAt(0);
scan.nextLine();
System.out.println("Enter the dropPoint ");
char d = scan.next().charAt(0);
System.out.println("Enter the pickupTime ");
int p = scan.nextInt();
TaxiBooking booking = new TaxiBooking(n,c,d,p);
booking.setAmount();
booking.setDropTime();

Taxi A = taxiMap.booking(c,d,booking.getAmount(),p);
if(booking.setTaxi(A)){
	booking.setBookingId(k++);
	bookings.add(booking);
	System.out.println("Taxi "+A.getTaxiNumber()+" booked");
}
else 
	System.out.println("Booking unsuccessful");
}


void getBookingStats(){
int i =0;
for(TaxiBooking booking :bookings){
System.out.println();
System.out.println("______________________________________________________________________");
System.out.println("Taxi No : "+booking.taxi.getTaxiNumber());
System.out.println("BookingId : "+booking.bookingId);
System.out.println("Customer Id: "+booking.customerId);
System.out.println("From : "+booking.from);
System.out.println("PickupTime : "+booking.pickupTime);
System.out.println("DropTime : "+booking.dropTime);
System.out.println("Amount : "+booking.amount);
System.out.println("______________________________________________________________________");
System.out.println();
}
}
}