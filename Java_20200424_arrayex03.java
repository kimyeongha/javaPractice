package chapter05;

import java.util.Scanner;

public class Java_20200424_arrayex03 {

	public static void main(String[] args) {
		// while 문과 Scanner를 이용해서 키보드로부터 입력된 데이터로 예금 출금 조회 종료 기능을 제동하는 코드를 작성하자
		Scanner scan = new Scanner(System.in);

		int deposit = 0;
		int withdraw = 0;
		int balance = 0;
	
		 while (true) {
			

			System.out.println("원하시는 숫자를 입력하세요"
			
					+ " 1.예금 | 2. 출금| 3. 조회 |4.종료"
				);
			int selected = scan.nextInt();
			if (selected == 1) {
				System.out.println("예금액을 입력하세요");
				 deposit=scan.nextInt();
				 balance=balance+deposit;
			

			}
			else if (selected == 2) {
				System.out.println("출금액을 입력하세요");
				withdraw=scan.nextInt();
				balance= balance-withdraw;
				
			}
			else if (selected == 3) {
				
				System.out.println("잔고는" + balance + "원입니다");
	

			}
			else if  (selected == 4) {
				System.out.println("안녕히가십시오.");
				break ;
			}else {
				System.out.println("1,2,3,4중입력하세요");
			}

		}
	}

	private static void nextInt() {
		// TODO Auto-generated method stub
		
	}

}
