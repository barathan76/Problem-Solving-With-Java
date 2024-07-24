package parking;
import Vechile.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
public class ParkingLot{

Map<Character,Lot> parkingSlot;
Map<Vechile, Long> parkingTime;

List<Vechile> vechiles;
public ParkingLot(){

parkingSlot = new HashMap<Character,Lot>();
parkingTime = new HashMap<Vechile,Long>();

char slots[] = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y'};
for(int i =0;i<slots.length;i++){
parkingSlot.put(slots[i], new Lot());
}

vechiles = new ArrayList<Vechile>();
}



public void addVechile(Vechile v){
vechiles.add(v);
}


public Vechile getVechile(String regNo){
for(Vechile v: vechiles){
if(v.equals(regNo))
	return v;
}
return null;
}

public boolean parkVechile(Vechile v){

for(Map.Entry<Character,Lot> entry : parkingSlot.entrySet()){

Lot lot = entry.getValue();
if(lot.parkVechile(v)){
System.out.println("Vechile parked at : "+entry.getKey());
long time = System.currentTimeMillis();
System.out.println("Check in time : " +time);
parkingTime.put(v,time);
return true;
}
}
return false;
}


public double exitVechile(Vechile v){
long time = System.currentTimeMillis();
long parked = 0;

for(Map.Entry<Character,Lot> entry : parkingSlot.entrySet()){
Lot lot = entry.getValue();
if(lot.exitVechile(v)){
	parked = parkingTime.get(v);
	parkingTime.remove(v);
}
}

System.out.println("Check in time : " +parked);
System.out.println("Check out time : " +time);
int charges = 0;
if(v.getType().equals("Bike"))
	charges =  10;
else
	charges = 50;

return (Math.abs(time-parked)*charges) /10000;

}


public char getparkedLot(Vechile v){

for(Map.Entry<Character,Lot> entry : parkingSlot.entrySet()){
Lot lot = entry.getValue();
if(lot.checkParked(v))
	return entry.getKey();
}

return ' ';
}
}