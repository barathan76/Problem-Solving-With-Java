import java.util.Scanner;
class ConvertToRoman{
static String digits[] = {"I","V","X"};
static String doubles[] = {"L","C","D","M"};

public static String convertToRoman(int n){
if(n == 0)
	return "";
String result = "";
if(n>=1000){
for(int i =0;i<n/1000;i++)
	result+="M";
return result+convertToRoman(n%1000);
}else if(n<1000 && n>=900){
return "CM"+convertToRoman(n%900);
}else if(n>=500 && n<900){
int k = n%500;
k = k/100;
result+="D";
for(int i =0;i<k;i++)
	result+="C";
return result+convertToRoman(n%(500+(k*100)));
}
else if(n>=400 && n<500){

return "CD"+convertToRoman(n%400);

}else if(n>=100 && n<400){

int k = n/100;
for(int i =0;i<k;i++)
	result+="C";
return result + convertToRoman(n%100);
}

else if(n<100 && n>=90)
	return "XC" + convertToRoman(n%90);

else if(n>=50 && n<90){
int k = n%50;
k = k/10;
result+="L";
for(int i =0;i<k;k++)
	result+="X";
return result+ convertToRoman(n%(k*10+50));
}
else if(n<50 && n>=40)
	return "XL"+convertToRoman(n%40);
else if(n>=10 && n<40){
int k = n/10;

for(int i =0;i<k;i++)
	result+="X";
return result + convertToRoman(n%10);

}
else if(n<10 && n>=9)
	return "IX";

else if(n<9 && n>=5){
int k = n%5;

result+="V";
for(int i =0;i<k;i++)
	result+="I";
}
else if(n == 4)
	return "IV";

for(int i =0;i<n;i++)
	result+="I";
return result;
}
public static void main(String args[]){
Scanner scan = new Scanner(System.in);
int n = scan.nextInt();

System.out.println(convertToRoman(n));
}

}