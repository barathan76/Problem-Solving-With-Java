import java.util.Scanner;
class RoundOfString{
static StringBuilder shrink(String str, int k){
StringBuilder builder = new StringBuilder();
int i;
for(i =0;i<str.length()-k;i+=k){
int sub = 0;
for(int j = i;j<i+k;j++){
sub+= str.charAt(j) - '0';
}
builder.append(sub);
}
int rem = 0;
while(i<str.length()){
rem+= str.charAt(i) - '0';
i++;
}
builder.append(rem);
return builder;
}
static String solve(String str, int k){
StringBuilder builder = new StringBuilder(str);
while(builder.length()>k){
builder = shrink(builder.toString(),k);}
return builder.toString();

}
public static void main(String args[]){
Scanner scan = new Scanner(System.in);
System.out.print("Enter the string : ");
String str= scan.nextLine();
System.out.println();
System.out.print("Enter the k value : ");
int k = scan.nextInt();
scan.nextLine();
System.out.println(solve(str,k));
}
}