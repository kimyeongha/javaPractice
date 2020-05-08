package chapter06_Class01;
/*(2)후손클래스 : SubEntry   (Entry를 상속받음)
   필드명 : String definition; 
            int year;
   메소드 : public void printView();              //원어, 시기출력*/

/*
(3)main()함수에서
    두 메서드를 이용하여 아래 출력문을 완성.*/
public class SubEntry extends Entry {

	String definition;
	int year;

	public void printView(String definition, int year) {
		this.definition = definition;
		this.year = year;


	}

	public static void main(String[] args) {
		SubEntry se1 = new SubEntry();
		se1.writeViewS("OOP");
		se1.printView("Object Oriented Programming", 1991);
		System.out.println("******약어사전********");
		System.out.println("약어:"+se1.word);		
		System.out.println("원어"+se1.definition);
		System.out.println("연도"+se1.year+"년");
		

		/*
		 * (4)출력
		 ***** 
		 * 약어사전****** 약어 : OOP 원어 : Object Oriented Programming 시기 : 1991년
		 */

	}

}
