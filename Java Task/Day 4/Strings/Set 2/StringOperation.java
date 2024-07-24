import java.util.Arrays;
class StringOperation{
static String swapLast(String str){
char[] array = str.toCharArray();
int n  = array.length;

char t = array[n-1];
array[n-1] = array[n-2];
array[n-2] = t;
return Arrays.toString(array);
}
public static void main(String args[]){
String str1 = "Hellothere";
System.out.println("Original String : "+str1);
String str2 = swapLast(str1);
System.out.println("After swap : "+str2);
}
}