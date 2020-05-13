package chapter07;

public class Test34 extends Salary {
       String department;
       
       Test34(String name, int salary, String department){
    	      super(name,salary);
    	      this.department=department;
       }
      void  getInformation2(){
    	   System.out.println("부서:"+department);
       }
    	   
       
	public static void main(String[] args) {
		// TODO Auto-generated method stub
               Test34 ob= new Test34("그린이",8500000,"기획부");
                  ob.getInformation1();
                  ob.getInformation2();
               
	}

}
