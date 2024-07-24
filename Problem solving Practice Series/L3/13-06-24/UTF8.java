import java.util.Scanner;
class UTF8
{
static String getSequence(int i){
String str = "";
while(i>0){
int k = i%2;
if(k == 1)
	str+="1";
else
	str+="0";
i=i/2;
}
while(str.length() <8)
	str+="0";

StringBuilder builder = new StringBuilder(str);
return builder.reverse().toString();
}





static boolean valid(int arr[],int n){

String str[] = new String[n];
for(int i =0;i<n;i++)
	str[i] = getSequence(arr[i]);


String begin = str[0];
int bytes = 0;
int start = 0;
for(int i =0;i<n;i++){
if(begin.charAt(i) == 1)
	bytes++;
if(begin.charAt(i) == 0 && bytes!=0){
	start = i;
	break;
}
}
boolean flag = true;
for(int i = start;i<begin.length()-1;i+=2){
if(begin.charAt(i) == '0' && begin.charAt(i+1) == '1' || begin.charAt(i) == '0' && begin.charAt(i+1) == '0')
	continue;
else{
	flag = false;
	break;
}
}

if(flag){
bytes--;
for(int i =1;i<str.length;i++){
for(int j = 0;j<str[i].length()-1;j+=2){

if(str[i].charAt(j) == '0' && str[i].charAt(j+1) == '1' || str[i].charAt(j) == '0' && str[i].charAt(j+1) == '0')
	continue;
else{
	flag = false;
	break;
}
}
if(flag)
	bytes--;
if(bytes == 0)
	return true;
if(!flag)
	return false;
}
if(bytes == 0 && flag)
	return true;
}
return false;
}
public static void main(String args[]){
Scanner scan = new Scanner(System.in);
int n = scan.nextInt();
int arr[] = new int[n];
for(int i =0;i<n;i++)
	arr[i] = scan.nextInt();
System.out.println(valid(arr,n));
}
}