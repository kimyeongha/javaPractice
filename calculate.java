package chapter06_Class01;

public class calculate {
	static void getadd(int number1, String op, int number2) {
		
			int result = 0;
			result = number1 + number2;
			System.out.println("답은"+result+"입니다");
		
	}

	static void getsub(int number1, String op, int number2) {
		
			int result = 0;
			result = number1 - number2;
			System.out.println("답은"+result+"입니다");

	}

static	void getmul(int number1, String op, int number2) {
		
			int result = 0;
			result = number1 * number2;
			System.out.println("답은"+result+"입니다");
		

	}
static	void getdiv(double number1, String op, double number2) {
		
			double result = 0;
			result = number1 / number2;

			System.out.println("답은"+result+"입니다");

	}
}
