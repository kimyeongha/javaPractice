package chapter04;

import java.util.Scanner;

public class Java_20200423_forex01 {

	public static void main(String[] args) {
		System.out.println("원하는 구구단을 쳐보시오");
         int i = 0;
         int j = 0;
         Scanner scan= new Scanner(System.in);
         int dan= scan.nextInt();
         
         for(i=1; i<10; i++) {
        
        		 System.out.println(dan+"*"+i+"="+dan*i);
        	 }
         }

}
  
    
