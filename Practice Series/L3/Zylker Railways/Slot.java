public class Slot{
String pnr;
Berth berth;
Person person;
Resc.Status status;
public Slot(String pnr,Berth berth,Resc.Status status,Person person){
	this.pnr = pnr;
	this.berth = berth;
	this.status = status;
	this.person = person;
}
public void setPnr(String pnr){
	this.pnr = pnr;
}
public void setPerson(Person person){
	this.person = person;
}
}