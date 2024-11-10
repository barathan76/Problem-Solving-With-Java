package system;
import resource.Food;
import resource.Hotel;
import resource.Item;
import user_repo.Customer;
import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
interface OrderingSystem{
boolean launch();
void checkStatus();
void userLogin(Customer user);
void addToCart(Item item);
Item searchItem();
void removeFromCart();
void Payment();
}


class FoodOrderingSystem implements OrderingSystem{
enum Status{LoggedIn,LoggedOut,Init,Closed}
Status appStatus = Status.Closed;
private Customer customer;
private List<Customer> users;
private List<Hotel> hotels;
private HashMap<Food, List<Hotel>> foodCatalog;

public void checkStatus(){
if(appStatus == Status.Closed){
return;
}
}

public boolean launch(){
appStatus = Status.Init;
if(customer == null)
	return false;

return true;
}
boolean SignIn(String email,String password){
for(Customer c : users)
	if(c.signIn(email,password))
		return true;
return false;
}

boolean SignUp(String name,String email,String password){
Customer c = new Customer(name,email,password);
users.add(c);
customer = c;
return true;
}

public void userLogin(Customer customer){
this.customer = customer;
}
public void addToCart(Item item){
customer.addToCart(item);
}
public Item searchItem(){
return new Food();}
public void removeFromCart(){}
public void Payment(){}
}