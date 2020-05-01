package chapter05;

import java.util.Scanner;
//거스름돈을 몇개의 동전으로 지불할수 있는지를 계산하는 문제이다. 변수 money 의 금액을 각각 지폐와 동전이 몇개가 필요한지 계산하여 출력하라 (단,가능한 한 적은 수의 지폐와 동전으로 거슬러 주어야한다.)
		//출력 금액 37210 만원권 3장 5천원구너 1장 천원권 2장 오백원숸 0개 백원권 2개 십원권 1개

public class Java_20200428_arrayEx03 {

	public static void main(String[] args) {
		System.out.println("금액을 입력하시오");                
		    int money = 0;	
		    Scanner scan= new Scanner(System.in);
		        money=scan.nextInt();
		    while(true) {
		    	 int man=money/10000;	     
		    	     int sen5    =   ( money%10000)/5000;
		    	     int sen  = money%10000%5000/1000;
		    	     int hend5=  money%10000%5000%1000/500;
		    	     int hend=  money%10000%5000%1000%500/100;
		    	     int fit=  money%10000%5000%1000%500%100/50;
		    	     int ten= money%10000%5000%1000%500%100%50/10;
		    	     
		    	 System.out.println("만원권은"+man+"장");
		    	 System.out.println("5천원권은"+sen5+"장");
		    	 System.out.println("천원권은"+sen+"장");
		    	 System.out.println("5백원권은"+hend5+"장");
		    	 System.out.println("1백원권은"+hend+"장");
		    	 System.out.println("50원권은"+fit+"장");
		    	 System.out.println("10원권은"+ten+"장");
		    	 break;
		    }
	
	}

}
