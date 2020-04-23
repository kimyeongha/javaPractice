package chapter02;
// 문자형과 문자열의 비교
public class Java_20200420_String {

	public static void main(String[] args) {
		  //  char ch='A';  //문자형(char)
          // char ch='ab'; // 두글자 이므로 에러가 뜸 문자열 String 을 써야함
		String s1="ab";
		//char ch2= ''; // 공백이 없어서 에러가뜸 
        		   char ch2= ' ' ;
        		 String s2= " ";
        		 
        		 //숫자 +숫자 ====>숫자 
        		 // 문자열+ 모든 데이터 타입 =====> 문자열 결합
        		 // 모든데이터 타입+ 문자열 ======> 문자열 결합
        		 System.out.println(7+7); //14
        		 System.out.println(7+"7"); //Number+ String 
        		 System.out.println("7"+7); // String+ Number
        		 System.out.println("7"+"7"); // String + String   하나라도 문자열일 경우 +는 연산자가 아니라 결합자
	}

}
