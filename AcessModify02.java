package chapter07;

import chapter06_Class01.Access02_1;

//default 접근 제어자. (같은 패키지 내에서만 가능함)
public class AcessModify02 {
     public static void main(String[ ]args) {
    	 Access02 ac =new Access02();
    	 System.out.println(ac.a);
    	 System.out.println(ac.b);
    	 Access02_1 ac_01= new Access02_1();
    	System.out.println(ac_01.c);
     }
}
  class Access02{
	int a= 200; //default
	int b = 300;//default
}