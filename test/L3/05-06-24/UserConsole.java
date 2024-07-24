package Console;
import Account.Account;
import Account.Authenticator;
import java.util.HashMap;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import Collectives.*;
import Services.*;
public class UserConsole{
Account userAccount;
HashMap<String,List<Product>> wishlist;
Authenticator authenticator;

List<Product> availableProducts;

public UserConsole(){
authenticator = new Authenticator();
wishlist = new HashMap<String,List<Product>>();
}

public void window(){
Scanner scan = new Scanner(System.in);
System.out.println("Enter 1 to Sign up\nEnter 2 to Sign In\nEnter 3 to exit");
int n = scan.nextInt();
scan.nextLine();
switch(n){
case 1:	
	signUp(scan);
	break;
case 2:
	signIn(scan);
	break;
case 3:
	return;
default:
	return;
}
}


public void signIn(Scanner scan){
int n = 5;
while(n>0){
System.out.println("Enter email : ");
String email = scan.nextLine();
System.out.println("Enter password : ");
String password = scan.nextLine();

if(authenticator.authenticateUserAccount(email,password)){
	userAccount = authenticator.getUserAccount(email,password);
	userWindow(scan);
	return;
}
else{
	System.out.println("Invalid credentials");
	n--;
}
}
System.out.println("You have tried many times get lost");
}


public void signUp(Scanner scan){
while(true){
System.out.println("Enter 1 to continue\nEnter 2 to exit");
int n = scan.nextInt();
scan.nextLine();
if(n == 2)
	return;
System.out.println("Enter name : ");
String name = scan.nextLine();
System.out.println("Enter email : ");
String email = scan.nextLine();
System.out.println("Enter password : ");
String password = scan.nextLine();

if(authenticator.checkEmail(email)){
	userAccount = authenticator.getUserAccount(name,email,password);
	userWindow(scan);
	return;
}
}
}


public void userWindow(Scanner scan){

availableProducts = ProductFileHandler.fetchProducts();


while(true){
System.out.println("Enter 1 to list all the products\nEnter 2 to search a product\nEnter 3 to exit");
int n = scan.nextInt();
scan.nextLine();
switch(n){
case 1:
	if(availableProducts.size()!=0){
for(Product product : availableProducts)
	System.out.println(product.getProductName()+ "    "+product.getPrice());
}
break;
case 2:
	productSearch(scan);
	break;
case 3:
	return;
}
}

}


public void productSearch(Scanner scan){

System.out.println("Enter the product name");
String productName = scan.nextLine();
Product p;
if(availableProducts.size()!=0){
for(Product product : availableProducts){
	if(product.equals(productName)){
		p = product;
		productSelection(p,scan);
		return;
}
}

System.out.println("Product not found");
}
}


public void productSelection(Product product, Scanner scan){
System.out.println(product.getProductId() + "  "+product.getProductName()+ "  "+product.getPrice());
System.out.println("Enter 1 to add the product to wishlist\nEnter 2 to order the product\nEnter 3 to exit");
int n = scan.nextInt();
scan.nextLine();
switch(n){

case 1:
	addToWishList(product,scan);
	break;
case 2:
	orderProduct(product,scan);
	break;
case 3:
	return;

}
}


public void addToWishList(Product product, Scanner scan){
System.out.println("Enter the name of the wishlist");
String name = scan.nextLine();
if(!wishlist.containsKey(name)){
List<Product> products = new ArrayList<Product>();
products.add(product);
wishlist.put(name,products);
}
else{
List<Product> products = wishlist.get(name);
products.add(product);
}	
}


public void orderProduct(Product product,Scanner scan){

System.out.println("Enter the quantity");
int n = scan.nextInt();
scan.nextLine();

List<Quantity> quantities = QuantityFileHandler.fetchQuantities();

if(quantities.size() !=0){
boolean flag = false;
for(Quantity quantity: quantities){
if(quantity.equals(product.getProductId())){
	if(!(n< quantity.getQuantity())){
		System.out.println("Reduce the quantity, only few products are available"); 
return;
}
flag = true;		
}
}
if(!flag){
	System.out.println("Product is unavailable");
	return;
}


System.out.println("Enter coupon code");
String code = scan.nextLine();
double amount = product.getPrice();
List<Coupan> coupans = CoupanFileHandler.fetchCoupans();
for(Coupan coupan : coupans){
if(coupan.validateCoupan(code,product)){
	amount  = (amount*coupan.getDiscount())/100;
	break;
}
}





Purchase purchase = new Purchase(userAccount.getName(),product.getProductId(),product.getProductName(),n,n*amount);
PurchaseFileHandler.addPurchases(purchase);
System.out.println("You have bought the product");

}


}

}


