import java.util.Scanner;
class NumToWords{

static String oneToTwenty[] = {"","One ","Two ","Three ","Four ","Five ","Six ","Seven ","Eight ","Nine ","Ten ","Eleven ","Twelve ","Thirteen ","Fourteen ","Fifteen ","Sixteen ","Seventeen ","Eighteen ","Nineteen "};
static String doubleDigits[] = {"","Ten ","Twenty ","Thirty ","Fourty ","Fifty ","Sixty ","Seventy ","Eigthy ","Ninety "};

static String getWord(long k){
if(k<20L)
	return oneToTwenty[(int)k];

if(k%10L == 0)
	return doubleDigits[(int) (k/10L)];
else
	return doubleDigits[(int) (k/10L)] + oneToTwenty[(int) (k%10L)];
}

static String convert(long n){
if(n< 100L)
	return getWord(n);
if(n>= 1000000000L){
long k = n/1000000000L;
return getWord(k)+"Billion "+ convert(n%1000000000L);
}
else if(n>=10000000L){
long k = n/10000000L;
return getWord(k)+"Crore "+ convert(n%10000000L);
}
else if(n>=100000L){
long k = n/100000L;
return getWord(k)+"Lakh "+ convert(n%100000L);
}
else if(n>=1000){
long k = n/1000L;
return getWord(k) + "Thousand "+ convert(n%1000L);
}
else if(n>=100){
if(n%100L == 0L)
	return getWord(n/100L) + "Hundred";
long k =n/100L;
return getWord(k) + "Hundred and "+ convert(n%100L);
}
else 
	return getWord(n);
}
static String solve(long n){
if(n == 0)
	return "Zero";

return convert(n);

}
public static void main(String args[]){
Scanner scan = new Scanner(System.in);
long n = scan.nextLong();
System.out.println(solve(n));
}
}