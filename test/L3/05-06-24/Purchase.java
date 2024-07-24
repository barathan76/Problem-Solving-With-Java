package Collectives;
public class Purchase{
String email;
String productId;
String productName;
int quantity;
double amount;
public Purchase(String email, String productId,String productName, int quantity, double amount){
this.email = email;
this.productId = productId;
this.productName = productName;
this.quantity = quantity;
this.amount = amount;
}


public String getEmail(){
return email;
}
public String getProductId(){
return productId;
}
public int getQuantity(){
return quantity;
}
public double getAmount(){
return amount;
}
public String getProductName(){
return productName;
}
}