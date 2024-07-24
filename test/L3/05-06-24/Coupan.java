package Collectives;
public class Coupan{
private String code;
private String productId;
private double discount;
public Coupan(String code,String productId,double discount){
this.code = code;
this.productId = productId;
this.discount = discount;
}

public boolean validateCoupan(String code,Product product){
if(this.code.equals(code) && this.productId.equals(product.getProductId()))
	return true;
else{
System.out.println("Invalid coupon code");
return false;
}
}


public String getCode(String c){
if(c.equals("Writer"))
	return code;
else	
	return " ";
}
public String getProductId(String c){
if(c.equals("Writer"))
	return productId;
else	
	return " ";
}

public double getDiscount(String c){
if(c.equals("Writer"))
	return discount;
else	
	return 0;
}


public double getDiscount(){
return discount;
}



}