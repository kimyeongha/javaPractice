package chapter05;
/*이차원 배열에서 for문 활용하기*/
public class Java_20200427_arrayex05 {
//              국어   영어  수학
//         1  100  100  100
//         2   20    20    30
//         3    30   30    30
//         4    40   40    40 
//         5    50   50    50
	public static void main(String[] args) {
           int score [ ] [ ] = new int[5] [3];
       /*    score[0][0]= 10;
           score[0][1]=10;
           score[0] [1]= 10;
           score[1][0]=20;
           score[1][1]=20;
           score[1][2]=20;
           score[2][0]=30;
           score[2][1]=30;
           score[2][2]=30;
           score[3][0]=40;
           score[3][1]=40;
           score[3][2]=40;
           score[4][0]=50;
           score[4][1]=50;
           score[4][2]=50;*/
        //구구단 하는것처럼 중첩for를 사용하면 이 노가다를 하지 않을수 있지 않을까?;       
        
        System.out.println("    국어   영어   수학");   
        System.out.println("-------------------------");
           
           for(int i = 0;  i<5; i++) {
        	   System.out.print(i+1+"    ");
        	   for(int j=0; j<3; j++) {
        		    
        		       System.out.print((score[i][j]=(i+1)*10)+"   ");
        		   
        		    		  
        	   }
        	   System.out.println();
           }
           
           
           

	}

}
