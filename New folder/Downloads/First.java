class First{
static int a = 5;
int b;
int c;
static int n;
int m;
First(int n)
{
this.m = n;
System.out.println(a+" "+b+" "+c+" "+n+" "+m);
}
{
b = 10;
n = 20;
}
static
{
a = 30;
}
public static void main(String args[])
{
First first = new First(10);
}
}