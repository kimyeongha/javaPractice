package chapter07;
//interface 는 상수와 추상메서드 밖에 들어갈수 없다. (변수와 일반 메소드는 안된다는 말)
//interface 는 선언부만 있고 구현부는 존재 하지않는다.

public interface Fightable extends Movable,Attackable {//다중 상속가능
   public static final  int a= 4;  // public static final 생략 가능 해서 변수로 보일수 있지만 상수이다 
    public abstract void add();  //public abstract 생략 가능 
}
