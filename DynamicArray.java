package chapter07;

import java.util.ArrayList;   // ArrayList 는 util package 에 들어 있으므로 import해온다.
import java.util.HashMap;

public class DynamicArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	  //ArrayList의 문법
		ArrayList<String> listname= new ArrayList<String>();
		   Car                            c             = new  Car ();
		   int  [ ] array2                             = new int [5];
	    listname.add("영하");
	    listname.add("나나코");
	    listname.add("영진");
	    listname.add("영하");  //ArrayList는 중복된 데이터도 사용 가능. 하지만 hashMap에서는 불가능 하다.
	    
	 System.out.println(listname);
	//HashMap 의 문법
             HashMap<Integer,String> hashmapname = new HashMap();   //(key,value)
                 hashmapname.put(1, "영하");
                 hashmapname.put(2, "나나코");
                 hashmapname.put(3, "영진");
                 hashmapname.put(4, "영하");
                 hashmapname.put(5, "길원");
                 hashmapname.put(1, "이고잉");//처음 영하가 없어진다. 키가 중복이 되면 마지막에 있는 것만 표현 한다.
                 System.out.println(hashmapname);
                 
                 
      
	
	
	}
	
	
	

}
