package oop.poly.player;

public class Player {

	String name;
	int level;
	int atk;
	int hp;
	
	Player(){
//		System.out.println("Player의 기본 생성자 호출!");
//		System.out.println("this의 주소값: " + this);
		this.level = 1;
		this.atk = 3;
		this.hp = 50;
	}
	
	Player(String name){
		this();
//		System.out.println("Player의 2번 생성자 호출!");
//		System.out.println("this의 주소값: " + this);
//		level = 2;
//		atk = 5;
//		hp = 100;
		this.name = name;
	}
	
	Player(String name, int hp){
		this(name); // 다른 생성자의 호출은 생성자 내에서 최상단에 위치해야 합니다.
//		System.out.println("Player의 3번 생성자 호출!");
//		this.name = name;
		this.hp = hp;
	}
	
	void attack(Player target) {
		
//		System.out.println("target: " + target);
//		System.out.println("this: " + this);
		
		if(this == target) {
			System.out.println("자기 자신을 때리지 마세용");
			return;
		}
		
		System.out.println(this.name + "(이)가 " + target.name + "(을)를 공격합니다.");
		this.hp += 5;
		target.hp -= 10;
		System.out.println(this.name + "의 체력: " + this.hp + ", " + target.name + "의 체력: " + target.hp);
	}
	
	// 출력 메세제: x가 y를 공격합니다.
	
	// 맞는 사람의 hp를 10 낮추고 나의 체력을 5 회복하고 싶다.
	// 결과를 출력하자. (나의 체력: XX, 상대의 체력: XX)
	
	void characterInfo() {
		System.out.println("*** 캐릭터의 정보 ***");
		System.out.println("# 아이디: " + name);
		System.out.println("# 레벨: " + level);
		System.out.println("# 공격력: " + atk);
		System.out.println("# 체력: " + hp);
		System.out.println("이 메서드를 호출한 객체의 이름: " + this.name);
	}
	
}
