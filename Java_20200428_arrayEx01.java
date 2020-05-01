package chapter05;

public class Java_20200428_arrayEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// for 문을 이용하여 1~100까지 정수 중에서 3의 배수의 총합을 구하는 코드를 작성해보자
		int sum=0;
		for(int i=0; i<=100; i++) {
			if(i%3==0) {
				sum=sum+i;
			}
		}
		System.out.println("3의 배수 총합은:"+sum);
	}

}
