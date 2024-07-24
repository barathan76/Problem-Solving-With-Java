import java.util.List;
import java.util.ArrayList;
public class CoachData{
int upper = 4;
int lower = 4;
int middle = 4;
int waitlist = 2;
int rac = 4;
int sideUpper = 2;

List<Slot> slots;
List<Ticket> tickets;
CoachData(){
slots = new ArrayList<Slot>();
tickets = new ArrayList<Ticket>();
initSlots();
printSlots();
}
public void initSlots(){
slots.add(new Slot("",new Berth(1,"LB"),Resc.Status.AVL,null));
slots.add(new Slot("",new Berth(2,"MB"),Resc.Status.AVL,null));
slots.add(new Slot("",new Berth(3,"UB"),Resc.Status.AVL,null));
slots.add(new Slot("",new Berth(4,"LB"),Resc.Status.AVL,null));
slots.add(new Slot("",new Berth(5,"MB"),Resc.Status.AVL,null));
slots.add(new Slot("",new Berth(6,"UB"),Resc.Status.AVL,null));
slots.add(new Slot("",new Berth(7,"SL"),Resc.Status.RAC1,null));
slots.add(new Slot("",new Berth(7,"SL"),Resc.Status.RAC2,null));
slots.add(new Slot("",new Berth(8,"SU"),Resc.Status.AVL,null));
slots.add(new Slot("",new Berth(9,"LB"),Resc.Status.AVL,null));
slots.add(new Slot("",new Berth(10,"MB"),Resc.Status.AVL,null));
slots.add(new Slot("",new Berth(11,"UB"),Resc.Status.AVL,null));
slots.add(new Slot("",new Berth(12,"LB"),Resc.Status.AVL,null));
slots.add(new Slot("",new Berth(13,"MB"),Resc.Status.AVL,null));
slots.add(new Slot("",new Berth(14,"UB"),Resc.Status.AVL,null));
slots.add(new Slot("",new Berth(15,"SL"),Resc.Status.RAC3,null));
slots.add(new Slot("",new Berth(15,"SL"),Resc.Status.RAC4,null));
slots.add(new Slot("",new Berth(16,"SU"),Resc.Status.AVL,null));
slots.add(new Slot("",null,Resc.Status.WL1,null));
slots.add(new Slot("",null,Resc.Status.WL2,null));
}



public void printSlots(){
System.out.println("________________________________________________________________________");
System.out.println("PNR\tBerth No.\tCurrent Status\tBerth Type\tName\tAge");
System.out.println("________________________________________________________________________");
for(Slot slot: slots){
	String no = slot.berth == null?" " : slot.berth.getNo()+"";
	String type = slot.berth == null? " ":slot.berth.getType()+"";
	String name = slot.person == null? " ":slot.person.getName()+"";
	String age = slot.person == null ? " ":slot.person.getAge()+"";
	System.out.println(slot.pnr+"\t"+no+"\t\t"+slot.status+"\t"+type+"\t"+name+"\t"+age);
}
System.out.println("_________________________________________________________________________");
}


public void updateSeats(String type){
	if(type.equals("LB"))
		lower--;
	else if(type.equals("UB"))
		upper--;
	else if(type.equals("MB"))
		middle--;
	else if(type.equals("SU"))
		sideUpper--;
	else if(type.equals("SL"))
		rac--;
	else if(type.equals("WL"))
		waitlist--;
}

public void assignSlot(String pr,Person p,String t){
	for(Slot slot:slots){
		if(slot.berth.getType().equals(t) && slot.berth.isAvail()){
			slot.setPerson(p);
			slot.setPnr(pr);
			slot.berth.allotBerth();
			updateSeats(t);
			slot.status = Resc.Status.CNF;
			tickets.add(new Ticket(p,slot.berth,pr,Resc.Status.CNF,Resc.Status.CNF));
			break;
		}
	}
}
public boolean assingAnySlot(String pr,Person p){
	for(Slot slot:slots){
		if(slot.berth.isAvail() && slot.status !=Resc.Status.RAC1 && slot.status !=Resc.Status.RAC2 && slot.status !=Resc.Status.RAC3 && slot.status !=Resc.Status.RAC4){
			slot.setPerson(p);
			slot.setPnr(pr);
			slot.berth.allotBerth();
			updateSeats(slot.berth.getType());
			tickets.add(new Ticket(p,slot.berth,pr,Resc.Status.CNF,Resc.Status.CNF));
			slot.status = Resc.Status.CNF;
			return true;
		}
	}
	return false;
}

public void getPnrDetails(String pnr){
	if(tickets.size()==0)
		return;
	int index = 1;
	System.out.println("_________________________________________________________________________");
	System.out.println("S.NO\tName\tAge\tBookingStatus\tCurentStatus\tBerth");
	for(Ticket ticket:tickets){
		if(ticket.equals(pnr)){
			System.out.println((index++)+"\t"+ticket.person.getName()+"\t"+ticket.person.getAge()+"\t"+ticket.bookingStatus+"\t\t"+ticket.currentStatus+"\t\t"+ticket.berth.getNo()+"/"+ticket.berth.getType());
		}
	}
	System.out.println("_________________________________________________________________________");
}

public boolean checkAvailability(String type){
	if(type.equals("LB"))
		return lower>0;
	else if(type.equals("UB"))
		return upper>0;
	else if(type.equals("MB"))
		return middle>0;
	else if(type.equals("SU"))
		return sideUpper>0;
	else if(type.equals("SL"))
		return rac>0;
	else if(type.equals("WL"))
		return waitlist>0;
	return false;
}





public boolean bookTicket(String pr,Person p,String t){
	if(t.equals("") && p.getAge()<60){
		return assingAnySlot(pr,p);
		
	}
	if(t.equals("") && p.getAge()>=60){
		if(checkAvailability("LB")){
			assignSlot(pr,p,"LB");
			return true;
		}
		return assingAnySlot(pr,p);
	}
	if(!checkAvailability(t)){
		return assingAnySlot(pr,p);
		/*
		if(!assingAnySlot(pr,p)){
		if(checkAvailability("SL")){
			assignSlot(pr,p,"SL");
		}else if(checkAvailability("WL")){
			System.out.println("You are put in waiting list");
		}else
			return false;
		}*/
	}
	assignSlot(pr,p,t);
	return true;
}





/*sno+name+age+bookingStatus+currentStatus+berth;*/








}