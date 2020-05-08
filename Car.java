package chapter06_Class01;

//this() -같은 클래스에서 다른 생성자를 호출할때 사용.
public class Car {
	String color; // 차량색
	String gearType; // 기어 타입
	int door; // 문 개수

	Car() {
		this("whie", "auto", 4);
	}// 기본생성자

	Car(String iro) {
		this(iro, "auto", 7);
	}// 매개변수가 1개인 생성자

	Car(String Color, String gearType, int Door) {

		this.color = Color;
		this.gearType = gearType;
		this.door = Door;
	}
}
