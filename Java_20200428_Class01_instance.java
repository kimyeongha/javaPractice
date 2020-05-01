package chapter06_Class01;
//tv라는 클래스를 만들었고 그것으로 부터 인스턴스화 해보자.
public class Java_20200428_Class01_instance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//클래스명 참조변수명;
		//참조변수명 = new 클래스명
		//Java_20200428_Class01 t; //Tv객체를 다루기 위한 참조변수 선언;
		//t= new Java_20200428_Class01( );  //객체 생성후. 생성된 객체의 주소를 참조변수에 저장 
		Java_20200428_Class01 ts= new Java_20200428_Class01();    //Java_20200428_Class01<<이게 인스턴스  (하나의 인스턴스가 여러개의 참조변수를 가지는 것은 가능하지만..여러가지의 인스턴스가 한개의 참조변수를 가르키는 경우는 불가능하다)
		Java_20200428_Class01 tl= new Java_20200428_Class01();
		//삼성(Tv색은 검정색으로 , 길이는 10cm , 높이는 20)
		ts=tl;
		ts.color="black";
		ts.width=10;
		ts.height=20;
		ts.channel=7;
		ts.ChannelDown();
		System.out.println("삼성tv는색은"+ts.color+"이고"+"넓이는"+ts.width+"이다");
		//LG (Tv색은 회색, 길이는 15, 높이는 25)
		tl.color="white";
		tl.width=15;
		tl.height=25;	
		tl.channel=11;
		tl.channelUp();
		System.out.println("LGtv는색은"+tl.color+"이고"+"넓이는"+tl.width+"이다");
		System.out.println(tl);
		System.out.println(ts);
		
		

	}

}
