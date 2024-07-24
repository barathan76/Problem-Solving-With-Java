abstract class Animals{
abstract void cats();
abstract void dogs();
void print(){
System.out.println("Animal");
}
}

class Cats extends Animals{
void cats(){
System.out.println("Cats meow");
}
void dogs(){}
}
class Dogs extends Animals{
void dogs(){
System.out.println("Dogs bark");
}
void cats(){}
}

class L2_2{
public static void main(String args[]){
Cats cat = new Cats();
Dogs dog = new Dogs();
cat.cats();
dog.dogs();
}
}
