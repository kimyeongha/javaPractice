package chapter07;

public class Refrigerator extends Product {
   Refrigerator(){
	   super(100);
   }
   public String toString() {  //최상위 클래스 object 안에 포함 되는 toString 을 String 타입으로 return 하겠다. 
  	 return "오디오";
}
}