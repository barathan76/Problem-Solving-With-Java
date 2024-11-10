import java.util.Map;
import java.util.HashMap;
public class Coach{
Map<Integer,Berth> berths;
List<Integer> racs;
enum Status{AVL,RAC1,RAC2,CNF,WL1}
public Coach(){
	berthMap = new HashMap<Integer,Berth>();
	racs = new ArrayList<Integer>();
	assignBerths();
}
public void assignBerths(){
	berths.put(1,new Berth(1,"LB"));
	berths.put(2,new Berth(2,"MB"));
	berths.put(3,new Berth(3,"UB");
	berths.put(4,new Berth(4,"LB"));
	berths.put(5,new Berth(5,"MB"));
	berths.put(6,new Berth(6,"UB"));
	berths.put(7,new Berth(7,"SL"));
	berths.put(8,new Berth(8,"SU"));
	berths.put(9,new Berth(9,"LB"));
	berths.put(10,new Berth(10,"MB"));
	berths.put(11,new Berth(11,"UB"));
	berths.put(12,new Berth(12,"LB"));
	berths.put(13,new Berth(13,"MB"));
	berths.put(14,new Berth(14,"UB"));
	berths.put(15,new Berth(15,"SL"));
	berths.put(16,new Berth(16,"SU"));
	racs.add(7);
	racs.add(15);
}






}