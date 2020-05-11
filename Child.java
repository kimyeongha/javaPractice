package chapter06_Class01;

public class Child extends Parent {
	  void ParentMethod() {
		  
	  }//상속관계이고, 선언부가 같으므로 오버라이팅 됨

	  void ParentMethod(int i) {
		  
	  }//매서드명 같고 매개변수만 다르므로 오버로딩이 됨.
	  
	  void childMethod() {
		  
	  }// 이건 그냥 상속 밭은 자손 클래스에서 새로운 매소드 정의 
	    //그리고 이건 부모클래스에는 없으므로 오버라이딩은 아니다.

  





}
