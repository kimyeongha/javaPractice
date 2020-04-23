package chapter04;

public class Java_20200423_ex01 {

	public static void main(String[] args) {
		// 1.int형 변수x 가 10 보다 크고 20보다 작을때 true 인 조건식
		// int x = 0;
		// if (x > 10 && x < 20) {
		// System.out.println(true);
		// }
		// 2.char형 변수ch가 공백이나 탭이 아닐때 true인 조건식??????????????????????????????
		// 3.char형 변수ch가 'x'또는'X'일떄 true인 조건식
		// char ch=' ';
		// if(ch=='x'&& ch=='X') {
		// System.out.println("true");
		// }
		// 4.char형 변수 ch가 숫자 (0~9일때 true 인 조건식
		// char ch = ' ';
		// if (ch >= 0 && ch > 10) { // char형 변수 ch가 영문자 (대문자 또는 소문자 )일떄 true인 조건식
		// System.out.println(true);
		// }
		// 5. int 형 변수 year가 400으로 나눠 떨어지거나 또는 4로 나눠 떨어지고 100으로 나눠 떨어지지 않을떄 true 인 조건식
		// int year = 0;
		// if(year%400==0||year%4==0&& !(year%100==0)) {
		// System.out.println("true");
		// }

		// 6. bollean형 변수 powerOn가 false일때 true인 조건식????????????????????

		// 문자열 참조변수 str이 "yes"일떄 true인 조건식
		// String str=" ";
		// if (str=="yes") {
		// System.out.println(true);
		// }

		// 1부터 20까지의 정수중에서 2또는 3의 배수가 아닌 수의 총합을 구하시오
		// int sum1 = 0;

		// for (int i=0; i<=20;i++) {

		// if(i%2==0||i%3==0) {
		// continue;
		// }
		// sum1+=i;

		// }

		// System.out.println(sum1);
		//

		// 다음 문을 for 문에서 while 문으로 변경하시오
		// int i= 0;
		// int j = 0;
		// while(i<=10) {
		// while(j<=i) {
		// System.out.print("*");
		// System.out.println();
		// j++;
		// }
		// i++;
		// }

		// 두개의 주사위를 던졌을떄 , 눈의 합이 6이 되는 모든 경우의 수를 출력하는 프로그램을 작성하시오.
		//int i= 0; int j= 0; 
		
		  //  for(i=1; i<=6; i++) {
		    	    
		    //	for(j=1; j<=6; j++) {
		    	//	  int sum1 = i+j ;
		    		//if(!(sum1==6)) {
		    		//	continue;
		    	//	}
		    	//	System.out.println(i+"+"+j);
		    	//}
		   // }
		    	
		    		
		    	
		
		    	
		    
		// Math.random()을 이용해서 , 1부터 6까지 임의의 정수를 변수 value에 저장하는 코드를 작성하시오.
		    	// int num= (int)(Math.random()*6)+1;
		    	//  System.out.println(num);
		    			 
		// 방정식 2x+4y= 10 의 모든 해를 구하시오 (단 x와 y는 정수이고 각각 범위는 0<=x<=10, 0<=y<=10)이다 ->>실행결과
		 // x=1,y=2 x=3,y=1 x=5 y=0
		
		//for(int x= 0; x<=10; x++) {
	//		 for(int y=0; y<=10; y++) { 
				 
		//		int sum1 = (2*x)+(4*y);
			//	 if(!(sum1==10)) {
				//	 continue;
					 
			//	 }
		//	System.out.println("x="+x+"y="+y);
		//	 }
		// }
		
		
		
		
	}
}
