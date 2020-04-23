package chapter04;

import java.util.Scanner;

public class Java_20200422_ex05 {
       //점수를 입력받아 아래 조건에 해당되는 학점을 출력하고 학점이 A,B인 학생에게는 참 잘했습니다 C,D인학생에게는 좀더 노력하세요 F인 학생에게는 다음 학기에 다시 수강하세요 를 출력하는 프로그램을 작성하시오
     //점수 90 이상 A  ,80이상 B, 70이상 C  60이상 D 그렇지 않으면 F
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("당신의 점수를 입력하세요");
		Scanner scan= new Scanner(System.in);
		 int score = scan.nextInt();
		  String grade= " ";
		  if(score>=90) {
			   grade ="A";
			   System.out.println(grade+"등급 이시네요 참잘했습니다 ");
		  } else if (score>=80) {
			  grade="B";
			  System.out.println(grade+"등급 이시네요 참잘했습니다.");
		  }else if(score>=70) {
			  grade="C";
			  System.out.println(grade+"등급 이시네요 좀더 노력하세요");
		  }else if(score>=60) {
			  grade="D";
			  System.out.println(grade+"등급 이시네요 좀더 노력하세요");
		  }else {
			  grade="F";
			  System.out.println(grade+"등급 이시네요 재수강해라");
					  
		  }
		  // swtich(grade)
		
		
		
  
	}

}
