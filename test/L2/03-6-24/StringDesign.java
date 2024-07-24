import java.util.Scanner;
class StringDesign{

static String solve(String str){

String ans = "";
byte[] array = new byte[str.length()];
for(int i =0;i<str.length();i++)
	array[i] = (byte)str.charAt(i);


while(ans.length()<str.length()){

byte minVal = 0;
while(ans.length()<str.length()){
byte a = lowestAdd(array,minVal);
if(a == 127)
	break;
else{
	ans+=(char)a;
	minVal = a;
}
}
byte maxVal = 127;
while(ans.length()<str.length()){
byte a = greatestAdd(array,maxVal);
if(a == 0)
	break;
else{
	ans+=(char)a;
	maxVal = a;
}
}
}
return ans;
}

static byte lowestAdd(byte array[],byte minVal){
int index = 0;
byte min = 127;
for(int i =0;i<array.length;i++){
if(min > array[i] && array[i] !=0 && array[i] > minVal){
	min = array[i];
	index = i;
}
}
array[index] = 0;
return min;
}


static byte greatestAdd(byte array[],byte maxVal){
int index = 0;
byte max = 0;

for(int i =0;i<array.length;i++){
if(max < array[i] && array[i] !=0 && array[i]< maxVal){
	max = array[i];
	index = i;
}
}
array[index] = 0;
return max;
}
public static void main(String args[]){
Scanner scan = new Scanner(System.in);
String str = scan.nextLine();
System.out.println(solve(str));
}
}