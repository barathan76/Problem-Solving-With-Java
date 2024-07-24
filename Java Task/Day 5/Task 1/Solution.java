class ZeroDivisorException extends Exception{
ZeroDivisorException(String str)
{
super(str);
}
}

class Solution{
static int divide(int a, int b) throws ZeroDivisorException{
if(b == 0){
throw new ZeroDivisorException("The divisor is zero");
}
return a/b;
}

static void createClass() throws ClassNotFoundException{
Class.forName("ironman");
System.out.println("iron man class created");
}

public static void main(String dude[]){
try{
System.out.println(divide(5,1));
Integer num = Integer.parseInt("Hello there");
createClass();
}
catch(ZeroDivisorException e){
System.out.println(e);
}
catch(NumberFormatException e){
System.out.println(e);
}
catch(ClassNotFoundException e){System.out.println(e);

}
}
}
