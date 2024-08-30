import java.io.Serializable;
class Column implements Serializable{
	private static final long serialVersionUID = 1L;
int id;
Props.Type type = Props.Type.Number;
Column(int id,Props.Type type){
this.id = id;
this.type = type;
}

public void setType(Props.Type type){
	this.type = type;
}
public Props.Type getType(){
	return this.type;
}
}