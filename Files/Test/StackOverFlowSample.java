class StackOverFlowSample
{
public static void print(int x){
x = ++x + x + x++;
System.out.println(x);
}
public static void main(String args[])
{
StackOverFlowSample.print(5);
}
}