package chapter06_Class01;

public class SubHealth extends Health {
    Health h1= new Health();
	double s_wight;
    double fat;
    String result;
    SubHealth(double s_wight, double fat,String result){
    	  this. s_wight=s_wight;
    	  this.fat=fat;
    	 this.result=result;		  
    	  
    }
    void caculate() {
    	  
    	if(h1.gender=='M') {
    		s_wight=(h1.tall-100)*0.9;
    		fat=(h1.weight/s_wight)*100;
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
    		
    	}else if(h1.gender=='F') {
    		s_wight=(h1.tall-100)*0.85;
    		fat=h1.weight/s_wight*100;
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
    void output2() {
    	 
    }
  public static void main(String[]args) {
	  Health health= new Health();
	  SubHealth subhealth= new SubHealth(0, 0, null);
	  health.input();
	  subhealth.caculate();
	  
	  System.out.println("******비만도 Check******");
	  System.out.println("성별(M/F):"+health.gender);
	  System.out.println("신장(Cm):"+health.tall);
	  System.out.println("체중(Kg):"+health.weight);
	  System.out.println("당신의 비만도는"+subhealth.result);
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

