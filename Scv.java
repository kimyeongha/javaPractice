package chapter07;

public class Scv extends GroundUnit10 implements Repairable{
           Scv(){
        	   super(60);   //super은 부모클래스의 생성자를 호출 대입시키고 그값을 받는다.
        	   hitPoint=Max_HP;
           }
           void repair(Repairable r) {
        	       if(r  instanceof Unit10) {
        	    	     Unit10 u =(Unit10)r;
        	    	     while(u.hitPoint!=u.Max_HP) {
        	    	    	 u.hitPoint++;
        	    	     }
        	    	     System.out.println(u+"의 수리가 끝났습니다.");
        	       }
           }
}
