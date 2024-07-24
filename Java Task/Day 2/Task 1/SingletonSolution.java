class Singleton
{
private static Singleton instance;
private Singleton(){}
public String name;
public static synchronized Singleton getInstance() {
if(instance == null) {
instance = new Singleton();
}
return instance;
}
}

class SingletonSolution
{
public static void main(String args[])
{
Singleton singleton = Singleton.getInstance();
singleton.name = "Hello World";
System.out.println(singleton.name+"Welcome to the jungle");

}
}
