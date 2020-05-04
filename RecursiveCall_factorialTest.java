package chapter06_Class01;
//재귀호출 예제(factiorial)
//5!=5*4*3*2*1
public class RecursiveCall_factorialTest {

	public static void main(String[] args) {
		int sum=1;
		// TODO Auto-generated method stub
                 int result=factorial(4);
                 System.out.println(result);
                for(int i=1; i<=5; i++) {
                	
                	sum=sum*i;
                		
                	}//for문을 이용한 factorial  재귀호출이은 for문으로 바꾸는 것이 가능하다.
                	System.out.println(sum);
                }
	
           static int factorial(int n) {
        	   int result=0;
        	   if(n==1) {
        		   result=1;
        		   
        	   }else {
        		   result=n*factorial(n-1);
        	   }
        	   return result;
        		   
           }
}
