package chapter05;
//사용자 입력받기 - 커맨드라인
public class Java_20200428_array06 {
/*사용자 입력받기 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
            System.out.println("매개변수의 개수:"+args.length);
	          for(int i=0; i<args.length; i++) {
	        	  System.out.println("args["+i+"]=\""+args[i]+"\"");
	          }
	
	}

}
