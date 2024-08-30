import java.util.ArrayList;
import java.util.List;




class ThreadSample extends Thread{
List<Integer> list;
int k;
int name;
int sleepTime;
ThreadSample(List<Integer> list, int k, int name,int sleepTime){
this.list = list;
this.k = k;
this.name =name;
this.sleepTime = sleepTime;
}
public void run(){

synchronized(list){
for(int i =0;i<list.size();i++){
System.out.println("From Thread "+name+ " the value at index "+i+" before changing "+list.get(i));
list.set(i,list.get(i)+k);
System.out.println("From Thread "+name+ " the value at index "+i+" after changing "+list.get(i));
try{
System.out.println("Thread "+name+" going to sleep at time : "+System.currentTimeMillis());
System.out.println();
System.out.println();
Thread.sleep(sleepTime);}catch(InterruptedException e){System.out.println(e);}
}
}
}
}



class ThreadCollection{
public static void main(String args[]){
List<Integer> list = new ArrayList<Integer>();
list.add(1);
list.add(1);
list.add(1);
list.add(1);
list.add(1);
System.out.println(list);
ThreadSample thread1 = new ThreadSample(list,1,1,2000);
ThreadSample thread2 = new ThreadSample(list,2,2,0);
thread1.start();


try{
thread1.join();
System.out.println(list);
thread2.start();
thread2.join();
System.out.println(list);
}catch(InterruptedException e){System.out.println(e);}



}
}
