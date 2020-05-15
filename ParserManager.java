package chapter07;
//인터페이스를 리턴 타입으로 정할수 있다.
public class ParserManager {
            public static Parseable getParser(String type) {  
            	  
            	  if(type.equals("XML")) {
            		  Parseable p= new XMLParser();
            		         return p;
            	  }else {
            		  Parseable p = new HTMLParser();
            		  return p;
            	  }
            }
            
}
