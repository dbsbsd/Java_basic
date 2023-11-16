package basic.array;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayDeleteQuizCopy {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String[] kakao = {"무지", "네오", "어피치", "라이언", "춘식이"};
		System.out.println("현재 저장된 친구들: " + Arrays.toString(kakao));
		
		while(true) {
		
			if(kakao.length == 0) {
				System.out.println("더이상 삭제할 친구가 없어요.");
				System.err.println("프로그램을 종료합니다.");
				break;
			}
			
			System.out.print("삭제를 원하는 친구를 입력하세요: ");
			String name = sc.next();
			
			/*
			1. 삭제할 친구를 입력받아서 삭제를 진행해 주세요.
			
			2. 입력받은 이름이 없다면 없다고 얘기해 주세요.
	
			- 추가
			배열의 길이가 0이 될 때까지 삭제를 반복해 보세요.
			더 이상 지울 친구가 없다면 프로그램 종료.
			*/
			
			boolean flag = false;
			for(int i=0; i<kakao.length; i++) {
				if(name.equals(kakao[i])) {
					flag = true;
					for(int j=i; j<kakao.length-1; j++) {
						kakao[j] = kakao[j+1];
					}
					break;
				}
			}
			
			if(!flag) {
				System.out.println(name + ", 없는 이름입니다.");
				System.out.println("현재 저장된 친구들: " + Arrays.toString(kakao));
			}else {
				String[] temp = new String[kakao.length-1];
				for(int a=0; a<temp.length; a++) {
					temp[a] = kakao[a];
				}
				kakao = temp; temp = null;
				System.out.println("삭제 후 정보: " + Arrays.toString(kakao));
			}
		}
		
		sc.close();
	}

}
