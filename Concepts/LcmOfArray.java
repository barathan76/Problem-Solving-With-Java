class LcmOfArray{



static int gcd(int a,int b){
if(b == 0)
	return a;
return gcd(b,a%b);
}

static int lcm(int a,int b){

return (a*b)/gcd(a,b);
}
public static void main(String args[]){
int[] ans = {2,7,3,9,4};
int l = lcm(ans[4],ans[3]);
for(int i = 2;i>=0;i--)
	l = lcm(l,ans[i]);

System.out.println(l);

}
}