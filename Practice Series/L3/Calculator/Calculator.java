package pack1;
public class Calculator{
private int add(int a,int b){
return a+b;
}
private int subtract(int a,int b){
return a-b;
}
private int multiply(int a,int b){
return a*b;
}
private float divide(int a,int b){
return (float)a/(float)b;
}
private float percentage(int a,int b){
return ((float)a*(float)b)/100;
}
private float percentOf(int a,int b){
return ((float)a*100)/(float)b;
}
private float incDec(int a,int b){
return (((float)b - (float)a)*100)/(float)a;
}
public float calculate(int a,int b, char c){
switch(c){
case '+' : 
	return add(a,b);
case '-' :
	return subtract(a,b);
case '*': 
	return multiply(a,b);
case '/':
	return divide(a,b);
case '%':
	return percentage(a,b);
case '?':
	return percentOf(a,b);
case '$':
	return incDec(a,b);
default:
	System.out.println("Invalid operation");
	break;
}
return 0;
}
}



