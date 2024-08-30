interface Addable{
default int sum(){
return 10;
}
}
class A {
int mul(){
return 12;
}
}
class B extends A implements Addable{
void print(){
System.out.println(sum());
}
}

class Doubt{



public static void main(String args[]){
B b = new B();
b.print();
}
}
