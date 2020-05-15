package chapter07;

public class ParserTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          Parseable parser =  ParserManager.getParser("XML");  //XMLParser클래스의 주소를 리턴해서 받음 그받은 값이 Parseable 타입 이므로 mismatch 안하기 위해 parser 의 이름도 parseable 로 맞춤
                           parser=ParserManager.getParser("document.xml");
                           parser=ParserManager.getParser("HTML");
                           parser.parse("document.html");
	
	}
	

}
