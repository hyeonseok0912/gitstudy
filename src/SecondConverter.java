import java.util.Scanner;

public class SecondConverter {

	public static void main(String[] args) {
		System.out.println("숫자(초)를 입력하세요 : ");
		Scanner input = new Scanner (System.in);
		int num = input.nextInt();
		int s = 1;
		int m = s * 60;
		int h = m * 60;
		int d = h * 24;
		int y = d * 365;
		int t = 0;
		
		
		if (num >= y) {
			t = num / y;
			num = num - t * y;
			System.out.println(t + "년입니다");
		}
		if (t < 1) {
			System.out.println("입력하신 초는 1년 미만입니다");
		}
		
		if (num >= d) {
			t = num / d;
			num = num - t * d;
			System.out.println(t + "일입니다");
		}
		
		if (num >= h) {
			t = num / h;
			num = num - t * h;
			System.out.println(t + "시간입니다");
		}
		if (num >= m ) {
			t = num / m;
			num = num - t * m;
			System.out.println(t + "분입니다");
		}
		System.out.println(num + "초입니다");
		
		

		}
	}


