package chapter06_Class01;

public class Car0508 {
    String Color;  //색상
    String geartype;  //변속기 종류 auto, manual
    int door; //문의 개수
    Car0508(){
    	this("white","auto",4);
    }
  
    
     Car0508(String color, String geartype, int door){
    	     this.Color= color;
    	     this.geartype= geartype;
    	     this.door=door;
    	     
     }
     Car0508(Car0508 c){
     	 Color=c.Color;
     	 geartype=c.geartype;
     	 door=c.door;
     }
     
	
}
