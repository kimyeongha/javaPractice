package chapter06_Class01;

public class Triangle  extends shape {
   Point [ ] p;   //객체배열 Point 라는 클래스를 배열로 만든것
   Triangle(Point [ ] p){ //생성자(매개변수 한개인 생성자)
	   this.p= p;
	   
   }
   Triangle(Point p1,Point p2, Point p3){ //생성자 (매개변수가 3개인 생성자)
	   p= new Point[] {p1,p2,p3};   //Point p= new Point[] {p1,p2,p3};
   
  
   }
   void draw() {   //메소드 오버 라이딩 부모클래스에 있는 메소드를 변경하는 것
	   System.out.println("");
   }
}
