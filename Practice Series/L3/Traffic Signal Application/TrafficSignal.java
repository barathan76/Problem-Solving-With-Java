import java.util.Scanner;
class Signal extends Thread{
private int redWait;
private int yelloWait;
private int greenWait;


enum Colour{Black,Red,Yellow,Green};
Colour CurrentColor = Colour.Black;
int duration;
Signal(int redWait,int yelloWait,int greenWait){
this.redWait = redWait;
this.yelloWait= yelloWait;
this.greenWait = greenWait;
duration = redWait;
changeToRed();
}
Colour getCurrentColor(){

return this.CurrentColor;
}

public void run(){
while(true){
System.out.println(CurrentColor);
try{Thread.sleep(duration);}catch(InterruptedException e){}
if(CurrentColor == Colour.Red){
changeToGreen();
	
}
else if(CurrentColor == Colour.Green){
	changeToYellow();
	
}
else{
	changeToRed();
	
}
}
}
void changeToGreen(){
CurrentColor = Colour.Green;
duration = greenWait;
}
void changeToYellow(){
CurrentColor = Colour.Yellow;
duration = yelloWait;
}
void changeToRed(){
CurrentColor = Colour.Red;
duration = redWait;
}

}


class TrafficSignal extends Thread{
public static void main(String args[]){
Scanner scan = new Scanner(System.in);
int redWait = scan.nextInt();
int yelloWait= scan.nextInt();
int greenWait = scan.nextInt();
int trafficLoad = scan.nextInt();
Signal signalRed = new Signal(redWait,yelloWait,greenWait);
Signal signalGreen = new Signal(redWait,yelloWait,greenWait);
signalGreen.changeToGreen();
signalRed.start();
signalGreen.start();
for(int i = 0;i<trafficLoad;i+=5){
try{Thread.sleep(1000);}catch(InterruptedException e){}
}
signalRed.stop();
signalGreen.stop();
}
}