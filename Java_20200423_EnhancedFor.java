package chapter04;

public class Java_20200423_EnhancedFor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[ ] arr = {10,20,30,40,50} ;
		int sum = 0;
		
		for(int i=0; i<arr.length; i++) {
			System.out.println(" "+arr[i]);
		}               //기존 배열사용한 for
		System.out.println();
		for(int tmp:arr) {
			System.out.println(" "+tmp);
		}    //향상된 for문

	}

}
