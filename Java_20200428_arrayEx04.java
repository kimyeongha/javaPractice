package chapter05;

import java.util.Scanner;

public class Java_20200428_arrayEx04 {

	public static void main(String[] args) {
		// 약수를 모두 찾는 수학문제를 풀다 지친 그린이는 컴퓨터의 도움을 받아 문제를 풀어보기로 하였다. 
		//입력 24 > 출력 {1,2,3,4,6,9,12,24} 8개 입니다.
		   int sum=0;
		while(true) {
		System.out.println("구하고 싶은 숫자를 입력하시오");
		Scanner scan= new Scanner(System.in);
		
		           int num=scan.nextInt();
		           System.out.print("{");
		           for(int i=1; i<num; i++){


		        	   if(num%i==0) {
		        		   System.out.print(i+",");
		        		   sum++;
		        	   }


		           }
		    System.out.print(num);
		    System.out.println("}");
		    System.out.println("개수는"+(sum+1));
		}
		
	}
	

}
