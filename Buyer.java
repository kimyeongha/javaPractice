package chapter07;

import java.util.Vector; // 다른 패키지에서 클래스 대려올떄는 import 로 들고옴

public class Buyer {
   int money = 1000;
    int bounusPoint= 0;
    int i = 0;
    // Product [ ] cart = new Product[10] ;  //크기가 10으로 고정되어 있는 고정 배열
     Vector cart = new Vector();  //동적 배열(Vactor :잘안사용함 멀티스레딩이 안됨 , ArrayList, HahsMap 을 많이 씀  //object 에 있는 Vector class
         
         
    		 
   void buy(Product p) {
	    if(money<p.price) {
	    	System.out.println(p.toString()+"구입에 실패하셨습니다");
	    	System.out.println("잔액이 부족합니다.");
	       
	      return;// 생략 가능 return
	    }else {
	    	//소유금액에서 제품 가격을 차감.
	         money=money-p.price;
	         bounusPoint=bounusPoint+p.bonusPoint;
	        System.out.println(p.toString()+"구입하셧습니다");
	        //cart [i++]= p; //이렇게 되면 p의 주소가 배열로 차례 차례 저장이됨
	        cart.add(p);  // 구입한 제품을 백터에 저장 //Vecotr은 클래스니까 별도 메소드를 사용하여 배열내 저장한다. add() 는 기본 10개 가 생성되는 Vacto에서 그이상 객체가 들어올경우 추가하는 메서드 이다  성공하면 true 실패 하면 false
	    }
   }
      void refund(Product p) {
    	  if(cart.remove(p)) {  //만약 카트(Vector)에서 제거 되면
    		  money=money+p.price; //소유 금액에서 제품의 가격을 더한다.
 	         bounusPoint=bounusPoint-p.bonusPoint;	      //보너스 보인트도 뺸다.
    	         
    		  System.out.println(p.toString()+"반품하셧습니다");
    	  }else {
    		  System.out.println("구입하신 물품중 해당 제품이 없습니다.");
    	  }
      }
   
   
   
         void summary() {
        	 //가격의 합계
        	   int sum = 0;
        	 // 제품 리스트
        	   String cartList=" ";
        	   if(cart.isEmpty()) {
        		   System.out.println("구입하신 물품이 없습니다.");
        	   }
        	   
        	   
        	   //반복문을 이용해서 제품의 총가격과 리스트를 구한다.
        	    // for(int i=0;  i<cart.length;i++) {
        	     for( int i = 0; i<cart.size(); i++) { 	
        	    	 Product p=(Product)cart.get(i);  //get 은 object타입메소드 이니까 Product 타입 으로 = 를 쓸수가 없다 . 형변환이 필요함
        	   sum= sum+p.price;
        	    	 cartList= cartList+p+",";
        	    	// if(cart[i]==null) {   Vactor 은 기본적으로 10개를 만든다. 그래서 그냥 이건 뺸다. 
        	    		// break;
        	    	 }
              System.out.println("구입하신 물건의 총금액은 "+sum);
              System.out.println("구입 하신 물품은"+cartList);	    
         
         }
         
        	 
         }

