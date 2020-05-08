package chapter06_Class01;

public class CarTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Car c1= new Car("green");
      System.out.println(c1.color);
      System.out.println(c1.gearType);
      System.out.println(c1.door);
	
	 Car c2= new Car();
	 System.out.println(c2.color);
     System.out.println(c2.gearType);
     System.out.println(c2.door);

	Car c3 = new Car("skyblue","manual",2);
	System.out.println(c3.color);
    System.out.println(c3.gearType);
    System.out.println(c3.door);
	
	}
}
