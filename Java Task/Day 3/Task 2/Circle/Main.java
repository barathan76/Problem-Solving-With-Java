package p2;
import p1.Circle;
import java.util.Scanner;

class Main{
public static void main(String args[])
{
Circle circle = new Circle();
circle.setRadius(5);
System.out.println("Circumference of the circle : "+circle.getCircumference());
System.out.println("Area of the Circle : "+circle.getArea());
}
}