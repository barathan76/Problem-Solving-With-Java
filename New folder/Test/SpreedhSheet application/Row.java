import java.util.List;
import java.util.ArrayList;
import java.io.Serializable;
class Row implements Serializable{
private static final long serialVersionUID = 1L;
int rowId;
List<Cell> cells;
Row(int c){
	cells = new ArrayList<Cell>();
	for(int i =0;i<c;i++){
		cells.add(new Cell());
	}
}
public void setData(int index, String value,Props.Type type){
	try{
		Cell c = cells.get(index);
		c.setData(type,value);
	}catch(Exception e){
		System.out.println("The input data format is wrong");
	}
}
public void addCell(){
	cells.add();
}
public void removeCell(int index){
	cells.remove(index);
	
}

}