package chapter06_Class01;

import java.util.Scanner;

public class Phonetest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("당신의 휴대폰 모델을 입력하시오");  
		String model= s.next();
		System.out.println("색상을 입력하시오");
		  String color=s.next();
		  System.out.println("원하는 채널을 선택하시오");
		  int channel= s.nextInt();
		 
		DmbCellPhone dcp = new DmbCellPhone(model,color,channel);
	  
		System.out.println("===================================================");
		System.out.println("1. 전원 켬 2. 전원 끔 3. 전화 받기 4. DMB 켜기 5. DMB채널 바꾸기 6. DMB 끄기 ");
		System.out.println("===================================================");
		while(true) {
		System.out.println("하시고자 하는 기능을 입력하세요.");
	     int menu=s.nextInt();
		
		if(menu==1) {
			dcp.powerOn();
			System.out.println(dcp.powerOn());
		}else if(menu==2) {
			System.out.println(dcp.powerOff());
			break;
		}else if(menu==3) {
			System.out.println("벨이 울립니다");
			while(true) {
			System.out.println("1.받는다2.메세지 입력 3. 전화 종료");	
			int select=s.nextInt();
			                                                    // .next() . nextLine() 의 차이는 문자란 \n까지 저장하게 된다 그리고 next 는 버퍼에서 \n은 제외하고 불러오고 Line 은 포함해서 불러오게 된다 그래서 만약 Line 을 쓰고 싶다면 .skip(\\n\\r)써줘야한다.
			if(select==1) {
				System.out.println("상대방에게 뭐라 하고싶습니까");
				s.skip("\\r\\n"); // r:은 return n 은 개행
				String reply=s.nextLine();	
				System.out.println("당신"+reply);
			  }else if(select==2){
				  s.skip("\\r\\n");   // 위쪽에 next()는 문자열\n으로 저장을 하는데 이것을 스킵하고 그다음거 부터 읽어라 라는 뜻으로 넣는다 ! 
				  String reply2= s.nextLine();
				  System.out.println(reply2);
				  
			  }else if(select==3) {
				  System.out.println("전화를 끊습니다");
				  break;
			  }
			}
		}else if(menu==4) {
			dcp.DmbOn();
		}else if(menu==5) {
			System.out.println("채널 몇번 ");
			int channel3 =s.nextInt();
			dcp.changeChannel(channel3);
		}
	  
	  }
	}
}
