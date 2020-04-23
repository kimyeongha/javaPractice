package chapter04;

import java.util.Scanner;

public class Java_20200422_ex04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     System.out.println("원하는 숫자를 입력하십시오");
       Scanner scan = new Scanner(System.in);
         int num =  scan.nextInt();
         if(num%2==0) {
        	            if(num>0) {
        	            	System.out.println("짝수입니다.");
        	            }else{
        	            	System.out.println("0입니다.");
        	            }
        	 
         }else if(num%2==1) {
        	 System.out.println("홀수입니다.");
         }
		
		
		
	}

}
