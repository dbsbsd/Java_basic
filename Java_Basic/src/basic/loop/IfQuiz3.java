package basic.loop;

import java.util.Scanner;

public class IfQuiz3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
        - 정수 a개를 입력 받습니다.
        - 가장 큰 값, 가장 작은 값, 중간값을 구해서 출력해 보세요.
        
        # max, mid, min이라는 변수를 미리 선언하셔서
         판별이 될 때마다 각각의 변수에 값을 넣어줍니다.
         마지막에 한번에 출력하시면 되겠습니다.
        */
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력하세요: ");
		int a = sc.nextInt();
		System.out.print("정수를 입력하세요: ");
		int b = sc.nextInt();
		System.out.print("정수를 입력하세요: ");
		int c = sc.nextInt();
		
//		if(a > b) {
//			if(a > c) {
//				if(b > c) {
//					System.out.printf("%d, %d, %d", a, c, b);
//				}else {
//					System.out.printf("%d, %d, %d", a, b, c);
//				}
//			}else {
//				System.out.printf("%d, %d, %d", c, b, a);
//			}
//		}else if(b > c) {
//			if(b > a) {
//				if(c > a) {
//					System.out.printf("%d, %d, %d", b, a, c);
//				}else {
//					System.out.printf("%d, %d, %d", b, c, a);
//				}
//			}else {
//				System.out.printf("%d, %d, %d", a, c, b);
//			}
//		}else {
//			if(c > b) {
//				if(a > b) {
//					System.out.printf("%d, %d, %d", c, b, a);
//				}else {
//					System.out.printf("%d, %d, %d", c, a, b);
//				}
//			}else {
//				System.out.printf("%d, %d, %d", b, a, c);
//			}
//		}
		
		int max, mid, min;
		
		if(a>b && a>c) { // a: max
			max = a;
			if(b>c) {
				mid = b; min = c;
			}else {
				mid = c; min = b;
			}
		}else if(b>a && b>c) {
			max = b;
			if(a>c) {
				mid = a; min = c;
			}else {
				mid = c; min = a;
			}
		}else {
			max = c;
			if(a>b) {
				mid = a; min = b;
			}else {
				mid = b; min = a;
			}
		}
		
		System.out.println("최대값: " + max);
		System.out.println("중간값: " + mid);
		System.out.println("최소값: " + min);
		
		sc.close();
	}

}
