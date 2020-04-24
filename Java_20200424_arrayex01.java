package chapter05;

public class Java_20200424_arrayex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//그린이가 중간고사에서 국어 80 수학 74 영어 63 과학 97 사회 88 받았다고 한다. 그린이의 중간고사 총점과 평균을 구하는 프로그램을 작성해라 단 배열로 작성하고 배열명은 score
		int sum= 0;
		int [ ] score= {80,74,63,97,88};
		int max = score[0];
		        for(int i=0;i<score.length;i++) {
		        	   sum = sum+ score[i];
		        	   if(max<score[i]) {
		        		   max=score[i];
		        	   }
		        	  }
		
         System.out.println("총점은"+sum);
         System.out.println("평균은"+(double)sum/score.length);
         System.out.println("최고점은 "+max);
	
	
	}

}
