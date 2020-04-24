package chapter05;


import java.util.Scanner;



/*배열의 활용*/
public class Java_20200424_array2 {
	// 국어(75), 영어(63),수학(87),과학(57),사회(99)의 총합계와 평균을 구하시오.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*  
		 * // 국어점수를 저장하는 변수 int kor= 75; // 영어점수를 저장하는 변수 int eng=63; // 수학점수를 저장하는 변수
		 * int math=87; // 과학점수를 저장하는 변수 int sci=57; // 사회점수를 저장하는 변수 int soc=99;
		 * //국어,영어,수학,과학,사회의 총합계 int sum = kor+eng+math+sci+soc; //평균 (총합계/5) double
		 * average= sum/5f; //정수/정수는 정수밖에 안나옴 실제로는 76.2지만 76이라고 나옴 그래서 하나는 실수 타입으로 해줌
		 * System.out.println("합계는"+sum+"평균은"+average);
		 */
		Scanner scan= new Scanner(System.in);
		   
		int[] subject = new int[5];
		System.out.println("국어,영어,수학,과학,사회점수를 각각 순서대로 입력하세요");
		  for(int j=0; j<subject.length;j++) {
			  subject[j]=scan.nextInt();
		  }
          
		//        System.out.println("국어점수를 입력하시오");
                   //     subject[0]=scan.nextInt();
                     //   System.out.println("영어점수를 입력하시오");
                       // subject[1]=scan.nextInt();
                        //System.out.println("수학점수를 입력하시오");
                        //subject[2]=scan.nextInt();
                       // System.out.println("과학점수를 입력하시오");
                        //subject[3]=scan.nextInt();
                        //System.out.println("사회점수를 입력하시오");
                        //subject[4]=scan.nextInt();
		// int [] subject =new int[]{75,63,87,57,99)
		
		
                       
		//subject[0] = 75; //국어점수
		//subject[1] = 63; //영어점수
		//subject[2] = 87;//수학점수
	//	subject[3] = 57;//과학점수
	//	subject[4] = 99;//사회점수
	//	int sum1= 0;
	//	for(int i=0; i<5; i++) {
		//	sum1=sum1+subject[i];
	//	}
		//System.out.println(sum1);
	
		//System.out.println(sum1/(double)(subject.length));
		int sum=subject[0]+subject[1]+subject[2]+subject[3]+subject[4];
		double average= sum/(double)subject.length ;
		System.out.println("합계는"+sum+"평균은"+average);
	}

}
