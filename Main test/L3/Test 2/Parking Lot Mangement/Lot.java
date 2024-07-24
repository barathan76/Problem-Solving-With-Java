package parking;
import Vechile.*;
import java.util.List;
import java.util.ArrayList;
public class Lot{

private int maxSize = 5;
List<Vechile> vechiles;
Lot(){
vechiles = new ArrayList<Vechile>();
}


public boolean parkVechile(Vechile v){

if(v.getSize()<=5){
	vechiles.add(v);
maxSize-=v.getSize();
return true;
}
return false;
}


public boolean exitVechile(Vechile v){
for(int i =0;i<vechiles.size();i++){
if(vechiles.get(i).equals(v.getRegNo())){
	vechiles.remove(i);
maxSize+=v.getSize();
	return true;
	
}
}
return false;
}


public boolean checkParked(Vechile v){
for(Vechile vechile : vechiles){
if(vechile.equals(v.getRegNo()))
	return true;
}
return false;
}

}


