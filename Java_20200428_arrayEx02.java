package chapter05;

public class Java_20200428_arrayEx02 {
	// while 문과 Math.random()메소드를 이용해서 두개의 주사위를 던졌을때 나오는 눈이 아래의 형태로 출력하고, 눈의 합이 5가
	// 아니면 계속 주사위를 던지고. 눈의 합이 5이면 실행을 멈추는코드를 작성해보자
// 출력 (6,4)  (3,6)
	public static void main(String[] agrg) {
		             int com1=0;
		             int com2=0;
                   
                     while(true) {
                    	  com1=(int)(Math.random()*6)+1;
                          com2=(int)(Math.random()*6)+1;
                    	 if(!(com1+com2==5)) {
                    		 System.out.println("("+com1+","+com2+")");
                    	 }else {
                    		 System.out.println("("+com1+","+com2+")"+"합이 5입니다 종료합니다");
                    		 break;
                    	 }
                    	 
                     }
                     
                    	 
                     
	}
}