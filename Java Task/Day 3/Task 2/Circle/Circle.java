package p1;

public class Circle
{
private float radius;

public void setRadius(float radius){
this.radius = radius;
}

public double getCircumference(){
return 2*radius* Math.PI;
}

public double getArea(){
return  Math.PI * radius*radius;
}
}
