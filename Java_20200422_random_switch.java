package chapter04;

import java.util.Scanner;

public class Java_20200422_random_switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.out.println("가위,바위,보 중 하나를 입력하시오");
        Scanner scan = new Scanner(System.in);
         int user = scan.nextInt();
      /*   if(user== "가위") {
        	       user.equals(1);
         }else if(user=="바위") {
        	 user.equals(2);
         }else if(user=="보") {
        	 user.equals(3);
         }*/
           
       int com = (int)(Math.random()*3)+1;
         switch(user-com) {
         case 0: System.out.println("무승부입니다"); 
           break;
         case 1: System.out.println("당신이 이겼습니다");
          break;
         case 2: System.out.println("com이 이겼습니다");
         break;
         case -1:System.out.println("com이 이겼습니다.");
         break;
         case -2 : System.out.println("당신이 이겼습니다.");
         break;
         }
       
         
	
	
	}

}
