class Row{
int rowId;
ArrayList<Cell> cells;
Row(List<Column> columns){
	cells = new ArrayList<Cell>();
	addRow(columns);
	for(Column column : columns){
		if(column.getType().equals("Number"))
			cells.add(new NumberCell());
		else if(column.getType().equals("Text"))
			cells.add(new TextCell());
		else if(column.getType().equals("Date"))
			cells.add(new DateType());
	}
}
public void setData(T t,int column){
	try{
		Cell<T> c = cells.get(column);
		c.setdata(t);
	}catch(Exception e){
		System.out.println("The input data format is wrong");
	}
}

}