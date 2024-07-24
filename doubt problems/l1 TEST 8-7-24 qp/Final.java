/*public class Final{
int lanif = 37;
int nafi = 21;
public static void main(String args[]){
final Final f = new Final();
f.process2();
Final f2 = modify(f);
f2.process2();
}

public static final Final modify(final Final f){
f.process();
Final f2 = new Final();
f2.process();
return f2;
}

final void process(){
lanif = nafi + nafi;
System.out.println(lanif + " " + nafi + " ");
}
void process2(){
nafi = lanif / 2;
System.out.println(nafi + " " + lanif + " ");
}

}*/




/*public class Final{
int lanif = 37;
int nafi = 21;
public static void main(String args[]){
final int result;
result = 20;
int assign = process(result);
result = assign;
System.out.println(result);
}

static int process(int a){
return a + 5;
}

}*/





/*public class Final{
final int assign = 30;
public static void main(String args[]){
final int result = 20;
final int assign;
Final f = new Final();
assign = 20;
System.out.println(assign);
System.out.println(f.assign);
System.out.println(f.process(result));
}

static int process(int a){
return a + 5;
}

}
*/



/*public class Final{
final int assign;
public static void main(String args[]){
final int result = 20;
Final f = new Final();
f.assign = process(result);
System.out.println(f.assign);
}

final static int process(int a){
return a + 5;
}
}
*/





/*public class Final{
int a = 30;
public static void main(String args[]){
final int assign;
Final b = new Final();
process(b);
System.out.println(b.a);
process(b);
assign = b.a;
System.out.println(assign);
}

public static void process(int a){
a.a =  a.a + 5;
}
}*/




/*public class Final{
final int age = 10;


Final(){
final int age = 20;
print(age);
}

public void main(String args[]){

final int result = 30;
final int assign;
Final f = new Final();
print(result);
assign = 30;
System.out.println(f.age+" "+process(assign));
}

static void print(int a){

System.out.println(a);
}

static int process(int a){
return a+5;
}

}*/





public class Final{


public static void main(String args[]){

final String result = "MERIT";
final String assign;

Final f = new Final();
assign = "CAMPUS";

final String exchange = " ";

System.out.println(process(result,assign,exchange));
}

static String process(String a,String b,String xchange){
xchange = b + " "+ a;

return xchange;

}


}







