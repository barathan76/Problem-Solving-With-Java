package components;
public class Player implements Movable{
private Point p;
public Player(Point p){
this.p = p;
}
public Point getCoord(){
	return p;
}
public void move(Point p){
	this.p = p;
}
}