package chapter06_Class01;

public class Circle extends shape{
    Point center;  //인스턴스 변수 타입이  Point 클래스  (포함관계)
    int r;    //인스턴스 변수 
    Circle(){  //생성자 기본생성자
    	this(new Point (0,0),100 );
    }

    Circle(Point center,int r){
    	this.center=center;
    	this.r=r;
    
    
    }
    
    void draw() {
    	
    }
}