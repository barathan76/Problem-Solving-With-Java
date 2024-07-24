public class Lift{
private int id;
private int currentPosition;
private int start;
private int end;
private int capacity = 5;
private boolean isActive;
private int[] p;

Lift(int id,int currentPosition,int start,int end,boolean isActive){
this.id = id;
this.currentPosition = currentPosition;
this.start = start;
this.end= end;
this.isActive = isActive;
p = new int[11];
}


boolean canAssign(int i,int j){
	if(!isActive)
		return false;
	if(i == j)
		return false;
	if(i>=start && j<=end)
		return true;
	else 
		return false;
}
boolean canMove(int i,int j){
	if(currentPosition == i)
			return true;
else if(currentPosition - i > 0 && i - j > 0 && capacity-1>=0)
	return true;
else if(currentPosition - i < 0 && i - j < 0 && capacity-1>=0)
	return true;
else 
	return false;
}

int getMinStops(int i,int j){
	int count = 0;
	int s = i;
	if(i-j>0){
		while(s>=j && s>=end){
			count++;
			s--;
		}
	}
	else{
		while(s<=j && s<=end){
			count++;
			s++;
		}	
	}
	return count;
}


void setCurrentPosition(int c){
currentPosition = c;	
}
int getCurrentPosition(){
	return currentPosition;
}

void freeCapacity(int c){
	capacity+=c;
}
void moveLift(int i,int j){
	p[j]++;
	new Thread(){
	public void run(){
		int k = currentPosition;
	if(k-j>0){
		while(k>=j){
			freeCapacity(p[k]);
			p[k] = 0;
			setCurrentPosition(k);
			try{Thread.sleep(2000);}catch(InterruptedException e){System.out.println("lift "+id+" is collapsed");}
			k--;
		}
	
		
	}else{
		while(k<=j){
			freeCapacity(p[k]);
			p[k] = 0;
			setCurrentPosition(k);
			try{Thread.sleep(2000);}catch(InterruptedException e){System.out.println("lift "+id+" is collapsed");}
			k++;
		}
	}
	}	
}.start();
}




void setActive(boolean flag){
	this.isActive = flag;
}

}