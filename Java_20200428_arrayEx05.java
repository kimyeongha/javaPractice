package chapter05;

import java.util.Scanner;

public class Java_20200428_arrayEx05 {

	public static void main(String[] args) {
		// 홀수와 짝수의 개수를 구하는 프로그램을 구하여라
		Scanner scan = new Scanner(System.in);
		int[] number = new int[] { 12, 16, 22, 24, 29 };
		int oddsum = 0;
		int evensum = 0;
		for (int i = 0; i < 5; i++) {

			if (number[i] % 2 == 0) {
				evensum++;
			} else if (number[i] % 2 == 1) {
				oddsum++;
			}
	
		}
		
		System.out.println("홀수 개수는"+oddsum+"짝수개수는"+evensum);
		}

}
