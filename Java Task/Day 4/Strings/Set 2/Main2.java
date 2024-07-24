import java.util.Scanner;


class Main2{
public static char firstNonRepeatingCharacter(String str){
char d = ' ';
for(char c : str.toCharArray()){
if(str.indexOf(c) == str.lastIndexOf(c)){
d = c;
break;
}
}
return d;
}

public static String[] divideEqualParts(String str){
String[] strArray = new String[str.length()/2];
int k =0;
for(int i =0;i<str.length();i+=2){
strArray[k] = str.substring(i,i+2);
k++;
}
return strArray;
}


public static Boolean rotation(String str1, String str2){
StringBuilder sentance = new StringBuilder();
sentance.append(str1);
sentance.append(str2);
String str = sentance.toString();
if(str.contains(str2)){
return true;}
return false;
}

public static void main(String args[]){
Scanner scan = new Scanner(System.in);
System.out.println("Enter a string : ");
String str1 = scan.nextLine();
System.out.println("First non repeating character in the String : "+ firstNonRepeatingCharacter(str1));

String[] value = divideEqualParts(str1);
for(String s : value){
System.out.print(s+" ");

}
System.out.println();
System.out.println("Enter another string : ");
String str2 = scan.nextLine();
if(rotation(str1,str2)){
System.out.println("The strings are rotation of one other");
}


}
}