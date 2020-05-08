package chapter06_Class01;

import java.util.Scanner;

public class java_20200507ex01 {
	  String op= " ";
	  
	
	 
	void cal(double a,String op, double b) {
	    	   if(op.equals("+")) {
	    		   double result = a+b;
	    		   System.out.println("답은"+result+"입니다");
	    		     
	    	   }
	    	   else if(op.equals("-")) {
	    		   double result = a-b;
	    		   System.out.println("답은"+result+"입니다");
	    	   }
	    	   else if(op.equals("*")) {
	    		   double result= a*b;
	    		   System.out.println("답은"+result+"입니다");
	    	   }
	    	   else if(op.equals("/")) {
	    		   double result=a/b;
	    		   System.out.println("답은"+result+"입니다");
	    	   }else {
	    		   System.out.println("다시 입력하시오");
	    	   }
	    	   
	       }
	      
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		java_20200507ex01 calculate = new java_20200507ex01();
     System.out.println("두숫자와 연산자를 입력하시오");
       Scanner s= new Scanner(System.in);
       double a =s.nextInt();
       String op=s.next();
       double b= s.nextInt();
      
	  calculate.cal( a, op,b);
	   
	
	}

}
