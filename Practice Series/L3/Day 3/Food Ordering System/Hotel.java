package resource;
import java.util.ArrayList;
import java.util.List;
public class Hotel extends Consumer{
public void get(String name,String location){
this.name = name;
this.location = location;
this.items = new ArrayList<Item>();
}
public void addItems(Item item){
items.add(item);
}
public void addFood(Food food){
addItems(food);
}

public void getMenu(){
for(Item item : items)
	System.out.println("Name : "+item.name+"      Price : $"+item.price);
}

}