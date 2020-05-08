package chapter06_Class01;

public class Car0508Test {

	public static void main(String[] args) {
                Car0508 c1= new Car0508();
                System.out.println("c의 color="+c1.Color+"gearType은"+c1.geartype+"door은"+c1.door+"이다");
                 Car0508 c2= new Car0508(c1);
                 System.out.println("c의 color="+c2.Color+"gearType은"+c2.geartype+"door은"+c2.door+"이다");
	}

}
