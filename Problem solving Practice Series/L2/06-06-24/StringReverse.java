import java.util.Scanner;
import java.util.Arrays;
class StringReverse{
static String reverse(String str){
char c[] = str.toCharArray();
int n = str.length();
for(int i =0,j =n -1;i<n/2 && j>=n/2;i++,j--){
char a = c[i];
c[i] = c[j];
c[j] = a;
}

return Arrays.toString(c);
}
public static void main(String args[]){
Scanner scan = new Scanner(System.in);
String str = scan.nextLine();
System.out.println(reverse(str));
}
}