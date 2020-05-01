package chapter05;

import java.util.Scanner;

public class Java_20200428_arrayEx06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner scan=new Scanner(System.in);
      int answer=0;
      int computer=0;
     int counter=0;
      while(true) {
    	  System.out.println("0과 100사이 숫자를 입력하십시오");
    	   answer=scan.nextInt();
    	   computer=(int)(Math.random()*100)+1;
    	   System.out.println("당신이 고른수는"+answer+"입니다"+"컴퓨터가 고른수는"+computer+"입니다");
    	     counter++;
      if(computer==answer) {
    	  System.out.println("시도한수는"+counter+"입니다");
    	  break;
      }
      
      }
	
	
	
	}

}
