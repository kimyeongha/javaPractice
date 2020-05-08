package chapter06_Class01;

public class MyMath3 {
   //두수를 더하는 매서드를 완성하시오.
  static int addii(int a  , int b) {
	  System.out.println("static int add(int a  , int b)");
	       int result = a+b;
	          return result;
  }   //정수+정수인,경우 
  float addfi(float a , int b) {
	  System.out.println(" float addfi(float a , int b)");
	  float result= a+b;
	    return result;
  }//실수 + 정수 인경우
  float addif(int a , float b) {
	  System.out.println(" float addif(int a , float b)");  
	  float result= a+b;
	    return result;
}//정수 + 실수 인경우
  float addff(float a , float b) {
	  System.out.println("float addff(float a , float b)");  
	  float result= a+b;
	    return result;
}//실수 + 실수 인경우
  
  void add(double a, double b) {
	
      double result = a+b;
      System.out.println(result);      
  }
  

  







}
