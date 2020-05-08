package chapter06_Class01;

public class student {
	student(int kor ,int eng, int math){
		this. kor =kor;
		this.eng=eng;
		this.math=math;
	}
	String name="";
	int ban=0;
	int no=0;
	int kor;
	int eng;
	int math;
   
	 int getTotal(int kk, int ee, int mm){
		  int sum =kk+ee+mm;
		 return sum;
	}
	 float getAverage() {
  return (kor+eng+math)/3f;
		  
	 }

public static void main(String[ ] args) {
	student s= new student(15,25,39);
	
	System.out.println(s.getTotal(20,30,40));

	System.out.println(s.getAverage());
}



}
