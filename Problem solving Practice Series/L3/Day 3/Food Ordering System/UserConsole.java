package system;
import resource.Food;
import user_repo.Customer;
import authenticator.CustomerAuthenticator;

import java.util.List;
interface OrderingSystemConsole{
}


class UserConsole implements OrderingSystemConsole{

enum ConsoleStatus {init,loggedIn,loggedOut}
ConsoleStatus status = ConsoleStatus.init;
Customer customer;
List<Food> foods;
DataFetcher fetcher;
UserConsole(){
fetcher = new DataFetcher();
}

MenuOrder menu = new MenuOrder();


void getFoods(){
foods = fetcher.fetchFood();
}
void signUp(){
CustomerAuthenticator authenticator = new CustomerAuthenticator();
customer = authenticator.signUp();
status = ConsoleStatus.loggedIn;
}

void signIn(){
}

boolean searchFood(String name){
for(Food food:foods)
	if(food.getName().equals(name))
		return true;
return false;
}

void displayMenu(){
for(int i =0;i<foods.size();i++)
	System.out.println((i+1)+" "+foods.get(i).getName() + " "+foods.get(i).getPrice());
}
void selectFood(int i){
menu.selectItem(foods.get(i));
}

void removeFood(int i){
menu.removeItem(foods.get(i));
}

void getBill(){
menu.getBill();
}



}
