class ThreadSample implements Runnable{
int i;
ThreadSample(int i){
this.i = i; 
}
public void run(){
long begin = System.currentTimeMillis();
System.out.println("Thread "+i+" has started and running");
try{
Thread.sleep(500);
}catch(InterruptedException e){
System.out.println(e);
}
long end = System.currentTimeMillis(); 
System.out.println("Thread " + i+ " stoped after executing for "+(end-begin)+"ms");
}
}


class MyThread extends Thread{
MyThread(){
super();
}

public void run(){
System.out.println("MyThread has started its execution");
System.out.println("The name of the thread is : " + Thread.currentThread().getName());
}
}



class Main{
public static void main(String args[]){
ThreadSample sampleThread = new ThreadSample(1);
Thread thread1 = new Thread(sampleThread);
thread1.start();

MyThread myThread = new MyThread();
myThread.setName("Hello Thread");
System.out.println("Main Thread is started its execution");
long start = System.currentTimeMillis();
myThread.start();

try{
Thread.sleep(200);
}
catch(InterruptedException e){
System.out.println(e);
}
long end = System.currentTimeMillis();
System.out.println("Main Thread stopped its execution after "+(end-start));

}
}