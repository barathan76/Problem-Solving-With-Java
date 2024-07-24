abstract class Shape{
int area;
int perimeter;
abstract void getArea(int l, int b);
abstract void getPerimeter(int l, int b);
}
class Rectangle extends Shape
{
void getArea(int l, int b){
area = l*b;
}
void getPerimeter(int l, int b){
perimeter = l+b;
}
}
class Main
{
public static void main(String args[])
{
Rectangle r= new Rectangle();
r.getArea(5,10);
System.out.println(r.area);
}
}