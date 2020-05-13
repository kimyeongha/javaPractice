package chapter07;

public class Card {
             final int NUMBER; //상수지만 선언과 함께
             final String KIND;//생성자에서 단 한번만 초기화 작업 할수 있다.
             static int width=50;
             static int height=100;
             Card(int NUMBER, String KIND){
            	   this.NUMBER=NUMBER;
            	   this.KIND=KIND;
             }
             Card(){
            	 this(1,"Heart");
            	
             }
             public String toString() {
            	 return ""+KIND+"  "+NUMBER;//모든 클래스는 object 클래스를 상속한다. 자동으로 이것은 toString() 주소를 아려주는 매소드에 오버라이딩을 통해 내용을 수정하였다.
             }
             
}
