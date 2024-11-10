package resource;
import java.util.List;
public abstract class Consumer{
protected String name;
protected String location;
protected List<Item> items;
public abstract void get(String name, String location);
abstract void addItems(Item item);
}