package resource;

public abstract class Item{
protected String name;
protected Item category;
protected float price;
public abstract float getPrice();
public abstract void set(String name, float price);
}
