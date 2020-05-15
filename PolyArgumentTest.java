package chapter07;

public class PolyArgumentTest {

	public static void main(String[] args) {
		
		Buyer b= new Buyer();//new 키워드로 buyer 인스턴스의 주소가 생성되어 참조변수에 저장
       Computer c= new Computer();  //인스턴스생성을통해 참조변수를 만든것을 던져도 되고
		//b.buy(new Tv2());  //new 키워드로 Tv2 인스턴스의 주소가 생성되어 참조변수에 저장.
       //b.buy(c);
       //b.buy(new Refrigerator()); // 매개변수로 들어가도 되는 이유가 다형성과 관련 이있다. 지금 자식 클래스를 보내도 Product 타입이라는 조상 매개변수와 매칭이 가능 한 다형성을 가지고 있기 떄문에 가능 .!
        b.refund(c);
       b.summary();
      // System.out.println("현재 남은 돈은"+b.money+"입니다");
       //System.out.println("현재 남은 포인트는"+b.bounusPoint+"입니다");
	
       //뭐 부터 작성해야 할까 ? 고민을 할지도 ...
    // main 메소드부터 확인 
       //
                 int [ ]num= new int [5];
                  num[1]= 1;
                  num[2]= 2;
	}

}
