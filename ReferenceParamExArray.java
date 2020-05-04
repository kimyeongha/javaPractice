package chapter06_Class01;
//참조형 매개변수(배열)
public class ReferenceParamExArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
                //     int [ ] x= {10};
                //   System.out.println("main():x"+x[0]);
                  //   change(x);
                   //  System.out.println("main() after:x="+x[0]);   //배열도 주소값을 던지기때문에 바뀜. 
		   int [ ]num = new int [] {3,2,1,6,5,4};
		   printArr(num);
		   sumArr(num);
		   //num배열의 모든요소를 출력.

   /*static void change(int[ ] x) {
	    x[0]=1000;
	    System.out.println("change() x="+x[0]);
   */
   }
	static void printArr(int[ ] num) {
		System.out.print("{");
		  for(int i=0; i<=num.length-1; i++) {
			   System.out.print(num[i]+",");  //num 을 모르니까 빨간줄 나옴. 
			 
	}
		  System.out.println("}");
}
	static int sumArr(int[ ] num) {
	int sum=0;
	for(int i=0; i<num.length; i++) {
		sum+=num[i];
		
	}
	System.out.println(sum);
	return sum;
}

}