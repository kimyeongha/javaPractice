package chapter06_Class01;

public class HealthTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		  SubHealth subhealth= new SubHealth(0, 0, null);
		  subhealth.input(); // 환자 정보를 입력받음
		  subhealth.caculate(); //환자 정보를 남자/여자에 따라 표준몸무게와 비만도를 측정
		  subhealth.output2();//비만도 따라 비만수준을 정함
		  
		  System.out.println("******비만도 Check******");
		  System.out.println("성별(M/F):"+subhealth.gender);
		  System.out.println("신장(Cm):"+subhealth.tall);
		  System.out.println("체중(Kg):"+subhealth.weight);
		  System.out.println("당신의 비만도는"+subhealth.result+"입니다");
		  System.out.println("비만도는"+(Math.round(subhealth.fat*100)/100.00));
	
		
		
	}

}
