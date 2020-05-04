package chapter06_Class01;

public class CallstackTest {
              //JVM에 의해서 main 메소드가 호출됨으로써 프로그램 실행.
	         //이때 호출스택에는 main메소드를 위한 메모리 공간이 할당되고, main메소드의 코드가 수행되기 시작.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         firstMethod(); // new 선언없이도... static 인 클래스 매소드는 가능합니다. 인스턴트 매서드는 new 로 인스턴드 생성을 해야함.
         //메인메소드 끝
	}
    static void firstMethod(){
    	secondMethod();
    };//firstMethod
    static void secondMethod() {
    	System.out.println("secondMethod()");
    };//secondMethod
    
}
//    0>main> main firstMethod > main firstMethod secondMethod >  main firstMethod secondMethod  println > main firstMethod secondMethod  > main firstMethod >main  >0