import java.util.Scanner;
class AddBinary{
static String add(String num1, String num2){
int a = Integer.parseInt(num1,2);
int b = Integer.parseInt(num2,2);
return Integer.toBinaryString(a+b);
}
public static void main(String args[]) {
Scanner scan = new Scanner(System.in);
String num1 = scan.nextLine();
String num2 = scan.nextLine();
System.out.println(add(num1,num2));
scan.close();
}
}

