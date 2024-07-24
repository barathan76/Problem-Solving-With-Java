package Services;
public class TransactionHistory{
String senderName;
String senderHid;
String amount;
String receiverName;
String receiverHid;
public TransactionHistory(String s,String sh,String amount,String r,String rh){
this.senderName = s;
this.senderHid = sh;
this.amount = amount;
this.receiverName = r;
this.receiverHid = rh;
}
public void getTransaction(){
System.out.println("Transaction from "+senderName + " with HId ["+ senderHid + "] to " + receiverName + " with HId[" + receiverHid+"] Amount : "+amount);
}
}