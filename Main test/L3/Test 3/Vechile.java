import java.util.Map;
import java.util.HashMap;
public class Vechile{

int id;
String type;
int totalcharges = 0;
boolean vip;
Map<Integer,Integer> map;
public Vechile(int id,String type,boolean vip){
this.id = id;
this.type = type;	
this.vip = vip;

map = new HashMap<Integer,Integer>();
}

public int getId(){
	return id;
}
public String getType(){
	return type;
}

public int getCharges(int id){
	if(map.containsKey(id))
		return map.get(id);
	else
		return 0;
}

public void setCharges(int c,int id){
	map.put(id,c);
}
public boolean isVip(){
	return vip;
}

public int  getTotalCharges(){
	int amount = 0;
	for(Map.Entry<Integer,Integer> entry : map.entrySet())
		amount += entry.getValue();
	return amount;
}


public void getChargesInJourney(){
	System.out.println("Tolls passed in journey");
	for(Map.Entry<Integer,Integer> entry : map.entrySet())
		System.out.println("Toll id: "+entry.getKey()+"\tCharges :"+entry.getValue());
}
}