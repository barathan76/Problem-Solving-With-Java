import java.util.Scanner;
class PermutateString{
static String solve(String str){
StringBuilder builder = new StringBuilder();
int a = 0;
int n = -1;
for(int i =0;i<n;i++){
int c = (int) str.charAt(i);
if(c>=65 && c<=90 || c>=97 && c<=122){
if(Math.abs(n-a) == 1){
builder.append(str.charAt(i));
a = i;
n++;
}
}
else if(c>=48 && c<=57){
if(Math.abs(n-a) == 1){
builder.append(str.charAt(i));
n = i;
a++;
}
}
}
return builder.toString();
}
public static void main(String args[]){
Scanner scan = new Scanner(System.in);
String str = scan.nextLine();
System.out.println(solve(str));
}
}