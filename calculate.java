package chapter06_Class01;

public class calculate {
	void getadd(int number1, String op, int number2) {
		if (op.equals("+")) {
			int result = 0;
			result = number1 + number2;

		}
	}

	void getsub(int number1, String op, int number2) {
		if (op.equals("-")) {
			int result = 0;
			result = number1 - number2;

		}
	}

	void getmul(int number1, String op, int number2) {
		if (op.equals("*")) {
			int result = 0;
			result = number1 * number2;

		}

	}
	void getdiv(int number1, String op, int number2) {
		if (op.equals("/")) {
			int result = 0;
			result = number1 / number2;

		}

	}
}
