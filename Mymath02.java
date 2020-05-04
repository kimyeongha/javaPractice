package chapter06_Class01;

public class Mymath02 {
	long a=20L;
	 long b=10L;  //클래스 안에 했으니까 클래스 변수이고. long 앞에 아무것도 없으니 인스턴스 변수

	long add() {
		return a + b;

	}

	long substract() {
		return a - b;
	}
	long multiply() {
		return a*b;
		
	}
	long divide() {
		return a/b;
	}
	////여기까진 인스턴트 메소드
	static long add(long a, long b) {
		return a + b;

	}

	static long substract(long a,long b) {
		return a - b;
	}
	static long multiply(long a, long b) {
		return a*b;
		
	}
	static double divide(double a, double b) {
		return a/b;
	}
}
