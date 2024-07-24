import java.util.Scanner;
class BinarySum{
static String sum(String a,String b){
int i = a.length()-1;
int j = b.length()-1;
StringBuilder builder = new StringBuilder();
int c = 0;
while(i>=0 && j>=0){
if((a.charAt(i) == '1'&&b.charAt(j)=='0' && c==0) || (a.charAt(i) == '0' && b.charAt(j)=='1' && c==0)){
builder.append(1);
}
else if((a.charAt(i) == '1'&&b.charAt(j)=='0' && c==1) || (a.charAt(i) == '0' && b.charAt(j)=='1' && c==1)){
builder.append(0);
c = 1;
}
else if((a.charAt(i) == '1'&&b.charAt(j)=='1' && c==1)){
builder.append(1);
c = 1;
}
else if((a.charAt(i) == '1'&&b.charAt(j)=='1' && c==0)){
builder.append(0);
c = 1;
}
else if((a.charAt(i) == '0' && b.charAt(j) == '0' && c==1)){
builder.append(1);
c = 0;
}
else
	builder.append(0);
i--;
j--;
}

while(i>=0){
if(a.charAt(i)==1 && c == 1){
builder.append(0);
c=1;
}
else if(a.charAt(i) == 0 && c == 1){
builder.append(1);
c=0;
}
else
	builder.append(0);
i--;
}
while(j>=0){
if(b.charAt(j)==1 && c == 1){
builder.append(0);
c=1;
}
else if(b.charAt(j) == 0 && c == 1){
builder.append(1);
c=0;
}
else
	builder.append(0);
j--;
}
if(c==1)
	builder.append(1);
return builder.reverse().toString();
}
public static void main(String args[]){
Scanner scan = new Scanner(System.in);
String a = scan.nextLine();
String b = scan.nextLine();
System.out.println(sum(a,b));
}
}