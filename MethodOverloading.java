package chapter06_Class01;

public class MethodOverloading {
  //overloading 의 조건 매개변수의 개수가 다르거나, 매개변수의 타입이 다르거나.
	public static void main(String[] args) {
	System.out.println();  //전형적인 overloading 매개변수가 없다
	System.out.println("1"); //매개변수 타입이 문자열인것
	System.out.println('1');  //매개변수의 타입이 문자 인것
	System.out.println(1); //매개변수의 타입이 정수인것
	System.out.println(1.5); //매개변수가 실수 인것 
	System.out.println(true); //매개변수가 불리언 타입인것

	

	}

}
