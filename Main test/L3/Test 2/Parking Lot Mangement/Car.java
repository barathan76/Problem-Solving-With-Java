package Vechile;


public class Car implements Vechile{


private String regNo;


public void setRegNo(String regNo){
this.regNo = regNo;
}


public String getType(){
return "Car";
}
public String getRegNo(){
return regNo;
}

public int getSize(){
return 5;
}

public boolean equals(String regNo){
return this.regNo.equals(regNo);
}


}