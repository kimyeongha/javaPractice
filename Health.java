package chapter06_Class01;

import java.util.Scanner;

public class Health {
  
	char gender;
  double tall;
  double weight;
   Health(){
	   
   }
   void input() {
	   Scanner s = new Scanner(System.in);
	   System.out.println("키를 입력하세요");
	   this.tall=s.nextDouble();
	   System.out.println("성별을 입력하세요");
	   this.gender=s.next().charAt(0);
	   System.out.println("몸무게를 입력하세요");
	   this.weight=s.nextDouble();
   }
   void output() {
	   System.out.println("당신의 키는"+ tall);
	   System.out.println("당신의 성별은"+ gender);
	   System.out.println("당신의 몸무게는"+weight);
	   
	   
	   
   }
}
