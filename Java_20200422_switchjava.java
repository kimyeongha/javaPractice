package chapter04;

public class Java_20200422_switchjava {

	public static void main(String[] args) {
      int num= 6;
      double numm= 3.14;   //switch는 변수는 안된다. 그리고 int 이하의 정수로 이루어진 수만 가능.
      switch(num) {
      case 1:
      case 7:
    	  System.out.println("sk");
    	  
    	  break;
      case 6:
      case 8:
         System.out.println("KTF");
         break;
      case 9: System.out.println("lg");
        break;
        default :System.out.println("Unknown");
        break;
      }
     

		
		
		
		
		
		
		
		
		
	}

}
