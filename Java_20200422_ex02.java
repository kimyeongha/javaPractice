package chapter04;

import java.util.Scanner;

public class Java_20200422_ex02 {

	public static void main(String[] args) {
	     
		int score =  0;
	    String grade=" ";
		System.out.println("당신의 점수를 입력하시오");
		Scanner scan= new Scanner(System.in);
		  score=scan.nextInt();
		  if(score>=90) {
			    grade="A";
			    if(score>=98) {
			    	grade+='+';
			    }else if(score<94) {
			    	grade+='-';
			    	
			    }
		  }
		  if(score>=80) {
			  grade="B";
			  if(score>=88) {
				  grade+='+';
				  
			  }else if(score<84) {
				  grade+='-';
			  }
		  }else {
			  grade="C";
			  
		  }
		  
		
	System.out.println("당신의 등급은"+grade );

	}

}
