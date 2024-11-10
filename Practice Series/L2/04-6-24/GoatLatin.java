import java.util.Scanner;
class GoatLatin{
static boolean isVowel(String s){
char c = s.charAt(0);
if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c== 'I' || c== 'O' || c == 'U')
	return true;
else 
	return false;
}

static String getWord(String s){
if(s.length() == 1)
	return s;
else{
String ans = "";
char c = s.charAt(0);
for(int i =1;i<s.length();i++)
	ans+=s.charAt(i);
ans+=c;
return ans;
}
}
static String solve(String str){
String[] words = str.split(" ");
String ans = "";
for(int i =0;i<words.length;i++){
if(isVowel(words[i]))
	ans+=words[i]+"ma";
else
	ans+=getWord(words[i])+"ma";

for(int j = 0;j<=i;j++)
	ans+="a";
if(i!=words.length-1)
	ans+=" ";
}

return ans;
}
public static void main(String args[]){
Scanner scan = new Scanner(System.in);
String sentence = scan.nextLine();
System.out.println(solve(sentence));
}
}