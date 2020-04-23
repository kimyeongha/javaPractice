package chapter04;

import java.util.Scanner;

/*Math.random()메서드를 이용해 가위,바위,보 프로그램을 작성*/
public class Java_20200422_random {

	public static void main(String[] args) {
		// 내가무엇을 낼지 생각한다 .(사용자가 직접입력)- 키보드 입력 -Scanner 
		System.out.print("가위(1),바위(2),보(3) 중하나를 입력하시오");
		Scanner scan= new Scanner(System.in);
		int user =  scan.nextInt();
		//컴퓨터가 무엇을 낼지 임의로....(random)
	int com =	(int)(Math.random()*3)+1;   //1 ,2,3 으로 com 변수로 저장함.          int com= (int)(Math.random()*3)+1
		//내가 이기는 경우
	    if(user-com==1||user-com==-2) {                                                     //  switch(user-com){
	    	System.out.println("user승");
	    }else if(user-com==-1||user-com==2 ) {
	    	System.out.println("com승");
	    }else {
	    	System.out.println("무승부");
	    }
		//컴퓨터가 이기는 경우
		// 무승부
    
		//결과.
	}

}
