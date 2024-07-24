abstract class Marks{
abstract float getPercentage();
}

class A extends Marks{
private int sub1;
private int sub2;
private int sub3;
A(int sub1, int sub2, int sub3){
this.sub1 = sub1;
this.sub2 = sub2;
this.sub3 = sub3;
}

float getPercentage(){
return (float)((sub1+sub2+sub3)/3);
}
}
class B extends Marks{
private int sub1;
private int sub2;
private int sub3;
private int sub4;
B(int sub1,int sub2,int sub3, int sub4){
this.sub1 = sub1;
this.sub2 = sub2;
this.sub3 = sub3;
this.sub4 = sub4;
}
float getPercentage(){
return (float)((sub1+sub2+sub3+sub4)/4);
}
}


class L3{
public static void main(String args[]){
A studentA = new A(97,99,87);
System.out.println("Percentage of student A : "+studentA.getPercentage());
B studentB = new B(97,99,99,80);
System.out.println("Percentage of student B : "+studentB.getPercentage());
}
}

