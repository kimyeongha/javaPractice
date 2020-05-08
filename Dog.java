package chapter06_Class01;

public class Dog {
  String name= " ";
  int age =0;
  String breed=" ";
	
	
	Dog(){
	  
  }

  Dog(String name ,int age){
	 this. name=name;
	  this.age= age;
  }
  Dog(String name,String breed, int age ) {
	  this.name=name;
	  this.age=age;
	  this.breed=breed;
  }
 
}
