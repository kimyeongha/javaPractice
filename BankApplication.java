package chapter07;

import java.util.ArrayList;
import java.util.Scanner;

public class BankApplication {
	public static void main(String[]args) {
		Scanner s = new Scanner(System.in);
		ArrayList<Integer> accountnumber = new ArrayList<Integer>();
		ArrayList<String> accountname = new ArrayList<String>();
		ArrayList<Integer> accountbalance = new ArrayList<Integer>();


   while(true) {
	System.out.println("=============================");   
	System.out.println("1.계좌생성| 2.계좌목록 |3.예금|4.출금|5.종료");
	System.out.println("==============================");
	      int select = s.nextInt();
	      if(select==1) {
	    	  System.out.println("계좌생성");
	    	  System.out.println("-----------");
	    	  System.out.println("계좌번호를 입력하세요");
	    	    int acNumber= s.nextInt();
	    	    System.out.println("이름을 입력하세요");
	    	    String name= s.next();
	    	    System.out.println("초기입금액을 입력하세요");
	    	    int balance= s.nextInt();
	    	    
	    	    for(int i=0; i< accountnumber.size(); i++) {
	    	    	 accountnumber.add(acNumber);
	    	    	  	
	    	    }   for(int i=0; i< accountname.size(); i++) {
	    	    	 accountname.add(name);
	    	    	  	
	    	    }   for(int i=0; i< accountbalance.size(); i++) {
	    	    	 accountbalance.add(balance);
	    	    	  	      
	    	    }
	      if(select==2) {
	    	    System.out.println();
	      }
	      
	      
	      
	      }
   
   }
	
		

	}
	
	
	
}
