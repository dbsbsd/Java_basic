package basic.loop;

import java.util.Scanner;

public class BreakQuiz1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
        1. 2가지의 정수를 1~100사이의 난수를 발생시켜서 
         지속적으로 문제를 출제한 후 정답을 입력받으세요.
         사용자가 0을 입력하면 반복문을 탈출시키세요.
         
        2. 종료 이후에 정답 횟수와 오답 횟수를 각각 출력하세요.
       */
		
		Scanner sc = new Scanner(System.in);
		
		int q = 0;
		int w = 0;
		
		while(true) {
				
			int a = (int) (Math.random()*10 + 1);
			int b = (int) (Math.random()*10 + 1);
			int x = (int) (Math.random()*2);
			
			int y;
			if(x == 0) {
				System.out.printf("%d + %d = ???\n", a, b);
				y = a + b;
			}else {
				System.out.printf("%d - %d = ???\n", a, b);
				y = a - b;
			}

			System.out.print("> ");
			int answer = sc.nextInt();
			
			if(answer == y) {
				System.out.println("정답");
				q++;
			}else if(answer == 0) {
				System.out.println("끝~!");
				break;
			}else {
				System.out.println("오답");
				w++;
			}
			
		}
		System.out.println("---------------------");
		System.out.println("정답 횟수: " + q + "회");
		System.out.println("오답 횟수: " + w + "회");
		
		sc.close();
	}

}
