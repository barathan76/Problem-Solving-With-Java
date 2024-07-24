class D extends Thread {
public void run(){
System.out.println("Hello");
}
}
public class DaemonThreadExample{
public static void main(String args[]){
D t = new D();
t.setDaemon(true);
t.start();
for(int i = 0;i<10;i++);
	
}
}