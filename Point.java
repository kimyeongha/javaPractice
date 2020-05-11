package chapter06_Class01;

public class Point {
    int x;  //인스턴스 변수 
    int y;  //인스턴스 변수   초기화도 하지 않음.
    Point(){   //생성자 , 매개변수가 없는 생성자  인스턴스 변수 초기화 하지 않았으니까 생성자로 초기화를 시켜줌 -기본생성자
    	  this(0,0);  //this() 다른 생성자를 호출 할때 사용
    }
   Point(int x, int y){ //생성자 (매개변수가 2개인 생성자)
	     this.x=x;  //this. 매개변수 이름과 인스턴스 변수명이 같을 떄 구분하기 위한 참조변수 this
	     this.y=y;
	     
   }
   String getXY() {  //메소드 (리턴타입 String , 매개변수는 없다)
	   return "("+x+","+y+")";
   }
}
