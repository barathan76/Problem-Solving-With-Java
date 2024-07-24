class Animal
{
void poop()
{
System.out.println("Animal just pooped");
}
final void sit()
{
System.out.println("The animal got beaten");
}
final void sleep()
{
System.out.println("The animal is sleeping");
}
}
class Cat extends Animal
{
void poop()
{
System.out.println("Cat just pooped");
}
void sit(){
System.out.println("The cat got beaten");
}
void sleep()
{
System.out.println("Cat just sleeped");
}

final void talk()
{
System.out.println("The cat is yawning");
}
void talk()
{
System.out.println("The cat says hi");
}



public static void main(String args[])
{
Cat cat = new Cat();
cat.poop();
cat.sleep();
cat.sit();
cat.talk();
}
}
