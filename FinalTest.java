package chapter07;

final class FinalTest {     //변경될수 없는 클래스 - 확장 할수 없는 클래스가 된다. 그래서 이 클래스는 조상 클래스가 될수가 업다.
      int num= 10;
      final int b= 20;   // 이값은 상수화 된 변수이다. 값이 변화 할수가 없다.
      
      final void add() {  //오버라이딩이 안되는 매서드
    	  num= 30;
    	  //b=50; ;b 는 final 을 통해 상수화 되어 있기 때문에 변경 불가능 하다.
    	  final int result =num+b;  //result 는 상수화;
    	  System.out.println(result);
      }
       
}
