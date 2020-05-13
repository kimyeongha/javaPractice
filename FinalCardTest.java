package chapter07;

public class FinalCardTest {

	public static void main(String[] args) {
	    Card c= new Card();
	    //c.NUMBER=5;  //NUMBER가 상수이기때문에 에러가 난다.
System.out.println(c.KIND);
System.out.println(c.NUMBER);
System.out.println(c.toString());

    
      
	}

}
