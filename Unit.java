package chapter07;

public abstract class Unit {
    int x, y;  // 좌표(x축이동,y축이동)
   abstract void move(int x, int y);
	// 현재 위치에서 정지하는 기능
   abstract void stop();
}
