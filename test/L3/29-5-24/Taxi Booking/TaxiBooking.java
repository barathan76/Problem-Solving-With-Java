class TaxiBooking{
int bookingId;
int customerId;
char from;
char to;
int pickupTime;
int dropTime;
int amount;
Taxi taxi;
private PointMap map;
TaxiBooking(int customerId,char from,char to,int pickupTime){
this.customerId = customerId;
this.from = from;
this.to = to;
this.pickupTime = pickupTime;
map = new PointMap();
}

void setAmount(){
amount = map.getAmount(from,to);
}

void setBookingId(int k){
bookingId = k;
}
int getAmount(){
return amount;
}

void setDropTime(){
dropTime = map.getDropTime(from,to,pickupTime);
}
int getDropTime(){
return dropTime;
}

boolean setTaxi(Taxi A){
if(A.getTaxiNumber() == 0)
	return false;
taxi = A;
return true;
}

}