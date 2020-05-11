package chapter06_Class01;

public class Child1  extends Parent1{
   int x= 10;
   int y= 20;
 
	// TODO Auto-generated method stub
     void print(){
    	 System.out.println("x="+x);//인스턴스 변수 호출
    	 System.out.println("this.x="+this.x);//this 참조변수로 호출
    	 System.out.println("super.x"+super.x);//super 참조변수로 호출
    	 
     }
     String getLocation() {
    	
    	 return super.getLocation() + ",y="+y;
     }
     public static void main(String[] arg) {
    	 Child1 ch1= new Child1();
    	   ch1.print();
    	   System.out.println(ch1.getLocation());
     }
}

