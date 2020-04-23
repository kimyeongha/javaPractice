package chapter04;

import java.util.Scanner;

/*단순if*/
public class Java_20200420_If {
	public static void main(String[] args) {

		int x = 0;
        System.out.println("0과 1 두수중 하나를 입력하세요.");
        Scanner scan = new Scanner(System.in);     //여기서 Scanner은 prompt 같이 입력 하게 해주는 Class 의 참조변수  scan 은 참조 변수의 이름이다 임의 변경 가능!
              x=scan.nextInt();   //내가 입력한 숫자타입이 정수 타입이다. 
		System.out.println("x=" + x + "일떄 참인것은");
		if (x == 0) {
			System.out.println("x==0");

		}
		if (x != 0) {
			System.out.println("x==0");

		}

		if (!(x == 0)) {
			System.out.println("!(x==0)");
		}
		if (!(x != 0)) {
			System.out.println("!(x!=0)");
		}

		x = 1;
		System.out.println("x" + x + "일떄,참인것은");

		System.out.println("x=" + x + "일떄 참인것은");
		if (x == 0) {
			System.out.println("x==0");

		}
		if (x != 0) {
			System.out.println("x==0");

		}

		if (!(x == 0)) {
			System.out.println("!(x==0)");
		}
		if (!(x != 0)) {
			System.out.println("!(x!=0)");
		}

	}
}
