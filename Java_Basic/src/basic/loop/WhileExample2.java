package basic.loop;

public class WhileExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 48~150 사이의 정수 중 8의 배수만 가로로 출력해 보세요.
		// 48부터 숫자를 하나씩 올려가면서 8의 배수 판별을 반복하면 되겠죵?
		
//		int a = 48;
//		
//		while(a <= 150) {
//			if(a%8 == 0) {
//				System.out.print(a + " ");
//			}
//			a++;
//		}
		
		// 1~100까지의 정수 중 4의 배수이면서
		// 8의 배수는 아닌 수를 가로로 출력해 보세요.
		
//		int i = 1;
//		
//		while(i <=100) {
//			if(i%4 == 0 && i%8 != 0) {
//				System.out.print(i + " ");
//			}
//			i++;
//		}
		
		// 1~30000까지의 정수 중 258의 배수의 개수를 출력.
		
//		int c = 1;
//		int count = 0;
//		
//		while(c <= 30000) {
//			if(c%258 == 0) {
//				count++;
//			}
//			c++;
//		}
//		System.out.println(count+"개");
		
		// 1000의 약수의 개수를 구하세요.
		int g = 1;
		int h = 0;
		while(g <= 1000) {
			if(1000%g == 0) {
				h++;
			}
			g++;
		}
		System.out.println(h + "개");		
	}

}
