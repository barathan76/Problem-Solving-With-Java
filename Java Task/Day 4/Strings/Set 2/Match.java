import java.util.regex.*;
class Match
{
public static boolean match(String str1,String str2){
	 str2 = str2.replaceAll("\\*", ".*");
        str2 = str2.replaceAll("\\?", ".");

        return Pattern.compile(str2).matcher(str1).matches();
}
public static void main(String args[]){
String str1 = "abcdh";
String str2 = "abc*d?*";
if(match(str1,str2))
{
System.out.println("The given pattern matches");
}
else{
System.out.println("Not matches");
}
}
}
