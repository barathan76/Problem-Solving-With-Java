import java.util.Scanner;
class Ebill{
private int units;
Ebill(int units){
this.units = units;
}
float getDomesticBill(){
if(units<=100)
	return 0;
else if(units>100 && units <=200){
int k = units;
k -= 100;
return k*(float)1.5;
}else if(units>200 && units<=500){
int k = units;
k-=100;
float amount = (float)100*2;
k-=100;
amount+=k*3;
return amount;
}else{
int k = units;
k-=100;
float amount = 100*(float)3.5;
k-=100;
amount+=300*(float)4.6;
k-=300;
amount+=k*(float)6.6;
return amount;
}
}
float getCommercialBill(){
if(units<50){
return units*6;
}else{
int k =units;
float amount = 50*100;
k-=50;
if(k<=62){
amount += k*(float)9.5;
}else if(k>62){
amount += k*(float)9.5;
k-=62;
amount += k*(float)550;
}
return amount;
}
}
}




class ElectricityBill{
public static void main(String args[]){
Scanner scan = new Scanner(System.in);
while(true){
System.out.println("Enter 1 to get in....\nEnter 2 to exit...");
int n = scan.nextInt();
switch(n){
case 1:
	while(true){
		System.out.print("Enter the units");
		int units = scan.nextInt();
		Ebill ebill = new Ebill(units);
		System.out.println("Enter 1 for domestic\nEnter 2 for commercial\nEnter 3 for exit");
		int e = scan.nextInt();
		switch(e){
			case 1:
				System.out.println(ebill.getDomesticBill());
				break;
			case 2:
				System.out.println(ebill.getCommercialBill());
				break;
			case 3:
				return;
			default:
				System.out.println("Invalid input");
		}
}
case 2:
	return;
default:
	System.out.println("Invalid Input");
}
	
}


}
}