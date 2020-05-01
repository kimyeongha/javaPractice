package chapter06_Class01;
/*리턴타입 메소드명(타입 변수명, 타입변수명){ 메서드 호출시 수행될 코드}*/
/*메소드 선언- 클래스 안에서만 가능.*/
public class MyMath {
	// 메서드
	// 더하기 기능(add)을 하는 메서드(정수두수를 입력받아 :매개변수가 2개 호출하는 곳으로 값을 전달:return 이있다.)
	           int add(int x, int y) {
	        	   int result = x+y;
	        	   return result;
	           }

	// 빼기 기능(subtract)을 하는 메서드(두수를 입력받아 :매개변수를 2개 받아 호출하는 곳으로 전달 x: return 이 없다)
	           void subtract(int x, int y) {
	        	int  result= x-y;
	        	            return;//이것도 리턴이 없다 라는뜻.
	           }
	// 곱하기 기능(multiple)을 하는 메서드(두수를 입력받지 않고:매개변수가 없고, 호출하는 곳으로 값 전달 :0 return 은 있다)
	          double mutiple() {
	        	   int x=10;
	        	  int y=20;
	        	  int result=0;
	        	  result=x*y;
	        	  return result;
	          }
	// 나누기 기능(divide)을 하는 메서드(두수를 입력받지 않고:매겨변수가 없고, 호출하는 곳으로 값도 전달 하지 않겠다 . return 도 없다)
                   void divide() {
                	   double x=10.0;
                	   double y=20.0;
                	   double result=0.0;
                	   result=x/y;
                	   System.out.println(result);
                   }



}
