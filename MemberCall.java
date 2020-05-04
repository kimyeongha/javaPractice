package chapter06_Class01;
//클래스 맴버(클래스변수와 클래스매서드)와 인스턴스맴버(인스턴스변수와 인스턴스메서드)간의 참조와 호출
public class MemberCall {
    //인스턴스 변수
	int iv=10;
	//클래스 변수
	static int cv=20;
	//인스턴스변수 = 클래스변수  (가능)
	int iv2=cv; 
  //클래스변수 = 인스턴스 변수 (불가능)
	//static cv2=iv;
	static int cv2= new MemberCall().iv; //이렇게 하면 가능
	static void staticMethod1() {
		System.out.println(cv);
		System.out.println(cv2);
		//System.out.println(iv);//클래스메소드 안에 인스턴스 변수사용불가능
		MemberCall c= new MemberCall();//인스턴스 생성후는 가능!
   System.out.println(c.iv);
	}
	void instanceMethod1() {  //인스턴스메서드
		System.out.println(cv);//인스턴스 메서드는 클래스 변수든 인스턴스 변수든 상관없이 다 가능
	   System.out.println(iv);
	}
	static void staticMethod2() {
		 staticMethod1();
		//instanceMethod1();//불가능
		 MemberCall c= new MemberCall();
		 c.instanceMethod1(); //가능
	}
	
}
