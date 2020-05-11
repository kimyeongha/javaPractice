package chapter06_Class01;

public class Point1 {
  int x,y ;
  

  Point1(int x, int y){
	  this.x=x;
	  this.y=y;
  }
  String getLocation() {
	  return "x: "+x+",y:"+y;
  }
}
