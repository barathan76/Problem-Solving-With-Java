/* 4:53 - 5:12 */
import java.util.Scanner;
class EncryptStr{

static boolean isLower(char c){
int i = (int) c;
if(i>=97 && i<=122)
	return true;
else 
	return false;
}

static char convert(char c, int x, int i){
int n = ((int) c) + (x*i);
if(isLower(c)){
if(n<97)
	n = 122 - (97 - n)+1;
else if(n>122)
	n = 97+ (n-122)+1;

}else{
if(n<65)
	n = 90 - (65 - n)+1;
else if(n>90)
	n = 65+ (n-90)+1;
}
return (char)n;	
}
static String encrypt(String str,int x){
int n = str.length();

byte freq[] = new byte[127];

StringBuilder builder = new StringBuilder();

for(int i =0;i<n;i++)
	freq[(byte) str.charAt(i)]++;

for(int i =0;i<n;i++){
if(freq[(byte) str.charAt(i)]%2 == 0)
	builder.append(convert(str.charAt(i),x,1));
else
	builder.append(convert(str.charAt(i),x,-1));

}


return builder.toString();
}
public static void main(String args[]){
Scanner scan = new Scanner(System.in);
String str = scan.nextLine();
int x = scan.nextInt();
System.out.println(encrypt(str,x));
}
}