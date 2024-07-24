
class Main{
public static void main(String args[]){
String str = "Hellothere";
System.out.println("Given String : " + str);
System.out.println("Searching element e");
char e = 'e';
for(char c : str.toCharArray())
{
if(c == e){
System.out.println("Element exists ");
break;
}
}

StringBuilder stringBuilder = new StringBuilder(str);
stringBuilder.reverse();
System.out.println("The reverse of the string : "+stringBuilder);

StringBuilder str1 = new StringBuilder();


System.out.println("Odd index elements : ");
for(int i=0;i<str.length();i+=2){
System.out.print(str.charAt(i) + " ");
str1.append(str.charAt(i));
}
System.out.println();

System.out.println("Even index elements : ");
for(int i =1;i<str.length();i+=2){
System.out.print(str.charAt(i) + " ");
str1.append(str.charAt(i));
}
System.out.println();


System.out.println();


stringBuilder.reverse();
stringBuilder.insert(5,",");
System.out.println("After inserting : "+stringBuilder);
System.out.println("Odd to start : "+str1);
}
}