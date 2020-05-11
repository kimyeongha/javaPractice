package chapter06_Class01;

public class TvClass {
    //속성들~       
	//전원상태   
	boolean power;
	// 채널              
	int channel;
	//기능들~~
	// 전원 On/Off 
	void power() {
		power = !power;
	}
	void channelUp() {
		channel++;
	}
	void channelDown() {
		--channel;
	}
	//채널 Up/Down
	
}
