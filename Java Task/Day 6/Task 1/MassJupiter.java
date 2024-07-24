class ThreadJunior extends Thread{
private int i;
ThreadJunior(int i){
this.i = i;
start();
}

public void run(){
System.out.println("Thread "+i+" has started its execution");
}
}

class MassJupiter{
public static void main(String args[]){
ThreadJunior junior1 = new ThreadJunior(1);
ThreadJunior junior2 = new ThreadJunior(2);
System.out.println("Main Thread stopped its execution");
VenusThread venus1 = new VenusThread("Hot");
VenusThread venus2 = new VenusThread("Aromatic");
VenusThread venus3 = new VenusThread("Invigorating");
venus1.start();
venus2.start();
venus3.start();
venus3.stop();
venus3.start();
MyClass classThread = new MyClass(1);
Thread thread = new Thread(classThread);
thread.start();
}
}



class VenusThread extends Thread{
String str;
VenusThread(String str){
this.str = str;
}

public void run(){
System.out.println("Java is "+str);
}
}


class MyClass implements Runnable{
private int i;
MyClass(int i)
{
this.i = i;
}
public void run(){
System.out.println("My Class "+i+" has started its execution");
}
}

