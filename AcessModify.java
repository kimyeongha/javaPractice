package chapter07;
//Private (같은 클래스 내에서만 가능)
public class AcessModify {
    
	public static void main(String[ ]args) {
    	Acess01 acess=new Acess01();
    	 System.out.println(acess.a); // default 는 다른 클래스여도 같은 패키지 내에서는 사용가능하니까 사용가능.
    	// System.out.println(acess.b);//private 는 동일 클래스 내에서만 사용가능하다. 
      
    	 System.out.println();
	}


}

class Acess01{
	
	 int  a = 200;
	private int b=300;
	void add() {
		b=500;//이건 가능 왜냐하면 같은 class 내 니까 !
	
	}
}