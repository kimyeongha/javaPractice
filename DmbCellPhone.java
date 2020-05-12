package chapter06_Class01;

public class DmbCellPhone extends CellPhone {
      
	DmbCellPhone(String model, String color, int channel){
        super(model,color); // 내가 이걸 몰랏다.
        this.channel=channel;
		
}
 

	
	
	
	
	int channel;
        
      int channelUp() {
    	     return channel++;
      }
      
      String DmbOff() {
    	  return "Dmb방송을 종료합니다";
      }
      String DmbOn() {
    	  return"채널"+channel +"번"+"Dmb방송을 시작합니다";
      }
      String changeChannel(int channel) {
    	  return "채널"+channel+"번으로 바꿉니다";
      }
  
  


}
