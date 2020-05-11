package chapter06_Class01;
//나는 현재 Tv Class와 VCR둘다 상속받고 싶다 하지만 Class는 한개 밖에 되지 않는다.
public class TVCR extends TvClass {
      
      public static void main(String[] args) {
    	  VCR v = new VCR();
    	    v.play();
            v.stop();
            
      } //그래서 TvClass에서 하나 상속 받고 나머지는 포함 관계로 사용한다.
    
      
        
        
}
