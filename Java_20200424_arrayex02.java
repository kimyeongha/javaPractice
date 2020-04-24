package chapter05;

import java.util.Scanner;

public class Java_20200424_arrayex02 {
	 public static void main(String[ ] args ) {
		    // 키보드로 값을 5번 입력받아 . 입력받은 정수의 합계와, 평균을 구하시오.
		 System.out.println("값을 입력해라");
		 Scanner scan= new Scanner(System.in);
		         int [ ]score= new int[ 5];
		         int sum= 0;
		         for(int i=0; i<score.length;i++) { 
		         score[i]=scan.nextInt();
		         sum = sum+score[i];
		         
		          
	 
		         }
	        double avg= (double)sum/score.length;
	   System.out.println("합계:"+sum+"평균"+avg);
	 
	 }
	 

}
