import java.util.NavigableSet;
import java.util.TreeSet;
import java.util.Iterator;
public class TreeSetImp
{
	public static void main(String[] args) {
		System.out.println("Hello World");
		TreeSet<Integer> treeSet = new TreeSet<Integer>();
		treeSet.add(33);
		treeSet.add(22);
		treeSet.add(77);
		treeSet.add(11);
		treeSet.add(44);
		treeSet.add(66);
		Iterator iterator = treeSet.iterator();
		while(iterator.hasNext()){
			System.out.print(iterator.next()+" ");
		}
		System.out.println();
		
		 iterator = treeSet.descendingSet().iterator();
		while(iterator.hasNext()){
			System.out.print(iterator.next()+" ");
		}
		System.out.println();
		iterator = treeSet.tailSet(33).iterator();
		while(iterator.hasNext()){
			System.out.print(iterator.next()+" ");
		}
System.out.println("TailSet: "+treeSet.tailSet(22, true));  
		
		
	}
}