import java.util.Scanner;
class LongestPalindrome{
static boolean lower(int i){
if(i>=97 && i<=122)
	return true;
else 
	return false;
}
static boolean upper(int i){
if(i>=65 && i<=90)
	return true;
else 
	return false;
}
static int solve(String str){
int n = str.length();
if(n == 1 || n == 0)
	return n;
int even = 0;
int odd = 0;
int freqLower[] = new int[26];
int freqHigher[] = new int[26];
for(int i =0;i<n;i++){
	char c= str.charAt(i);
	if(lower((int)c))
		freqLower[c-'a']++;
	else
		freqHigher[c-'A']++;
}
for(int i = 0;i<26;i++){
	if(freqLower[i]%2==0 && freqLower[i]!=0)
		even+=freqLower[i];
	else if(freqLower[i]%2==1)
		odd++;
	if(freqHigher[i]%2==0 && freqHigher[i]!=0)
		even+=freqHigher[i];
	else if(freqHigher[i]%2==1)
		odd++;
}
if(odd>0 && even%2==0)
	return even+1;
else
	return even+odd;
}
public static void main(String args[]){
Scanner scan = new Scanner(System.in);
String str = scan.nextLine();
System.out.println(solve(str));
}
}