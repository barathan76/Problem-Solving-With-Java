class TypeConversion{
public static void main(String args[]){
String s = "1111";
int a = Integer.parseInt(s,2);
System.out.println(Integer.toBinaryString(a*2));
}
}