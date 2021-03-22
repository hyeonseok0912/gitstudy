import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("첫번째 숫자를 입력하세요");
		int num1 = input.nextInt();

		System.out.println("두번째 숫자를 입력하세요");
		int num2 = input.nextInt();

		System.out.println("부호를 입력하세요");
		String c = input.next();

		int r;
		switch (c) {

		case "+":
			r = num1 + num2;
			System.out.println(r + "입니다");

			break;

		case "-":
			r = num1 - num2;
			System.out.println(r + "입니다");

			break;

		case "*":
			r = num1 * num2;
			System.out.println(r + "입니다");

			break;

		case "/":
			r = num1 / num2;
			System.out.println(r + "입니다");

			break;
		}

	}

}
