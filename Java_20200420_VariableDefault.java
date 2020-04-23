package chapter02;
// 변수의 기본값과 초기화;
public class Java_20200420_VariableDefault {
            int z; //전역변수 
	public static void main(String[] args) {   //여기 있을 경우 지역변수
	     int a=10;  //a 변수의 초기화
	     int b = 20; //b 변수의 기본값 ( int 타입의 기본값은 0)
	     int sum = 0;
	     char grade = ' '; //작은 따옴표 붙여서 하는게 아니라 한칸 띄어줘야한다. 
	     sum= a+b;  // 지역변수는 사용되기전에 반드시 초기화 해줘야 한다는 법칙을 위배했다.  

	}

}
