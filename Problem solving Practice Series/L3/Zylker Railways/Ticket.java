public class Ticket{
String pnr;
Person person;
Berth berth;
Resc.Status currentStatus;
Resc.Status bookingStatus;
public Ticket(Person person,Berth berth,String pnr,Resc.Status currentStatus,Resc.Status bookingStatus){
	this.person = person;
	this.berth = berth;
	this.pnr = pnr;
	this.currentStatus = currentStatus;
	this.bookingStatus = bookingStatus;
}
public void setBookingStatus(Resc.Status bookingStatus){
	this.bookingStatus = bookingStatus;
}
public void setCurrentStatus(Resc.Status currentStatus){
	this.currentStatus = currentStatus;
}
public boolean equals(String pnr){
	return this.pnr.equals(pnr);
}
}