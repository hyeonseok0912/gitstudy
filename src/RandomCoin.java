import java.util.Random;
import java.util.Scanner;

public class RandomCoin {

	public static void main(String[] args) {
		Random rand = new Random();
		int randNum;

		randNum = rand.nextInt(1);
		Scanner input = new Scanner(System.in);
		System.out.println("¦������ Ȧ������ �Է��Ͻÿ�");

		String T = input.next();
		int check = 0;
		switch (T) {
		case "¦��":
			check = 0;
			break;
		case "Ȧ��":
			check = 1;
			break;
		}
		System.out.println(check + "!");

		if (randNum == check) {
			System.out.println("����");
		} else {
			System.out.println("����");
		}
		System.out.println("��������: " + randNum);
	}

}
