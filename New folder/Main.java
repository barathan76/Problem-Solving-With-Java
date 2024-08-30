class Base{
protected int a = 5;
public void show(){
System.out.println("base oo");
}
}

class Derived extends Base{
public void show(){
System.out.println("derived oo");
}
}

public class Main{
public static void main(String args[]){
Base b = new Derived();
b.show();
System.out.print(b.a);
}
}