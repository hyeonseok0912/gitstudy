import java.util.Scanner;

public class Tester {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Monster a = new Monster();
		Hunter b = new Hunter();
		int hp = a.getHp();
		int power = b.getPower();
		System.out.println("몬스터의 총 hp는? : " + hp);
		
		boolean game = true;
		while (game) {
			
			System.out.println("공격하시겠습니까?");
			System.out.println("1. 공격     2. 취소");
			int value = input.nextInt();
			if (value == 1) {
				hp = hp - power;
				b.attack();
				if (hp <= 0) {
					a.monster();
					game = false;
				} else {
					System.out.println("현재 hp는? " + hp);
				}
			} else {
				System.out.println("공격이 취소되었습니다.");
				System.out.println("몬스터의 현재 hp는? " + hp);
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
		System.out.println("몬스터가 처치되었습니다.");
	}
}

class Hunter {
	int power = 100;

	public int getPower() {
		return power;
	}

	public void attack() {
		System.out.println("공격하였습니다");
	}
}