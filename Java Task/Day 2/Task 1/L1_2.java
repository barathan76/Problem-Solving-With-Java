class Rectangle
{
int length;
int breadth;
Rectangle(int length,int breadth)
{
this.length = length;
this.breadth = breadth;
}
int area()
{
return length*breadth;
}
}

class L1_2
{
public static void main(String args[])
{
Rectangle r1 = new Rectangle(5,10);
Rectangle r2 = new Rectangle(10,15);
System.out.println("The Area of first Rectangle = "+r1.area());
System.out.println("The Area of second Rectangle = "+r2.area());
}
}
