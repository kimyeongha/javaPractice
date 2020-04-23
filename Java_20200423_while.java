package chapter04;

///import java.util.Scanner;

public class Java_20200423_while {

	public static void main(String[] ards) {

		/*
		 * System.out.println("원하는 구구단을 쳐보시오"); int i = 1; int j = 2; Scanner scan= new
		 * Scanner(System.in); int dan= scan.nextInt();
		 * System.out.println(dan+"*"+i+"="+dan*i);
		 */
		int i = 2;
		int j = 1;

		
		while (i < 10) {
			
			while (j < 10) {
				System.out.println(i + "*" + j + "=" + i * j);
				j++;
			}
			i++;
		}

	}
}
