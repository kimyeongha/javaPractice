package chapter05;

import javax.swing.JOptionPane;

public class Java_20200428_array08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
                      //컴퓨터가 생각한수 (random)-1~100까지 임의의 숫자를 저장
 
	     int answer=(int)(Math.random()*100)+1;
	     int input=0;
	     String temp=" ";
	     int count=0;
	   System.out.println(answer);
             do {
            	     count++;
            	     temp=JOptionPane.showInputDialog("1~100사이 숫자를 입력하세요 끝내려면-1를 입력하세요");
            	     if(temp==null||temp.equals("-1")) {break;}
            	     System.out.println("입력값:"+temp);
            	     input=Integer.parseInt(temp);
            	 
             }while(answer!=input);
	
	
	}
}