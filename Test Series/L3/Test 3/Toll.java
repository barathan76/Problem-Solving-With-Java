import java.util.List;
import java.util.ArrayList;
public class Toll{
int id;
List<Vechile> vechilesPassed;
public Toll(int id){
this.id = id;
vechilesPassed = new ArrayList<Vechile>();
}



public void getVechilePassed(){
System.out.println("Vechiles passed and charges in Toll "+id);
for(Vechile vechile : vechilesPassed){
System.out.println("VechileNo : "+vechile.getId()+"\tVechileType :"+vechile.getType()+"\tAmountCharged : "+vechile.getCharges(id));
}
}

public int getId(){
	return id;
}


public void passToll(Vechile v){
	String str = v.getType().toLowerCase();
	int charges = 0;
	if(str.equals("car"))
		charges = 50;
	else if(str.equals("truck"))
		charges = 100;
	
	
	if(v.isVip()){
		charges = (charges*20)/100;
	}
	
	v.setCharges(charges,id);
	vechilesPassed.add(v);
	}
}