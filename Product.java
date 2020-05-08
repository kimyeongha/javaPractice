package chapter06_Class01;
// 초기화 시기와 순서 (1.명시적, 2초기화 블럭,3. 생성자)
public class Product {
      //명시적 초기화 (Explicit)
	// 클래스 명시적 초기화
	  static int count=0;
	//인스턴스 명시적 초기화 
	int serialNo ;//기본값으로 설정;
	//초기화 블럭을 통한 초기화 ;
	
	{
		++count;
		serialNo = count;
	}
//생성자를 통한 초기화 
 Product(){
	 
 }

}
