package chapter06_Class01;

public class DogTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Dog dd1= new Dog("멍멍이1","요쿠셔테리어",3);
         Dog dd2= new Dog("멍멍이2",9);
         Dog dd3= new Dog("흰둥이","시츄",5);
        
         System.out.println("강아지이름은"+dd1.name+"종류는"+dd1.breed+"나이는"+dd1.age+"입니다");
         System.out.println("강아지이름은"+dd2.name+"나이는"+dd2.age+"입니다");
         System.out.println("강아지이름은"+dd3.name+"종류는"+dd3.breed+"나이는"+dd3.age+"입니다");
   
		
	
	}

}
  