package chapter07;

public class Unit10 {
   int hitPoint; //변수
    final int Max_HP ;//상수(초기화를 반드시 해주어야 한다. 생성자를 통한 초기화와 선언적 초기화가 있을수 있는데 이번에는 생성자를 통해 초기화를 하도록 하겠다.
   Unit10(int hp){      //생성자를 통해서  
	   Max_HP=hp;    // Max_HP 상수를 초기화 하고 있다. 
   }
}
