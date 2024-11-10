package ContactManagementSystem;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.Scanner;


class CallClass extends Thread{
public void run(){
while(true){
System.out.print("ON Call");
try{Thread.sleep(2000);}catch(InterruptedException e){}
return;
}
}
}

class ContactSystem{
List<Contact> contacts;
Map<Contact,Integer> history;
ContactSystem(){
contacts = new ArrayList<Contact>();
history = new HashMap<Contact,Integer>();
}
Contact searchContact(String name){
for(int i=0;i<contacts.size();i++){
if(contacts.get(i).equals(name))
	return contacts.get(i);
}
return null;
}

Contact searchNumber(String number){
for(int i =0;i<contacts.size();i++){
if(contacts.get(i).checkPhoneNumber(number))
	return contacts.get(i);
}
return null;
}
void call(){
Scanner scan = new Scanner(System.in);

System.out.println("Enter the contact number");
String number = scan.nextLine();
Logger logger = new Logger();
Contact c = searchNumber(number);
if(c!=null){
		if(history.containsKey(c))
			history.put(c,history.get(c)+1);
		else
			history.put(c,1);

CallClass cc = new CallClass();
System.out.println("Call under progress press 1 to end the call");
long a = System.currentTimeMillis();
cc.start();
while(true){
long n = scan.nextInt();
if(n == 1){
cc.stop();break;}

}
long b = System.currentTimeMillis();
logger.log(c,a,b);
}else{
	System.out.println("Contact not found");
}		
}

void editDetail(){
Scanner scan = new Scanner(System.in);

System.out.println("Enter the name of the contact " );
String name = scan.nextLine();
Contact c = searchContact(name);
if(c == null){
	System.out.println("Contact not found");
	return;}
while(true){
System.out.println("Enter the contact number");
String phoneNumber = scan.nextLine();
if(!c.setPhoneNumber(phoneNumber))
	continue;
System.out.println("Enter the email");
String companyName = scan.nextLine();
if(!c.setCompanyName(companyName))
	continue;
break;
}
}

void addContact(){
Scanner scan = new Scanner(System.in);
Contact c = new Contact();
System.out.println("Enter the name of the contact " );
String name = scan.nextLine();
c.setName(name);
while(true){
System.out.println("Enter the contact number");
String phoneNumber = scan.nextLine();
if(!c.setPhoneNumber(phoneNumber))
	continue;
System.out.println("Enter the email");
String companyName = scan.nextLine();
if(!c.setCompanyName(companyName))
	continue;
break;
}
contacts.add(c);
}
boolean delete(){
Scanner scan = new Scanner(System.in);
Contact c = null;
System.out.println("Enter the name of the contact to delete " );
String name = scan.nextLine();
int i;
for(i=0;i<contacts.size();i++){
if(contacts.get(i).equals(name))
	c = contacts.get(i);
}
if(c == null){
	System.out.println("Contact not found");
	return false;}
c.setEmail(null);
c.setPhoneNumber(null);
c.setCompanyName(null);
contacts.remove(i);
System.out.println("Contact number removed");
return true;
}
}


