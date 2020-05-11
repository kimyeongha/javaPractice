package chapter06_Class01;

public class DrawShape {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           Circle c1= new Circle();
           Circle c2 = new Circle(new Point(150,150),50);
           Point [] p= {new Point(100,100), new Point(140,50),new Point(200,100)
	};
Triangle t1 = new Triangle(p);
t1.draw();
c2.draw();
}
}
