package chapter06_Class01;

public class Plane {
	 String maker=" ";
	  String model=" ";
	  int max=0;
	  Plane(){
			
		}

	 
	
	Plane(String maker,String model,int max){
		this.maker= maker;
		this.model= model;
		this.max= max;
	        
	}
	
	

	public static void main(String[] args) {
		Plane plane= new Plane();
		Plane airbus= new Plane("airbus","A380",500);
		Plane asiana= new Plane("아시아나","K100",600);
     
		
		
		System.out.println("비행기 제작사"+airbus.maker);
		System.out.println("비행기모델"+airbus.model);
		System.out.println("최대승객수"+airbus.max);
		System.out.println("비행기 제작사"+asiana.maker);
		System.out.println("비행기모델"+asiana.model);
		System.out.println("최대승객수"+asiana.max);
	}
	
	
}

 




