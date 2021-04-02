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
		
		System.out.println("�� ������ ������? : " + year);
		System.out.println("�� ������ ����Ŀ��? : " + maker);
		
		boolean drive = true;
		while (drive) {
			System.out.println("���� �ӵ���? : " + nowspeed);
			System.out.println("1. �ӵ�����   2. �ӵ�����");
			int value = sc.nextInt();
			if (value == 1) {
				nowspeed += speed;
				if (nowspeed >= 120) {
					nowspeed = 120;
					System.out.println("�����Դϴ�.");
				}
				System.out.println("���� �ӵ���? " + nowspeed);
			}
			else {
				nowspeed -= speed;
				if (nowspeed <= 0) {
					nowspeed = 0;
					System.out.println("���� �������� �����Դϴ�");
				}
				System.out.println("���� �ӵ���? " + nowspeed);
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