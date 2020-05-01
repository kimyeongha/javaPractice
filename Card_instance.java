package chapter06_Class01;
/*card class를 인스턴스화 하여 참조하기*/
public class Card_instance {
   
	public static void main(String[] args) {
	
	      System.out.println("클래스변수 width의 값은" +Card.width);//클래스 변수 접근
	      System.out.println("쿨래스 변수hight의 값은"+Card.height);//클래스 변수 접근

	      //인스턴스 변수 접근
	      Card c1 = new Card();
	      //System.out.println(c);
	      c1.shape="하트";
	      c1.number="7";
	      c1.color="red";
	     System.out.println("c1은"+c1.shape+"이며"+"숫자는"+c1.number+"이고"+"색은"+c1.color+"이다" +"크기는"+Card.height+Card.width);   
	     Card c2= new Card();
	     
	     c2.shape="스페이드";
	     c2.number="4";
	     c2.color="black";
	     System.out.println("c2은"+c2.shape+"이며"+"숫자는"+c2.number+"이고"+"색은"+c2.color+"이다"+"크기는"+Card.height+Card.width);   
	   c1.width=50;
	   c1.height=80;
	   System.out.println("변경후c1은"+c1.shape+"이며"+"숫자는"+c1.number+"이고"+"색은"+c1.color+"이다"+"크기는"+Card.height+Card.width); 
	   System.out.println("c2은"+c2.shape+"이며"+"숫자는"+c2.number+"이고"+"색은"+c2.color+"이다"+"크기는"+Card.height+Card.width);   //c1에서 변경했어도 c2도 클래스 변수를 공유하기때문에 바뀐 클래스 변수로 나옴
	   
	
	
	
	}

}
