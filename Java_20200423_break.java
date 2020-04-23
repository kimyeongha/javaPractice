package chapter04;

public class Java_20200423_break {

	public static void main(String[] args) {
		 int sum = 0;
		 int i =0;
		 while(true) {
			 if(sum>100) {
				 break;
			 }
			 i++;
			 sum = sum+i ;
			 
			  //sum 이 100보다 크면  벗어나라.  이게 없으니까 무한반복
		 }
            System.out.println("i="+i);
            System.out.println("sum="+sum);
	}

}
