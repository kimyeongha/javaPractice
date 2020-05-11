package chapter06_Class01;

public class Point3D1 extends Point1 {
   int z; 
   
   Point3D1(int x , int y , int z) {
	   super(x,y);//반드시 첫줄에 있어야 한다. 
	   this.x=x;
	    this.y=y;
	    this.z=z;
	    
   }
   String getLocation() {
	   return "x: "+ x+ ",y:"+y+",z:"+z;
   }
 public static void main(String[]args) {
	  Point3D1 p3= new Point3D1(3,4,1);
	  System.out.println(p3.getLocation());
 }


}
