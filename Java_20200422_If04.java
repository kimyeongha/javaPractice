package chapter04;
/*중첩 if*/
public class Java_20200422_If04 {

	public static void main(String[] args) {
	
		//그렇지 않으면 C학점
		int score = 82; //점수를 저장하기 위한 변수 (정수)
		String grade=" "  ;  // 등급을 저장하기 위한 변수
	
		//점수가 90점이상이면 A학점  {98점이상이면A+ 94점 이상이면 A 94미만은 A- } 
	
		if(score>=90) {
			   grade ="A";
			   if(score>=98) {
				   grade = grade+  '+' ;// = grade+= '+'
			   }else if(score<94) {
				   grade= grade+ '-'; // = grade+= '-'
			   }
			 
		}
		//점수가 80점이상이면 B학점   {88점이상이면B+ 84점 이상이면 B 84미만은 B- } 
		else if(score>=80) {
			 grade="B";
			 if(score>88) {
				 grade+='+' ;
			 }else if(score<84) {
				 grade+='-' ;
			 }
			 }
		//그 이하는 C학점
		else {
			grade="C";
			
		}
		System.out.println(grade);
		
	
	}
}
