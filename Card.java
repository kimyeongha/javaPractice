package chapter06_Class01;

//전역변수중 Class variable instance variable
public class Card {
	// 공통된 값(클래스 변수,static변수)
	// 카드의 넓이
	  static int width=100;
	// 카드의 높이
	static int height=250;

	// 다른 값(인스턴스 변수)
	// 모양
	String shape; //(하트,스페이드, 다이아,클로바)
	// 숫자
	String number; //1~10 J,Q,K
	// 색깔
	String color;//red,black
}
