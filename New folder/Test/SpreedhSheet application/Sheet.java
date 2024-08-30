import java.util.List;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Collections;
import java.io.Serializable;
class Sheet implements Serializable{
	private static final long serialVersionUID = 1L;
	String name;
	int r;
	int c;
	List<Row> Rows;
	List<Column> Columns;
	
	/*List<Column> template*/
	Sheet(String name){
		Rows = new ArrayList<Row>();
		Columns = new ArrayList<Column>();
		this.name = name;
		r = 1;
		c = 1;
		Rows.add(new Row(Columns));
		Columns.add(new Column(1,Props.Type.Number));
	}
	public void addRow(){
		Rows.add(new Row(c));
		r++;
	}
	public boolean deleteRow(int index){
		if(index-1<0)
			return false;
		if(index-1 >= Rows.size())
			return false;
		if(r-1 == 0){
			System.out.println("You cannot delete this row, minimum one row exists");
			return false;
		}
		Rows.remove(index-1);
		r--;
		System.out.println("Row deleted Successfully");
		return true;
	}
	public void addColumn(Props.Type type){
		Columns.add(new Column(Columns.size(),type));
		for(Row row: Rows){
			row.addCell();
		}
		c++;
	}
	public boolean removeColumn(int index){
		if(index-1<0 || index-1>= Columns.size())
			return false;
		if(c-1 == 0){
			System.out.println("You cannot delete this column, minimum one column exists");
			return false;
		}
		Columns.remove(index-1);
		for(Row row: Rows){
			row.removeCell(index);
		}
		c--;
		return true;
	}
	public boolean setData(int i,int j,Object data,Props.Type type){
		if(i-1 < 0 || i-1>=Rows.size() || j-1<0 || j-1>= Columns.size())
			return false;
		Row row = Rows.get(i-1);
		if(Columns.get(j-1).getType!=type)
			return false;
		row.setData(j-1,data,type);
		System.out.println("Data is set");
		return true;
	}
	public boolean setType(int index,Props.Type type){
		if(index<0 || index>= Columns.size())
			return false;
		Column column = Columns.get(index-1);
		column.setType(type);
		System.out.println("Data type is modified");
		return true;
	}
	
	
	public boolean sort(int index){
		if(index-1<0 || index-1>=Columns.size())
			return false;
		Props.Type type = Columns.get(index).getType();
		Collections.sort(Rows, new Comparator<Row>(){
			public int compare(Row r1, Row r2){
				return r1.cells.get(index-1).getValue().equals(r2.cells.get(index-1).getValue());
			}
		});
		return true;
	}
	public List<Row> filter(int index,Object value){
		List<Row> ans = new ArrayList<Row>();
		Props.Type type = Columns.get(index).getType();
		for(Row row: Rows){
			int k = row.cells.get(index-1).getValue().equals(value);
			if(k>0)
				ans.add(row);
		}
		return ans;
	}
	
}