package chapter06_Class01;

import java.util.Scanner;

public class absoluteValue {
	
	int a = 0;
	int result = 0;

	absoluteValue(int value){
		this.a=value;
	}
	
	int abc() {
		if (a < 0) {
			result = -a;
		}
		
		else if(a>=0) {
			result=a;
		}
		return result;
	}

	public static void main(String[] args) {
	while(true) {
		System.out.println("원하는 값을 입력해보시오");
		Scanner s=new Scanner(System.in);
		
		int a=s.nextInt();
		absoluteValue mm= new absoluteValue(a); 
		System.out.println(mm.abc());
	}
	}
}