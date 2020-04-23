package chapter04;
/*if ~else if ~ else*/
public class Java_20200420_If03 {

	public static void main(String[] args) {
	
		/* 단순 if else if else
		int num = 10;
		
		
		if(num>0) {
			System.out.println("양수입니다.");
		}
		else if(num<0) {
			System.out.println("음수입니다.");
		}else{
			System.out.println("0입니다.");
		}
		
		
*/
		//점수가 90정이상이면 A등급  점수가 80점이상이고, 90점 미만이면(and조건이됨) B등급 점수가 70점이상이고 80미만이면(and 조건이됨) C등급 그이하는 F등급
		 int score = 82;
		 if(score>=90) {
			 System.out.println("A등급입니다.");
		 }
		 else if(score<90 && score>=80) {
		 System.out.println("B등급입니다.");
		 }
		 else if(score<80 && score>=70) {
			 System.out.println("C등급입니다.");
			 }
		 else {
			 System.out.println("F등급입니다.");
		 }
		 
			 
		
	}

}
