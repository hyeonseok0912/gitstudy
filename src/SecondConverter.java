import java.util.Scanner;

public class SecondConverter {

	public static void main(String[] args) {
		System.out.println("����(��)�� �Է��ϼ��� : ");
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
			System.out.println(t + "���Դϴ�");
		}
		if (t < 1) {
			System.out.println("�Է��Ͻ� �ʴ� 1�� �̸��Դϴ�");
		}
		
		if (num >= d) {
			t = num / d;
			num = num - t * d;
			System.out.println(t + "���Դϴ�");
		}
		
		if (num >= h) {
			t = num / h;
			num = num - t * h;
			System.out.println(t + "�ð��Դϴ�");
		}
		if (num >= m ) {
			t = num / m;
			num = num - t * m;
			System.out.println(t + "���Դϴ�");
		}
		System.out.println(num + "���Դϴ�");
		
		

		}
	}


