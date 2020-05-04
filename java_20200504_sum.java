package chapter06_Class01;

import java.util.Scanner;

public class java_20200504_sum {

	static int sum1(int number1, int number2) {
		int sum = 0;
		for (int i = number2; i <= number1; i++) {
			sum += i;
		}int result= sum;
		return result;
	}

	static int sum2(int number1, int number2) {
		int sum = 0;
		for (int i = number1; i <= number2; i++) {
			sum += i;
		}int result=sum;
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	System.out.println("두 숫자를 입력하라");
		Scanner scan = new Scanner(System.in);
		int number1 = scan.nextInt();
		int number2 = scan.nextInt();

		if (number1 - number2 > 0) {
			java_20200504_sum.sum1(number1, number2);
			System.out.println(java_20200504_sum.sum1(number1, number2));
		} else if (number1 - number2 < 0) {
		
			System.out.println(java_20200504_sum.sum2(number1, number2));
			
		}
            
	}

}
