package chapter05;
/*배열선언과 생성시 주의 사항*/
public class Java_20200424_array {

	public static void main(String[] args) {
		//변수선언
		int a ;
		//변수 선언과 동시에 b변수에 값 10을 초기화
		int b =10;
		
		//배열선언
		int  [ ]   array; // or int array [ ] ;
		  //배열 생성
		array= new int[4];
		//배열 생성과 선언 한줄
		int[ ]array2 = new int[5];  
		//배열의 초기화 1
		   array2[0]=100;
		   array2[1]=90;
		   array2[2]=80;
		   array2[3]=70;
		   array2[4]=60;
		//배열의 초기화 2   : 
		   int [ ] array3 = new int[ ] {100,90,80,70,60};
		   int [ ] array4 =  {100,90,80,70,60}; //이렇게 생성자 없이도 가능함. 
		 /*  
		   but
		     int [ ]array5 ;
		     array5={100,90,80,70,60,}; 은 안됨 생성 꼭해줘야함.  >> 선언과 초기화를 따로 진행했을 경우는 반드시 생성해줘야함.

		 */
		  
		  
		   
		   
	}

}
