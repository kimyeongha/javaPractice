package chapter05;
import java.util.Scanner;

public class Java_20200427_arrayex0411 {

	public static void main(String[] args) {

		int[][] arr = null;
		String[] gwa = null;
		Scanner s = new Scanner(System.in);

		System.out.print("학생 당 입력받을 과목 점수의 개수를 입력하세요 : ");
		int num = Integer.parseInt(s.nextLine());
		gwa = new String[num];

		for (int i = 0; i < num; i++) {
			System.out.print("과목명을 입력하세요 : ");
			gwa[i] = s.nextLine();
		}

		arr = new int[5][num];

		for (int i = 0; i < arr.length; i++) {

			for (int j = 0; j < gwa.length; j++) {
				while (true) {
					System.out.print((i + 1) + "번째 학생의 " + gwa[j] + " 점수를 입력하세요 : ");
					arr[i][j] = Integer.parseInt(s.nextLine());

					if ((arr[i][j] >= 0 && arr[i][j] <= 100))
						break;
					System.out.println("다시 입력하세요");
				}

			}
			System.out.println();
		}

		for (int i = 0; i < arr.length; i++) {
			float aver = 0;
			System.out.println((i + 1) + "번째 학생의 ");

			for (int j = 0; j < gwa.length; j++) {
				System.out.println(gwa[j] + " 과목의 점수는 : " + arr[i][j]);
				aver += arr[i][j];
			}
			System.out.printf("평균 점수는 %.3f입니다.\n", aver / gwa.length);
		}

	}
}