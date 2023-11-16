package oop.poly.player;

public class Mage extends Player{

	int mana;
	
	Mage(String name){
		super(name);
		this.mana = 100;
	}
	
	@Override
	void characterInfo() {
		super.characterInfo();
		System.out.println("# 정신력: " + mana);
	}

	
	// 1, 2
	public void blizzard(Player[] targets) {
		// 4
		System.out.println(this.name + "가 눈보라를 시전합니다.");
		this.mana -= 30;
		System.out.println("30의 마나가 소모됩니다. 남은 정신력: " + this.mana);
		System.out.println("-----------------------------------");
		for(Player target : targets) {
			if(target == this) {
				continue;
			}
			//5
			int dmg = (int)(Math.random()*6)+10;
			target.hp -= dmg;
			//6
			System.out.printf("%s님이 %d의 데미지를 입혔습니다. (남은 체력 : %d)\n",target.name,dmg,target.hp);
		}
	}
	
	
	
}
