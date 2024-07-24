import java.util.Scanner;
import java.io.Reader;
import java.io.BufferedReader;
import java.io.InputStreamReader;
class Main{
public static void main(String args[]){
Scanner scan = new Scanner(System.in);
System.out.println("Enter a string : ");
String str1= scan.nextLine();
System.out.println("Enter a character to search in the string : ");
char c = scan.next().charAt(0);
for(int i =0;i<str1.length();i++){
if(str1.charAt(i) == c){
System.out.println("Element found at index : "+(i+1));
break;
}
}
scan.nextLine();
System.out.println("Enter another string : ");
String str2 = scan.nextLine();
if(str1.compareTo(str2) == 0){
	System.out.println("The two strings are lexicographically equal");
}
if(str1.compareToIgnoreCase(str2) == 0){
	System.out.println("The two strings are lexicographically equal ignoring case");
}


System.out.println("Enter a sentance :");
String sentance = scan.nextLine();
System.out.println("Enter the string to replace : ");
String subStr = scan.nextLine();
System.out.println("Enter the replacing string : ");
String replace = scan.nextLine();
sentance = sentance.replace(subStr,replace);
System.out.println("Sentance after replace : " + sentance); 
}
}
