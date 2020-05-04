package chapter06_Class01;

public class MymathInstance02 {
//Mymath2클래스로 인스턴스메서드와 클래스 메서드 비교
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         //인스턴스 메서드 호출시 인스턴스 생성후
		Mymath02 mm2=new Mymath02();  //mm2 는 Mymath2의 참조변수명으로 주소를 저장하고 있다.
		//참조변수명 인스턴스명으로 호출
		mm2.add();
		mm2.a=200l;
		mm2.b=40L;
		System.out.println(mm2.add());
		System.out.println(mm2.substract());
		System.out.println(mm2.multiply());
		System.out.println(mm2.divide());
		
		//클래스 메소드 호출 인스턴스생성 안해도됨.;
		//클래스명.클래스메스드명으로 호출;
	    System.out.println(Mymath02.add(200L, 100L));
	    System.out.println(Mymath02.substract(200L, 100L));
	    System.out.println(Mymath02.multiply(200L, 100L));
	    System.out.println(Mymath02.divide(200.0, 100.0));
	    
	   
	   
		
		
	}

}
