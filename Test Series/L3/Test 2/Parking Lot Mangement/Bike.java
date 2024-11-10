package Vechile;


public class Bike implements Vechile{


private String regNo;


public void setRegNo(String regNo){
this.regNo = regNo;
}


public String getType(){
return "Bike";
}
public String getRegNo(){
return regNo;
}

public int getSize(){
return 1;
}

public boolean equals(String regNo){
return this.regNo.equals(regNo);
}


}