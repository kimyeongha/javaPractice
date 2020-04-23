package chapter02;
//변수 상수 리터럴
public class Java_20200420_Variable_constant_literal {

	public static void main(String[] args) {
		 //변수 선언   (변하는 수 , 하나의 값을 저장하기 위한 공간. 여러번 값을 변경할수 있다 . 단 마지막 째 의 값을 저장한다.)
		int a = 11;     
        // 상수선언
		final int B =10;  //final 을 선언해서 상수화 시킴. 이름은 대문자로 하면 나중에 콜 할떄도 어림풋이 알수 있다.  값을 단 한번만 저장할수 있는 공간
	   // 10 과 같이 그 자체가 값을 가지고 있는것을 literal 이라고 한다. 
	 System.out.println(a);
	 System.out.println(B);
	 
	 a= 20;
	 //B=200; 상수는 숫자가 변할수 없기때문에 안된다.
	 System.out.println(a);
	  
	
	}

}
