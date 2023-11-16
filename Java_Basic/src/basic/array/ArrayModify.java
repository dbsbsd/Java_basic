package basic.array;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayModify {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] foods = {"삽겹살", "족발", "피자", "햄버거"};
		System.out.println(Arrays.toString(foods));
		
		foods[0] = "치킨";
		foods[2] = "고구마피자";
		System.out.println(Arrays.toString(foods));
		
		System.out.println("------------------");
		
		// 배열의 인덱스 탐색
		Scanner sc = new Scanner(System.in);
		System.out.print("탐색할 음식을 입력하세요: ");
		String name = sc.next();
		
		for(int i=0; i<foods.length; i++) {
			if(name.equals(foods[i])) {
				System.out.println(i+1 + "번입니다.");
				break;
			}else if(i == foods.length-1){
				System.out.printf("%s은(는) 없다 인마", name);
				break;
			}
		}
		
//		int i;
//		for(i=0; i<foods.length; i++) {
//			if(name.equals(foods[i])) {
//				System.out.println(i+1 + "번입니다.");
//				break;
//			}
//		}
//		if(i == foods.length) {
//			System.out.printf("%s은(는) 없다 인마", name);
//		}
		
//		boolean flag = false;
//		for(int i=0; i<foods.length; i++) {
//			if(name.equals(foods[i])) {
//				System.out.println(i+1 + "번입니다.");
//				flag = true;
//				break;
//			}
//		}
//		if(!flag) {
//			System.out.printf("%s은(는) 없다 인마", name);
//		}
		
	}

}
