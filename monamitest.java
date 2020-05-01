package chapter06_Class01;

public class monamitest {

	public static void main(String[] args) {
		monami1 mo=new monami1();
		mo.color="yellow";
		System.out.println("모나미의 가로길이는"+monami1.width+"cm이고"+"세로길이는"+monami1.height+"cm이고"+"색은"+mo.color+"입니다");
		mo.color="red";
		System.out.println("모나미의 가로길이는"+monami1.width+"cm이고"+"세로길이는"+monami1.height+"cm이고"+"색은"+mo.color+"입니다");
		mo.color="green";
		System.out.println("모나미의 가로길이는"+monami1.width+"cm이고"+"세로길이는"+monami1.height+"cm이고"+"색은"+mo.color+"입니다"+mo.push());

	}

}
