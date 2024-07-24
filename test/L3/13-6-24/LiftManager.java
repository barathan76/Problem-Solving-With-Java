import java.util.List;
import java.util.ArrayList;
public class LiftManager{
List<Lift> lifts;
LiftManager(){
lifts = new ArrayList<Lift>();
lifts.add(new Lift(1,0,0,5,true));
lifts.add(new Lift(2,0,0,5,true));
lifts.add(new Lift(3,0,6,10,true));
lifts.add(new Lift(4,0,6,10,true));
lifts.add(new Lift(5,0,0,10,true));
}


void assignLift(int i,int j){
int minDiff = 11;
int index = -1;
int k =0;
for(Lift lift : lifts){
	if(lift.canAssign(i,j)){
		if(lift.canMove(i,j)){
			if(minDiff > lift.getMinStops(i,j)){
				index = k;
				minDiff = lift.getMinStops(i,j);
			}
		}
	}
	k++;
}
if(index == -1){
	System.out.println("lift can't move");
	return;
}
Lift lift = lifts.get(index);
System.out.println("Lift "+(index+1)+ " is moving");
lift.moveLift(i,j);
}

void getLiftsPosition(){
for(Lift lift : lifts)
	System.out.print(lift.getCurrentPosition()+ " ");	

}


void setLiftActive(int index,boolean flag){
	Lift lift = lifts.get(index);
	lift.setActive(flag);
}
}