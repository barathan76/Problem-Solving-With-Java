import java.util.Scanner;

class ArrayAppend{
static String Append(String s1,String s2)
{
StringBuilder str1 = new StringBuilder(s1);
StringBuilder str2 = new StringBuilder(s2);
int n1 = str1.length();
int n2 = str2.length();
if(n2 > n1){
str2.delete(0,n2-n1);
}
else if(n1 > n2){
str1.delete(0,n1-n2);
}
return str1.toString() + str2.toString();
}
public static void main(String args[]){
Scanner scan = new Scanner(System.in);
System.out.print("Enter a string : ");
String s1 = scan.nextLine();
System.out.println();
System.out.print("Enter another string : ");
String s2 = scan.nextLine();
System.out.println();
System.out.println(Append(s1,s2));
}
}

