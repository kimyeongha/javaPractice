package chapter06_Class01;

import java.util.Scanner;

public class MyMathInstance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          //MyMath안에 있는 메소드는 static이 안보이므로 인스턴스 메소드 이다. 
		//MyMath클래스를 인스턴스생성후 참조변수를 통해서 메소드를 호출.
	   Scanner s = new Scanner(System.in);// new 가 필요한 인스턴스 메소드
	      s.nextInt(); //Scanner의 인스턴스 메소드		
		MyMath mm= new MyMath();
		mm.add(10, 20);// MyMath클래스의 add메소드 호출
		System.out.println(mm.add(10, 20));
	    mm.subtract(10, 20); //호출은 가능 한데 리턴이 없기때문에 출력은 여기서 말고 저기서 해야한다.
	    mm.mutiple();//받는쪽에서 매개변수가 안적혀 있으니 안받는다고 했잖아 
	    System.out.println(mm.mutiple());
	    mm.divide(); //저쪽편에서 결과를 출력하기로 하면 여기서 출력이 된다.
	    
	}

}
