import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
class TaxiMap{
int totalTaxies;
Map<Character,List<Taxi>> taxiMap;
TaxiMap(int totalTaxies){
taxiMap = new HashMap<Character,List<Taxi>>();
this.totalTaxies = totalTaxies;
setTaxiMap();
}


void setTaxiMap(){
List<Taxi> nodeList = new ArrayList<Taxi>();
for(int i=1;i<=totalTaxies;i++){
Taxi taxi = new Taxi(i,'A');
nodeList.add(taxi);
}
taxiMap.put('A',nodeList);
taxiMap.put('B', new ArrayList<Taxi>());
taxiMap.put('C', new ArrayList<Taxi>());
taxiMap.put('D', new ArrayList<Taxi>());
taxiMap.put('E', new ArrayList<Taxi>());
}



Taxi booking(char from,char to,int amount,int pickup){
char[] points = {'A','B','C','D','E'};
int k = from - 'A';
Taxi taxi = new Taxi(0,'A');
boolean flag = false;
for(int i = k;i<points.length;i++){
if(i-k>2)
	break;
else{
	List<Taxi> taxies = taxiMap.get(points[i]);
	if(!(taxies.size() >0))
		continue;
	taxi = getTaxies(taxies,to,amount,pickup);
	flag = true;
	break;
}	
}

if(flag == true){
return taxi;
}

for(int i =k;i>=0;i--){
if(k-i>2)
	break;
else{
	List<Taxi> taxies = taxiMap.get(points[i]);
	if(!(taxies.size() >0))
		continue;
	taxi = getTaxies(taxies,to,amount,pickup);
	flag = true;
	break;
}
}

return taxi;

}


Taxi getTaxies(List<Taxi> taxies,char to,int amount,int pickup){

int minAmount = taxies.get(0).getEarned();
Taxi taxi = taxies.get(0);

for(int i =1;i<taxies.size();i++){
	if(!(taxies.get(i).freeTime<=pickup))
		continue;
	int t = taxies.get(i).getEarned();
	if(minAmount>t)	{
		minAmount= t;
		taxi = taxies.get(i);
}		
}
if(taxi.getTaxiNumber() != 0)
{setTaxiPosition(taxi,to);
taxi.updateEarned(amount);
}
return taxi;
}



void setTaxiPosition(Taxi A,char c){
char a = A.getCurrentPosition();
List<Taxi> list = taxiMap.get(a);
int i = 0;
for(;i<list.size();i++)
	if(list.get(i).getTaxiNumber() == A.getTaxiNumber())
		break;
if(i!=0)
	list.remove(i);

List<Taxi> newList = taxiMap.get(c);
newList.add(A);
A.setCurrentPosition(c);
}
}