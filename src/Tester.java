import java.util.Scanner;

public class Tester {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Monster a = new Monster();
		Hunter b = new Hunter();
		int hp = a.getHp();
		int power = b.getPower();
		System.out.println("������ �� hp��? : " + hp);
		
		boolean game = true;
		while (game) {
			
			System.out.println("�����Ͻðڽ��ϱ�?");
			System.out.println("1. ����     2. ���");
			int value = input.nextInt();
			if (value == 1) {
				hp = hp - power;
				b.attack();
				if (hp <= 0) {
					a.monster();
					game = false;
				} else {
					System.out.println("���� hp��? " + hp);
				}
			} else {
				System.out.println("������ ��ҵǾ����ϴ�.");
				System.out.println("������ ���� hp��? " + hp);
			}
		}

	}

}

class Monster {
	int hp = 900;

	public int getHp() {
		return hp;
	}

	public void monster() {
		System.out.println("���Ͱ� óġ�Ǿ����ϴ�.");
	}
}

class Hunter {
	int power = 100;

	public int getPower() {
		return power;
	}

	public void attack() {
		System.out.println("�����Ͽ����ϴ�");
	}
}