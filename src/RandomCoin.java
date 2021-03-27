import java.util.Random;
import java.util.Scanner;

public class RandomCoin {

	public static void main(String[] args) {
		Random rand = new Random();
		int randNum;

		randNum = rand.nextInt(1);
		Scanner input = new Scanner(System.in);
		System.out.println("짝수인지 홀수인지 입력하시오");

		String T = input.next();
		int check = 0;
		switch (T) {
		case "짝수":
			check = 0;
			break;
		case "홀수":
			check = 1;
			break;
		}
		System.out.println(check + "!");

		if (randNum == check) {
			System.out.println("정답");
		} else {
			System.out.println("오답");
		}
		System.out.println("랜덤값은: " + randNum);
	}

}
