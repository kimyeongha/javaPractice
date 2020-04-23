package chapter04;

public class Java_20200422_switch02 {

	public static void main(String[] args) {
		 char op = '*';
		 int result = 0;
		 int num1 = 10;
		 int num2 = 25;
		 switch(op) {
		 case '+':
			    result= num1+num2 ;
			 break;
		 case '-':
		      result= num1- num2;
		      break;
		 case '*' :
			 result=  num1*num2;
			 break;
		 case '/' :
			 result = num1/num2;
			 break;
			 
		    
			 
		 }
		  System.out.println(result);
	}

}
