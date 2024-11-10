package user_repo;
import java.util.List;
import java.util.ArrayList;
import resource.Item;
interface User{
boolean signIn(String email,String password);
void signUp(String email,String password);
void veiwInfo();
void getId();
}


public class Customer implements User{
private String userId;
private String userName;
private String email;
private String password;
private List<Item> cart;
public Customer(String name,String email,String password){
this.userName = name;
this.email = email;
this.password = password;
cart = new ArrayList<Item>();
}
public boolean signIn(String email, String password){
if(this.email == email && this.password == password)
	return true;
return false;
}

public boolean checkEmail(String email){
return this.email.equals(email);
}

public void signUp(String email,String password){
if(email == null && password == null){
	this.email = email;
	this.password = password;
}else{
System.out.println("User account already exists");
}
}
public void addToCart(Item item){
cart.add(item);
}

public int getTotatAmountCart(){
int sum = 0;
for(Item i : cart)
	sum+= i.getPrice();
return sum;
}


public void veiwInfo(){
System.out.println("User Name : " + userName);
}
public void getId(){
if(userId==null){
int i = (int)(Math.random()*1000);
userId = "SCT"+i;
}
}


}