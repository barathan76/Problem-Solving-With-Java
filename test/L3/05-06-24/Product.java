package Collectives;
public class Product{
private String productId;
private String productName;
private double price;
public Product(String productId, String productName, double price){
this.productId = productId;
this.productName =productName;
this.price =price;
}
public String getProductName(){
return productName;
}
public String getProductId(){
return productId;
}
public double getPrice(){
return price;
}


public boolean equals(String name){
return this.productName.equals(name);
}
}