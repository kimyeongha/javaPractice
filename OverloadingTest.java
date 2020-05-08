package chapter06_Class01;

public class OverloadingTest {

	public static void main(String[] args) {
       MyMath3 mm3 = new MyMath3();
            
             System.out.println(mm3.addii(1, 1));
             System.out.println(mm3.addif(1, 1.5f));
             System.out.println(mm3.addfi(1.5f, 1));
             System.out.println(mm3.addff(1.5f,1.5f));
             System.out.println("mm3.add(3,.1.5");
             mm3.add(3,1.5);
             

	}

}
