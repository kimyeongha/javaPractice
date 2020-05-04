package chapter06_Class01;

public class PrimitiveParamEx {
    //기본형 매개변수
	public static void main(String[] args) {
		// TODO Auto-generated method stub
                 Data d= new Data();  //인스턴스 생성
                 d.x=10;
                             System.out.println("main():x="+d.x);
                             change(d.x);   //기본형 매개변수
                             System.out.println("after change(d.x)");  
                             System.out.println("main():x="+d.x); //참조형 매개변수의 경우 d.x값이 1000으로변경되었으나 기본형 매개변수는 변경 하지 않는다.
                             
                           
                          
                             
                             //main 끝
	}
   static void change(int x) {  //기본형 매개변수
	   x=1000;
	   System.out.println("change: x="+x);
   }
}
