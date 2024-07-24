class Animal
{
int legs;
}
interface LivingThings
{
Boolean live = false;
}

class Cat extends Animal implements LivingThings
{
Cat(int legs, Boolean live) {
super.legs = legs;
live = live;
}
public static void main(String args[])
{
Cat cat = new Cat(4,true);
System.out.println(cat.legs + " " +cat.live);
}
}
