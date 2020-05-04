package chapter06_Class01;

import java.util.Scanner;

public class caculateTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      while(true) {
		calculate cal = new calculate();
         Scanner scan= new Scanner(System.in);
         System.out.println("숫자와 연산자를 입력하시오");
         int number1=scan.nextInt();
         String op= scan.next();
         int number2=scan.nextInt();
         if(op.equals("+")) {
        	 calculate.getadd(number1, op, number2);
             	 
         }else if(op.equals("-")) {
        	 calculate.getsub(number1, op, number2);
         }else if(op.equals("*")) {
        	 calculate.getmul(number1, op, number2);
         }else if(op.equals("/")) {
        	 calculate.getdiv(number1, op, number2);
        	 
         }else {
        	 System.out.println("다시 입력하라");
         }
      }   
	}

}
