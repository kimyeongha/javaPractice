package chapter06_Class01;
//자손 클래스 sub Class
public class InheritanceTest  extends Inheritance{
   int z= 20;
   InheritanceTest(String kicker, int NONO){
	   super(kicker,NONO);
   }
   
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InheritanceTest i1 = new InheritanceTest("messi",10);
		System.out.println(i1.x+i1.z);
		System.out.println(i1.NO);
		System.out.println(i1.player);
	
	}

}
