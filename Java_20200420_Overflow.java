package chapter02;
//overflow
public class Java_20200420_Overflow {

	public static void main(String[] args) {
		   byte b=127;  //-128~127
		   System.out.println((byte)(b+1)); //127 +1이면 128 일줄 알았는데 overflow 해서 처음 단계 -128이 됨
	}

}
