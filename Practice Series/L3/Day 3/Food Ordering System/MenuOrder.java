package system;
import resource.Food;
import java.util.HashMap;
import java.util.Map;
class MenuOrder{
private Map<Food,Integer> map;
MenuOrder(){
map = new HashMap<Food,Integer>();
}

void selectItem(Food food){
if(map.containsKey(food))
	map.put(food,map.get(food)+1);
else
	map.put(food,1);
}

void removeItem(Food food){
if(map.get(food) == 1)
	map.remove(food);
else
	map.put(food,map.get(food)-1);
}



void getBill(){
for(Map.Entry<Food,Integer> entry : map.entrySet())
	System.out.println(entry.getKey().getName() + " " +entry.getValue() + " " +((float)entry.getValue()*entry.getKey().getPrice()));
}


}