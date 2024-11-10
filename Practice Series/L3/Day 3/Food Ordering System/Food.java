package resource;

public class Food extends Item{
private String name;
private String category;
private float price;

public void set(String name,float price){
this.name = name;
this.price = price;
}
public float getPrice(){
return price;
}
public String getName(){
return name;
}
public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Food that = (Food) o;
        return name == that.name && price == that.price;
}
}