
class ExceptionHandling{
static int divide(int a,int b){
if(b==0){
throw new ArithmeticException("Zero divisor");
}
else{
return a/b;
}
}
static int arraySize(int arr[], int index){
if(index <0){
throw new ArrayIndexOutOfBoundsException("Negative index");
}else{
return arr[index];
}
}

static int 
public static void main(String args[]){
try{
System.out.println(divide(10,1));
int arr[] = new int[2];
System.out.println(arraySize(arr,-1));
}catch(ArithmeticException e){
	System.out.println(e);
}catch(ArrayIndexOutOfBoundsException e){
	System.out.println(e);
}finally{
System.out.println("The code is executed");
}
}
}