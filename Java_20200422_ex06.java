package chapter04;

import java.util.Scanner;

public class Java_20200422_ex06 {
   // 정수 2개와 사칙연산 (+.-*./) 가 각각 공백을 사이에 두고 주어지는 경우, 해당 연산의 결과를 출력하는 프로그램을 작성해보자  
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner scan = new Scanner(System.in);
           int FirstNumber= scan.nextInt();
                 char op = scan.next().charAt(0) ; //nextLine 은 공백이 아니라 선 이 넘어갔을떄 엔터에 반응한다 . 그래서 *7 눌렀을때 답이 나오는게 아니라 그걸로 연산은로 인식 한다.
                 int SecondNumber = scan.nextInt();
                System.out.println(FirstNumber);
                 System.out.println(op);
                 System.out.println(SecondNumber);
                 
                 
                 if(op=='+') {   //String 은 == 보다 .equals가 낫다
                	System.out.println("두수의 합은="+(FirstNumber+SecondNumber));
                }else if(op=='-') {
                	System.out.println("두수의 차="+(FirstNumber-SecondNumber));
                }else if(op=='*') {
                	System.out.println("두수의 곱은="+(FirstNumber*SecondNumber));
                }else if(op=='/') {
                	System.out.println("두수의 나눈값은="+(FirstNumber/SecondNumber));
                }



	
	
	
	}
	

}
