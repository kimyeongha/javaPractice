package chapter06_Class01;
//클래스는 어떤구조로 생성하는건가?
public class Java_20200428_Class01 {// 클래스 이름이 tv라고 생각하고
	// 속성(변수)
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
  //기능(메서드)
	//전원 키고 끄기
    void power() {
    	 power=!power;
    }
    //볼륨 업
void volumeUp() {
	 volume++;
}
//볼륨 다운
void volumeDown() {
	volume--;
}
//채널업
void channelUp() {
	channel++;
}
//채널 다운
void ChannelDown() {
	channel--;
}





}
