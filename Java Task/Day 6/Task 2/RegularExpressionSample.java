import java.util.regex.Pattern;
import java.util.regex.Matcher;
class RegularExpressionSample{
static boolean isAlphaNumeric(String str){
String regex = "[a-zA-z\\d]+";
return Pattern.compile(regex).matcher(str).matches();
}

static boolean MatchRegex(String str, String regex){
System.out.println("The string and the regex are "+str+ " "+regex);

return Pattern.compile(regex).matcher(str).matches();
}



static String removeVowels(String str){
Pattern pattern = Pattern.compile("[aeiouAEIOU]");
Matcher matcher = pattern.matcher(str);
return matcher.replaceAll("");
}
static boolean findWord(String str, String word){

String regex = "\\b\\w*"+word.toLowerCase()+"\\w*\\b";
System.out.println("The word and the regular expression : "+ str + " "+ regex);
return Pattern.compile(regex).matcher(str.toLowerCase()).find();
}

public static void main(String args[]){
String str = "Hello123";
System.out.println(isAlphaNumeric(str));


System.out.println(MatchRegex("pz","pq*"));
System.out.println(MatchRegex("pqqq","pq*"));


System.out.println(MatchRegex("playcooliq","p[a-z]*q"));

System.out.println(MatchRegex("gulugulug", "\\b\\w+g\\w+\\b"));

System.out.println(MatchRegex("Ironman_123", "\\w+"));


System.out.println(MatchRegex("iron_man","\\b[a-z]+_[a-z]+\\b"));

if(findWord("Hellotherepython","Python")){
System.out.println("Word contains Python");
}else{
System.out.println("The word not contains Python");
}
System.out.println(removeVowels("JavaIsland"));
System.out.println(validatePin("1234"));
System.out.println(validatePin("12345"));
System.out.println(validatePin("123455"));


System.out.println(countDecimalPlaces("192.321313212"));


System.out.println(removeLeadingZeroes("001.010.100.000"));
}








static String removeLeadingZeroes(String ipAddress){
return ipAddress.replaceAll("(?<=^|\\.)0+(?!\\.|$)","");
}


static int countDecimalPlaces(String str){
Pattern pattern = Pattern.compile("\\.(\\d+)");
Matcher matcher = pattern.matcher(str);
int count = 0;
while(matcher.find())
{
count += matcher.group(1).length();
}

return count;
}

static boolean validatePin(String str){
String regex = "^\\d{4}$|^\\d{6}$|^\\d{8}$";
return Pattern.compile(regex).matcher(str).matches();
}

}