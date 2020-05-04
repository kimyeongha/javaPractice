package chapter06_Class01;
//참조형 매개변수
public class ReferenceParamEx {
            public static void main(String []args) {
            	Data d= new Data();
            	d.x= 10;
            	System.out.println("main(): x"+d.x);
            	change(d);
            	System.out.println("After change(d.x)");
            	System.out.println("main():x"+d.x);  //change 라는 메소드가 인스턴트 값 변경을 하니까 여기있는d.x는 1000이 나옴  왜냐하면 주소자체를 던지는 것이기때문에 그곳을 변경하니 . 전체가 변경된다.
            	
            }
           static void change(Data d) {
        	   d.x=1000;
        	   System.out.println("change: x="+d.x);
           }
}
