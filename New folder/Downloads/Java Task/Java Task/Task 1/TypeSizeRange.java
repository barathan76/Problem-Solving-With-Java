class TypeSizeRange
{
public static void display(String name,String size,String min, String max){
String minToMax = min + " to "+ max;
System.out.format("%-10s| %10s| %5s",name,size,minToMax);
System.out.println();

}
public static void main(String args[])
{
Class dataTypes[] = {byte.class,short.class,int.class,float.class,double.class,char.class};
System.out.format("%-10s| %10s| %5s","Data Types","Size","Range");
System.out.println();
display("Integer",String.valueOf(Integer.SIZE),String.valueOf(Integer.MIN_VALUE),String.valueOf(Integer.MAX_VALUE));
display("Character",String.valueOf(Character.SIZE),String.valueOf(Character.MIN_VALUE),String.valueOf(Character.MAX_VALUE));
display("Byte",String.valueOf(Byte.SIZE),String.valueOf(Byte.MIN_VALUE),String.valueOf(Byte.MAX_VALUE));
display("Short",String.valueOf(Short.SIZE),String.valueOf(Short.MIN_VALUE),String.valueOf(Short.MAX_VALUE));
display("Long",String.valueOf(Long.SIZE),String.valueOf(Long.MIN_VALUE),String.valueOf(Long.MAX_VALUE));
display("Float",String.valueOf(Float.SIZE),String.valueOf(Float.MIN_VALUE),String.valueOf(Float.MAX_VALUE));
display("Double",String.valueOf(Double.SIZE),String.valueOf(Double.MIN_VALUE),String.valueOf(Double.MAX_VALUE));
}
}
