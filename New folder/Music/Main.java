import java.util.List;
import java.util.ArrayList;
public class CustomList extends ArrayList<String>{
}
public class Main
{
    public static void print(String str){
        System.out.println("This is string");
    }
    public static void print(int i){
        System.out.println("This is integer");
    }
    
	public static void main(String[] args) {
	    List<String> list=new ArrayList<String>();  
	    list.add("123");
	    list.add("456");
	    list.add("1131");
	    list.add("12313123");
	    list.add("132132");
	    list.add("12321321");
	 
	    CustomList customlist = new CustomList();
customlist.addAll(list);
	    System.out.println(list);
	       customlist.removeRange(1,4);
	    list.toArray();
		System.out.println("Hello World");
		

	}
}
