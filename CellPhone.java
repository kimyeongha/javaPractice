package chapter06_Class01;

import java.util.Scanner;

public class CellPhone {
	Scanner scanner = new Scanner(System.in);

	String model;
	String color;
	boolean power;
    CellPhone(){
    	
    }
	
	CellPhone(String model,String color){
    	  this.model= model;
    	  this.color=color;
    }
	String powerOn() {

		
			return "전원을 킵니다";
			
		

	}

	String powerOff() {
		
		return	"전원을 끕니다";
		
		
	}

	void bell() {

	}

	String receiveVoice(String msg) {
                return msg;
	}

	String sendVoice(String msg) {
          return msg;
	}

	String callOff() {
           return "전화를 끕니다";
	}

}