package chapter07;

public class Salary {

   String name;
   int salary;
   Salary(String n , int s){
	   this.name=n;
	   this.salary=s;
	   
   }
  void  getInformation1(){
	   System.out.println("이름:"+name);
    System.out.println("연봉:"+salary); 
  }
	
	
}
