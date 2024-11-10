package components;
public class Monster implements Movable{
private Point p;
public Monster(Point p){
this.p = p;
}
public Point getCoord(){
	return p;
}
public void move(Point p){
	this.p = p;
}
}