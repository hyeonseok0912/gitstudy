import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("ù��° ���ڸ� �Է��ϼ���");
		int num1 = input.nextInt();

		System.out.println("�ι�° ���ڸ� �Է��ϼ���");
		int num2 = input.nextInt();

		System.out.println("��ȣ�� �Է��ϼ���");
		String c = input.next();

		int r;
		switch (c) {

		case "+":
			r = num1 + num2;
			System.out.println(r + "�Դϴ�");

			break;

		case "-":
			r = num1 - num2;
			System.out.println(r + "�Դϴ�");

			break;

		case "*":
			r = num1 * num2;
			System.out.println(r + "�Դϴ�");

			break;

		case "/":
			r = num1 / num2;
			System.out.println(r + "�Դϴ�");

			break;
		}

	}

}
