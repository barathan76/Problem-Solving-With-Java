import java.util.Scanner;
class LongestSubString{
static int solve(String str){
int max = Integer.MIN_VALUE;


for(int i = 0;i<str.length();i++){
int freqLower[] = new int[26];
int freqHigher[] = new int[26];
for(int j =i;j<str.length();j++){
int count = 0;
char c = str.charAt(j);
if(lower(c){
int k = c-'a';
if(freqLower[k] == 1)
	break;
else{
	count++;
	freqLower[k]++;
}
}else if(upper(c){
int k = c-'A';
if(freqHigher[k] == 1)
	break;
else{
	count++;
	freqHigher[k]++;
}
}
max = Math.max(count,max);
}
return max;
}
public static void main(String args[]){
Scanner scan = new Scanner(System.in);
String str = scan.nextLine();
System.out.print(solve(str));
}
}