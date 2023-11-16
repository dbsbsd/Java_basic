package basic.loop;

import java.util.Scanner;

public class SwitchQuiz1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
        - 정수를 하나 입력받고, 연산자를 하나 입력 받으세요.
         다시 정수를 입력받아서, 사용자가 선택한 연산자를 기준으로
         연산 결과를 출력해 주시면 됩니다. (switch문 사용)
         연산자가 잘못 입력되었다면 연산자를 똑바로 입력하라고
         결과를 말씀해 주세요.
        */
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력하세요: ");
		int a = sc.nextInt();
		System.out.print("연산자를 입력하세요: ");
		String b = sc.next();
		System.out.print("정수를 입력하세요: ");
		int c = sc.nextInt();
		
		int result = 0;
		boolean flag = false;
		switch(b) {
		
//			case "+":
//				System.out.printf("%d %s %d = %d", a, b, c, a+c);
//				break;
//			case "-":
//				System.out.printf("%d %s %d = %d", a, b, c, a-c);
//				break;
//			case "*":
//				System.out.printf("%d %s %d = %d", a, b, c, a*c);
//				break;
//			case "/":
//				System.out.printf("%d %s %d = %d", a, b, c, a/c);
//				break;
//			default:
//				System.out.println("연산자를 똑바로 입력해주세요.");
				
			case "+":
				result = a + c;
				break;
			case "-":
				result = a - c;
				break;
			case "*":
				result = a * c;
				break;
			case "/":
				if(a==0 || c==0) {
					System.out.println("정수를 똑바로 입력해주세요.");
					flag = true;
					break;
				}
				result = a / c;
				break;
			default:
				System.out.println("연산자를 똑바로 입력해주세요.");
				flag = true;
			
		}

		if(!flag) {
			System.out.printf("%d %s %d = %d", a, b, c, result);
		}
		sc.close();
	}

}
