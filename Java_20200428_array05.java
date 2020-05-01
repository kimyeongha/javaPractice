package chapter05;

public class Java_20200428_array05 {
  //배열의 복사
	public static void main(String[] args) {
		// TODO Auto-generated method stub
   //for문을 이용한 배열복사
		//1차원배열 선언및 생성(원본)
		int number [ ] = { 1,2,3,4 };
		
		//1차원배열 선언및 생성(복사본)
		int [ ] newnumber= new int [10];
		
		for(int i=0; i<number.length; i++) {
			newnumber[i]=number[i];
		}
		
		
		//System.arraycopy( )
       
		//src 원본 배열 srcPos 어떤위치에 있는 데이터를 복사 할것인지 ? (어디부터)  dest:복사본 배열 destPos 어떤위치에 원본 데이터를 복사본에 복사할것인지 . 
		//원본데이터의 시작위치에서 어디까지를 복사 할것인가.
		 char [] abc= {'a','b','c','d'};//원본
		 char [] num= {'0','1','2','3','4','5','6','7','8','9'};//원본
		
		//System.arraycopy(src, srcPos, dest, destPos, length);
          char [ ] result=new char[abc.length+num.length];
	            System.arraycopy(abc, 0, result, 0, abc.length);
	            System.arraycopy(num, 0, result, abc.length, num.length);
	            System.out.println(result);
	}

}
