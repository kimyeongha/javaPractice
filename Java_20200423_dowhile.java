package chapter04;

import java.util.Scanner;

/*do while -while 문 조건이 참, 거짓 이전에 일단한번은 실행 하도록한다. */
public class Java_20200423_dowhile {

	public static void main(String[] args) {
	           
	
		//임의의 숫자를 저장하는 변수

		System.out.println("숫자하나 입력해봐라");	
		int com =(int)(Math.random()*100)+1    ;
		Scanner scan = new Scanner(System.in);  
		int user = 0;	
	
		      //사용자가 입력한 숫자를 저장하는 변수 
		
		do {	 
			System.out.println("숫자하나 입력해봐라");
	
			user = scan.nextInt();	   
		         System.out.println(user);
		         System.out.println(com);
		
		// 임의의 숫자가 > 사용자가 입력한 숫자 
		         if(com>user) { 
		        	 System.out.println("조금 더 큰 수를 입력하세요");
		        	 
		         }else if(user>com){
		        	 System.out.println("더 작은수를 입력하세요");
		         }else {
		        	 System.out.println("맞았습니다"); 
		         }
		
		}while(com!=user);
		
	}

}
