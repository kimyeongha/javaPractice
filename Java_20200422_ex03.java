package chapter04;

import java.util.Scanner;

public class Java_20200422_ex03 {

	public static void main(String[] args) {
		// 변수num 을 입력 받아 , num이 3의 배수이면서 4의 배수가 아니면 true를 그렇지 않으면 false 를 출력하는 프로그램을 작성해보자
   System.out.println("숫자 아무거나 입력해라 3의 배수이면서 4의 배수가 아니면 ture 맞으면 false가 나올것이다.");
		Scanner scan = new Scanner(System.in);
     int  num = scan.nextInt();
         if(!(num%4==0)&&num%3==0) {      //나누기 했을떄 0 이 되는것이 아니라 나머자 0 이되는 수가 해야 하니 / 가 아니라 %써야 겠지 ?
        	 System.out.println("true");
        	 
         }else {
        	 System.out.println("false");
         }
         
     
     }
    	
     }
       
		
		
	


