package chapter06_Class01;
//매개변수가 이는 생성자를 통해 초기화 작업;
public class Tv3 {

	//전원 
	boolean power;
	// 길이
	int width;

	// 높이
	int height;

	// 색상
	String color;

	// 볼륨
	int volume;

	// 채널
	int channel;
	Tv3(){
		//기본생성자 
	}
	Tv3(boolean p , int w, int h, String c, int v, int ch){
		power=p;
		width=w;
		height=h;
		color=c;
		channel=ch;
		
	}
}
