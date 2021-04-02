import java.util.Scanner;

public class CarSimulator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Car car = new Car();
		int year = car.getYear();
		String maker = car.getMaker();
		double speed = car.getSpeed();
		double maximumspeed = 120;
		double nowspeed = 0;
		
		System.out.println("이 차량의 연도는? : " + year);
		System.out.println("이 차량의 메이커는? : " + maker);
		
		boolean drive = true;
		while (drive) {
			System.out.println("현재 속도는? : " + nowspeed);
			System.out.println("1. 속도증가   2. 속도감소");
			int value = sc.nextInt();
			if (value == 1) {
				nowspeed += speed;
				if (nowspeed >= 120) {
					nowspeed = 120;
					System.out.println("과속입니다.");
				}
				System.out.println("현재 속도는? " + nowspeed);
			}
			else {
				nowspeed -= speed;
				if (nowspeed <= 0) {
					nowspeed = 0;
					System.out.println("현재 정지중인 상태입니다");
				}
				System.out.println("현재 속도는? " + nowspeed);
			}
		}
			
	}

}
class Car{
	int year = 2015;
	String maker = "Honda";
	double speed = 10;
	
	public int getYear() {
		return year;
	}
	public String getMaker() {
		return maker;
	}
	public double getSpeed() {
		return speed;
	}
}