package chapter06_Class01;

public class SubHealth extends Health {
  
	double s_wight;
    double fat;
    String result;
    SubHealth(double s_wight, double fat,String result){
    	   this.s_wight=s_wight;
    	  this.fat=fat;
    	 this.result=result;		  
    	  
    }
    void caculate() {
    	  
    	if(gender=='M') {
    		this.s_wight=(tall-100)*0.9;
    		this.fat=(weight/s_wight)*100;
    		
    		
    	}else if(gender=='F') {
    		this.s_wight=(tall-100)*0.85;
    		this.fat=weight/s_wight*100;
    		
    	
    	}else {
    		System.out.println("다시입력하세요");
    	}
    	
    }
    void output2() {
    	if(fat>150) {
    		this.result="고도비만";
    		}else if(fat>130) {
    			this.result="중도비만";
    		}else if(fat>120) {
    			this.result="경도비만";
    		}else if(fat>110) {
    			this.result="과체중";
    		}else if(fat>90) {
    			this.result="정상";
    		}else if(fat<=90) {
    			this.result="저체중";
    		}else {
    			this.result="사람이 아닙니다";
    		}
    	 
    }
 
}
/*
 * ***** 비만도 Check *****
   성별(M/F) : M          <---남(M) / 여(F)
   신장(Cm) : 175.3
   체중(Kg)  : 95.45

   성별 - M 
   신장 - 175.3Cm
   체중 - 95.45Kg

   당신은 비만도 140.84이고,  중도비만 입니다.

 * */

