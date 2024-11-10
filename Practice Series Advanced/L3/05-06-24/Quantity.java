package Collectives;
public class Quantity{
String productId;
int quantity;
public Quantity(String productId,int quantity){
this.productId = productId;
this.quantity = quantity;
}

public int getQuantity(){
return quantity;
}
public boolean equals(String productId){
return this.productId.equals(productId);
}

public String productId(){
return productId;
}

}