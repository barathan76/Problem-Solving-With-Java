import java.util.Scanner;
class EncryptWithFreq{
static char encrypt(char c,int x){
int i = c - 'a';
if(i+x>26)
	return (char) ( 97 + ((c+x) - 122));
else if(i+x<0)
	return (char) (123 - (97 - (c+x)));

return (char) (c + x);
}
static void solve(String str,int x,int n){
byte[] freq = new byte[26];
for(int i =0;i<n;i++){
freq[str.charAt(i)-'a']++;
}
for(int i =0;i<n;i++){
if(freq[str.charAt(i)-'a']%2 == 0)
	System.out.print(encrypt(str.charAt(i),x));
else
	System.out.print(encrypt(str.charAt(i),-x));
}
}
public static void main(String args[]){
Scanner scan = new Scanner(System.in);
String str = scan.nextLine();
int x = scan.nextInt();
solve(str,x,str.length());
}
}