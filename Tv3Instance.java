package chapter06_Class01;
//Tv3 클래스에 있는 인스턴스 변수 초기화 하는 방법 2가지.
public class Tv3Instance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       /*
		//인스턴스 생성후 참조변수를 통한 초기화.
		 Tv3 tl= new Tv3();
		 tl.power=false;
		 tl.width=10;
		 tl.height=20;
		 tl.color="black";
		 tl.volume=20;
		 tl.channel=100;
		 
		 Tv3 ts= new Tv3();
		 ts.power= true;
		 ts.width=20;
		 ts.height=30;
		 ts.color="red";
		 ts.volume=30;
		 ts.channel=200;
*/
		 //생성자를 이용한 초기화
		 Tv3 tl=new Tv3(false,10,20,"black",20,100);
		 Tv3 ts= new Tv3(true,20,30,"green",30,200);
		 
	}
	

}
