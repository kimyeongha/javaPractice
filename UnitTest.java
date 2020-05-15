package chapter07;

import java.util.ArrayList;
import java.util.HashMap;

public class UnitTest {

	public static void main(String[] args) {
		Unit [ ] group = new Unit[5];
		 group[0]= new Marine();
		 group[1]= new DropShip();
		 group[2]= new Tank();
		 //클래스 배열 
			ArrayList<Unit> group1 = new ArrayList<Unit>();
			    group1.add(new Marine());
			    group1.add(new Tank());
			    group1.add(new DropShip());
			//동적 배열
			  HashMap<Integer,Unit> group2= new HashMap<Integer,Unit>();
			     group2.put(1, new Marine());
			     group2.put(2, new DropShip());
			     group2.put(3, new Tank());
					   
			     System.out.println(group1.get(1));

	}

	
	
	
}
