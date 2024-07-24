
public class Berth{
	private int no;
	private String type;
	private boolean isAvail;
	public Berth(int no,String type){
		this.no = no;
		this.type = type;
		this.isAvail = true;
	}
	public int getNo(){
		return no;
	}
	public String getType(){
		return type;
	}
	public boolean isAvail(){
		return isAvail;
	}
	public void allotBerth(){
		isAvail = false;
	}
}