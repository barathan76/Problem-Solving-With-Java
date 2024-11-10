import java.util.Scanner;
class Q2{
static long solve(String str){
long sum = 0;
long pow = 1;

for(int i = 0;i<str.length();i++){
sum+= (str.charAt(i) - '0') * pow;
pow*=2;
}
return sum;
}
public static void main(String args[]){
Scanner scan = new Scanner(System.in);
String str = scan.nextLine();
System.out.println(solve(str));
}
}