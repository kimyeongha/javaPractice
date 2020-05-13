package chapter07;

import chapter06_Class01.AccessTest03_1;

// protected : 같은 패키지나 상속 받을 경우 접근 가능.
public class AccessTest03  extends AccessTest03_1{
   
	public static void main(String[ ] args) {
	     //Access03 ac03 = new Access03();
	     //System.out.println(ac03.a);
	     AccessTest03 ac033= new AccessTest03();
	           System.out.println(ac033.a);     
	         // System.out.println(ac033.b);//default 값은 안됨
	        
	       
   }
   
}
class Access03{
	   protected int a= 200;
}
