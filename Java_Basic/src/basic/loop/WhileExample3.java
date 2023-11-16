package basic.loop;

import java.util.Scanner;

public class WhileExample3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 - 정수 1개를 입력받아서 해당 정수가 소수(prime number)
		  인지를 판별하시면 됩니다. 
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력하세요: ");
		int num = sc.nextInt();
		
		int a = 1;
		int b = 0;
		
		while(a <= num) {
			if(num%a == 0) {
				b++;				
			}
			a++;
		}
		if(b == 2) {	
			System.out.println(num + "은(는) 소수입니다.");
		}else {
			System.out.println(num + "은(는) 소수가 아닙니다.");
		}
		
		System.out.println("---------------");
		
		int j = 2;
		while(num%j != 0) {
			j++;
		}
		System.out.printf("%d은(는) %s\n", num, (num == j ? "소수입니다." : "소수가 아닙니다."));
		
		
		sc.close();
	}

}
