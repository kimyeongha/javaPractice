package chapter04;

import java.util.Scanner;

public class Java_20200422_ex01 {   
	public static void main(String[] args) {
		int nember = 0;
		 System.out.println("숫자 하나를 입력해보세요");
		     Scanner scan = new Scanner(System.in);
		     nember=scan.nextInt();
		     if(nember>0) {
		    	 System.out.println("양수입니다.");
		     }else if( nember==0) {
		    	 System.out.println("0입니다");
		    	 
		     }else {
		    	 System.out.println("음수입니다.");
		     }
		     

	}

}
