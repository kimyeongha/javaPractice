package chapter02;
/*데이터형 변환(Casting)*/
public class Java_20200420_Casting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        double d= 85.4;
        int score =  (int)d;
        System.out.println(score);
        int i= 10;
        byte b = (byte)i;
            i= 300;
            b=(byte)i;
            System.out.println(b);//overflow 
	}

}
