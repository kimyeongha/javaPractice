package chapter07;

public class Time {
private	int hour;
private	int minute;
private	int second;
	Time(int hour, int minute, int second){
		  this.hour=hour;
		  this.minute= minute;
		  this.second=second;
	}
   //만약 생성자에 private 를 하면 어떻게 될것인가.  return 타입에 Singleton 을 입력한ㄷ.
	// TODO Auto-generated constructor stub

	public String toString() {  //원래 상속받는object 클래스에서 toString()메소드 를변경 오버라이딩
    	return hour+":"+minute+":"+second;
    }
    // 캡슐화의 종류라고도 할수 있다.
      //getter , setter 메소드 선언  Source 에서 Generate getter setter로 만듬 만드는 이유는? 우리가 private 변수를 만들어 놓으면 외부에서던저도 변경 을 시킬수가 없음 그래서 변경 시키기 위해서 public 타입으로 gettersetter 를 만들어서 우회 하여 private 값에 넣는다.
	public int getHour() {
		
		return hour;
	}
	public void setHour(int hour) {
		if(0<hour && hour<=23) {
			this.hour = hour;		
		}else {
			System.out.println("0부터 23시까지 다시 입력하십시오");
		}
	//다시 입력하게 유도하는 방법
	}
	public int getMinute() {
		return minute;
	}
	public void setMinute(int minute) {
		if(minute<0||minute>59) {
			return;
		}
		
		this.minute = minute;
	}    //맞을 경우만 값을 저장한다. 
	public int getSecond() {
		return second;
	}
	public void setSecond(int second) {
		if(second<0||second>59) {
			return;
		}
		
		this.second = second;
	}
    
}
