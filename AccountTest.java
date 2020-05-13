package chapter07;

import java.util.Scanner;

public class AccountTest extends Account {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Account ac= new Account();
		
      Scanner s= new Scanner(System.in);
 
      
      while(true) {
    	 	int deposit=ac.getDeposit();
    		int withdraw=ac.getWithdraw();
    		int balance= ac.getBalance();
    	      
    	  
    	  
      System.out.println("======영하은행=====");
	 System.out.println("1.입금.2.출금.3.잔고확인");
		  int select=s.nextInt();
		  if(select==1) {
			    System.out.println("입금하고 싶은 금액을 입력하세요");
			                   int result1= s.nextInt();
			                   ac.setDeposit(result1);
			  
		  }else if(select==2) {
			  System.out.println("출금하고 싶은 금액을 입력하세요");
              int result2= s.nextInt();
              ac.setWithdraw(result2);
		  }else if(select==3) {
			  
			  System.out.println("잔액은"+balance);
		  }
	}
	}
	}

