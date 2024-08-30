class A extends Thread{

public void run(){
System.out.println("Hello");
try{Thread.sleep(1000);}catch(InterruptedException e){};
}
}

public class ThreadExample{
public static void main(String args[]){
A a = new A();
a.start();
try{Thread.sleep(1000);}catch(InterruptedException e){};
a.stop();
a.start();
}

}