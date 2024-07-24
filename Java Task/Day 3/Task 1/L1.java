abstract class Parent{
abstract void message();
}

class SubA extends Parent
{
void message(){
System.out.println("This is first subclass");
}
}
class SubB extends Parent{
void message(){
System.out.println("This is second subclass");
}
}

class L1{
public static void main(String args[]){
SubA subA = new SubA();
subA.message();
SubB subB = new SubB();
subB.message();
}
}
