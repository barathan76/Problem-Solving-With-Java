import java.io.*;    
class Parent {    
  void msg()throws Exception{  
	
    System.out.println("parent method");  
	throw new Exception("Some Exception");
  }    
}    
    
class TestException extends Parent{    
  void msg() throws ArithmeticException{  
int i = 5/0;
    System.out.println("child method");  
  }    
    
  public static void main(String args[]) throws Exception{    
   Parent p = new TestException();    
     
 
   p.msg();     
       
  }    
} 