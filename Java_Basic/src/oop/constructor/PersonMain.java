package oop.constructor;

import java.util.Scanner;

public class PersonMain {
	
	String name;
	int age;
	int height;
	
	PersonMain(String pName, int pAge, int pHeight){
		name = pName;
		age = pAge;
		height = pHeight;			
	}
	
	PersonMain(){} // 가본 생성자는 만들어 놓는 것이 좋음! (밑에 kim씨와 연관)

	void info() {
		System.out.println("-----------");
		System.out.println("이름: " + name);
		System.out.println("나이: " + age + "세");
		System.out.println("키: " + height + "cm");
	}
	
	public static void main(String[] args) {
		
		/*
        Scanner를 이용해서 사용자에게
        이름, 나이, 키를 입력받아서 
        해당 정보를 저장하는 객체를 디자인 해 보세요.
        객체 내에는 해당 사람의 정보를 모두 출력 해 주는
        info() 메서드가 존재합니다.
        */
		
		Scanner sc = new Scanner(System.in);
		
//		PersonMain kim = new PersonMain();
		
		outer: while(true) {
			System.out.print("이름 : ");
			String pName = sc.next();
			if(pName.equals("그만")) {
				System.out.println("작업을 중단합니다.");
				break outer;
			}
			System.out.print("나이: ");
			int pAge = sc.nextInt();
			System.out.print("키: ");
			int pHeight = sc.nextInt();
			
			PersonMain armi = new PersonMain(pName, pAge, pHeight);
			armi.info();
			System.out.println("-----------");
			
		}
		sc.close();
		
	}
	
	
}
