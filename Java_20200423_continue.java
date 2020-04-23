package chapter04;
/*반복문을 해당조건이면 취소하고 다음 반복문을 실행 continue*/
public class Java_20200423_continue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          for(int i = 0; i<=10; i++) {
        	  if(i%3==0) {
        		  System.out.println("aaaaa");
        		  continue;  // continue 앞까지는 실행하고 걸리면 for 문 맨마지막으로 간다> 처음부터 다시 시작 .
        		  
        		                    // 처음부터 break 에 걸려서 반복문 종료 그래서  i값 출력 은 아무것도 없을 것음  continue는 해당되는것만 중지 하고 계속 실행한다 .
        	  }
            System.out.println(i);
          }
		
		
	}

}
