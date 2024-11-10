package Console;
import Account.Authenticator;
import Services.*;
import java.util.Scanner;
import Collectives.*;
import java.util.List;
import java.util.ArrayList;
public class AdminConsole{

Authenticator authenticator;

public AdminConsole(){
authenticator = new Authenticator();
}
public void window(){

Scanner scan = new Scanner(System.in);
System.out.println("Enter 1 to Sign In\nEnter 2 to exit");
int n = scan.nextInt();
scan.nextLine();
switch(n){
case 1:
	SignIn(scan);break;
case 2:
return;
default:
	return;
}
}

public void SignIn(Scanner scan){
int n = 5;
while(n>0){
System.out.println("Enter email : ");
String email = scan.nextLine();
System.out.println("Enter password : ");
String password = scan.nextLine();

if(authenticator.authenticateAdminAccount(email,password)){
	adminWindow(scan);
	return;
}
else{
	System.out.println("Invalid credentials");
	n--;
}
}
System.out.println("You have tried many times get lost");
}



public void adminWindow(Scanner scan){
while(true){
System.out.println("Enter 1 to add products\nEnter 2 to generate coupan code\nEnter 3 to get Shopping history\nEnter 4 to check product availability\nEnter 5 to exit");
int n = scan.nextInt();
scan.nextLine();
switch(n){
case 1:
	addProducts(scan);
	break;
case 2:
	generateCoupan(scan);
	break;
case 3:
	getShoppingHistory(scan);
	break;
case 4:
	checkProductAvailability(scan);
	break;
case 5:
	return;
default:
	return;

}
}
}


void addProducts(Scanner scan){

List<Product> products = ProductFileHandler.fetchProducts();
List<Quantity> quantities = QuantityFileHandler.fetchQuantities();
while(true){
System.out.println("Enter 1 to add Products\nEnter 2 to exit");
int n = scan.nextInt();
scan.nextLine();

switch(n){

case 1:	
System.out.println("Enter Product id");
String id = scan.nextLine();
System.out.println("Enter Product Name");
String name = scan.nextLine();
System.out.println("Enter price");
Double price = scan.nextDouble();
scan.nextLine();
System.out.println("Enter quantity");
int q = scan.nextInt();
scan.nextLine();
Product product = new Product(id,name,price);
Quantity quantity = new Quantity(id,q);
products.add(product);
quantities.add(quantity);
break;
case 2:
	ProductFileHandler.updateProducts(products);
	QuantityFileHandler.updateQuantities(quantities);
	return;
}

}
}


void generateCoupan(Scanner scan){
List<Coupan> coupans = CoupanFileHandler.fetchCoupans();
System.out.println("Enter product id");
String id = scan.nextLine();
System.out.println("Enter discount ");
double discount = scan.nextDouble();
scan.nextLine();
String code = id+"2024";
Coupan coupan = new Coupan(code,id,discount);

coupans.add(coupan);

CoupanFileHandler.updateCoupans(coupans);
}

void getShoppingHistory(Scanner scan){
System.out.println("Enter product name");
String name = scan.nextLine();
List<Purchase> purchases = PurchaseFileHandler.fetchPurchases(name);
if(purchases.size() == 0){
	System.out.println("No purchases found");
return;
}

for(Purchase purchase : purchases)
	System.out.println(purchase.getEmail()+ "  "+purchase.getProductId()+"  "+purchase.getProductName()+"  "+purchase.getQuantity()+"  "+purchase.getAmount());
}

void checkProductAvailability(Scanner scan){

List<Quantity> quantities = QuantityFileHandler.fetchQuantities();

System.out.println("Enter product id ");
String id = scan.nextLine();

for(Quantity quantity : quantities){
if(quantity.equals(id)){
	System.out.println(quantity.getQuantity());
	return;
}
}
System.out.println("Item not found");

}


















}




