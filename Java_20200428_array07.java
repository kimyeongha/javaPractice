package chapter05;
//사용자 입력받기 
public class Java_20200428_array07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
                    int num1 = Integer.parseInt(args[0]);  //args는 문자열 배열이기떄문에 num 로 넣으려면 int 타입으로 바꿔 주어야한다. 기본형타입은 (int)로 간단하게 되지만 참조형 타입은 이렇게 integer.paseInt써야 함.
                    String op=args[1];
                    int num2=Integer.parseInt(args[2]);
                    int result = 0;
                  //사칙연산 계산 (op가 +면 더하기, - 면빼기, *면 곱하기, /면 나누기)
                    if(op.equals("+")){
                    	result=num1+num2;
                    }else if(op.equals("-")) {
                    	result=num1-num2;
                    }else if(op.equals("x")) {
                    	result=num1*num2;
                    			
                    }else if(op.equals("/")) {
                    	result=num1/num2;
                    }else {
                    	System.out.println("사칙연산중(+,-,*,/)중하나를 입력하세요.");
                    }
                    
                   
                  System.out.println(result);
                    		
	}

}
