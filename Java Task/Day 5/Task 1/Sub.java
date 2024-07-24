class Super{
void divide(int a, int b){
System.out.println("Number divided in super class : " + a/b);
}
}
class Sub extends Super{
void divide(int a,int b) throws ArithmeticException{
System.out.println("Number divided in sub class : "+a/b);
}

public static void main(String args[])
{
try{Super sub = new Sub();
sub.divide(10,0);
}catch(ArithmeticException e){
System.out.println(e);
}
}
}