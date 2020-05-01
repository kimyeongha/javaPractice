package chapter05;

import java.util.Scanner;

public class Java_20200427_array01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("국어 영어 수학 점수를 입력하시오");
		double totalsum = 0;
		double totalavg = 0;

		int[][] score = new int[5][3] ;
		
   for(int i =0; i<5; i++){
       for(int j=0; j<2;j++){ 
              System.out.println((i+1)+"번쨰학생의 점수를 입력하세요.");
              score[i][j]=scan.nextInt();
  
  }
  }

		System.out.println("순번    국어    영어    수학   총점   평균");

		for (int i = 0; i < 5; i++) {
			float sum = 0;
			System.out.print(i + 1);	
			for (int j = 0; j < 3; j++) {
				sum = sum + score[i][j];
				System.out.print("  " + score[i][j] + "  ");

			}
			System.out.print(sum + "   " + sum / 3);

			System.out.println();
			totalsum = totalsum + sum;
			totalavg = totalavg + sum / 3;

		}
		System.out.println("전체합" + totalsum);
		System.out.println("전체평균" + totalavg);

		int sumKOR = 0;
		for (int k = 0; k < 5; k++) {

			sumKOR = sumKOR + score[k][0]; // 국어총점

		}
		System.out.println("국어총점=" + sumKOR);
		int sumENG = 0;
		for (int t = 0; t < 5; t++) {

			sumENG = sumENG + score[t][1]; // 영어 총점
			System.out.println("영어총점=" + sumENG);
		}
		int sumMATH = 0;
		for (int q = 0; q < 5; q++) {
			;
			sumMATH = sumMATH + score[q][2]; // 수학총점
		}
		System.out.println("수학총점=" + sumMATH);
		int maxkor = 0;
		for (int ko = 0; ko < score.length; ko++) {
			if (maxkor < score[ko][0]) {
				maxkor = score[ko][0]; // 국어 최대값

			}
		}

	}
}
///