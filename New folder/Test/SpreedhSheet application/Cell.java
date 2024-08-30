import java.io.Serializable;
class Cell implements Serializable{
private static final long serialVersionUID = 1L;
Object value;
Integer int_value;
String str_value;
LocalDate date_value;
Cell(){
	int_value = 0;
str_value = "";
date_value = null
}
public void setData(Props.Type type, Object value){
	if(type == Props.Type.Number)
		int_value = (Integer) value;
	else if(type == Props.Type.Date)
		date_value = (LocalDate) value;
	else
		str_value = (String) value;
}

public Object getValue(Props.Type type){
	if(type == Props.Type.Number)
		return (Object) int_value;
	else if(type == Props.Type.Date)
		return (Object) date_value;
	else
		return (Object) str_value;
}


public void convert(Props.Type type1, Props.Type type2){
	if(type1 == Props.Type.Number && type2 == Props.Type.Text){
		try{
			str_value = String.valueOf(int_value);
		}
		catch(Exception e){
			str_value = "";
		}
	}else if(type1 == Props.Type.Text && type2 == Props.Type.Number){
		try{
			int_value = Integer.parseInt(str_value);
		}
		catch(Exception e){
			int_value = 0;
		}
	}
}


}