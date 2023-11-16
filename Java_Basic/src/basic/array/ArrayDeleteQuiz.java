package basic.array;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayDeleteQuiz {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String[] kakao = {"무지", "네오", "어피치", "라이언", "춘식이"};
		System.out.println("현재 저장된 친구들: " + Arrays.toString(kakao));
		System.out.print("삭제를 원하는 친구를 입력하세요: ");
		String name = sc.next();
		
		/*
		1. 삭제할 친구를 입력받아서 삭제를 진행해 주세요.
		
		2. 입력받은 이름이 없다면 없다고 얘기해 주세요.

		- 추가
		배열의 길이가 0이 될 때까지 삭제를 반복해 보세요.
		더 이상 지울 친구가 없다면 프로그램 종료.
		*/
		
//		outer: for(int n=0; n<kakao.length; n++) {
//			
//			System.out.println("현재 저장된 친구들: " + Arrays.toString(kakao));
//			System.out.print("삭제를 원하는 친구를 입력하세요: ");
//			String name = sc.next();
//			
//			if(name.equals(kakao[n])) {
//				for(int i=n; i<kakao.length-1; i++) {
//				kakao[i] = kakao[i+1];
//				}
//			
//				String[] temp = new String[kakao.length-1];
//				for(int t=0; t<temp.length; t++) {
//					temp[t] = kakao[t];
//				}
//				kakao = temp;
//				temp = null;
//				n--;
//				continue;
//			}
//			
//		}
		
		boolean flag = false;
		for(int i=0; i<kakao.length; i++) {
			if(name.equals(kakao[i])) {
				flag = true;
				for(int j=i; j<kakao.length; j++) {
					kakao[j] = kakao[j+1];
				}
				break;
			}
		}
		
		if(!flag) {
			System.out.println(name + "(은)는 없는 이름입니다.");
		}else {
			String[] temp = new String[kakao.length-1];
			for(int k=0; k<temp.length; k++) {
				temp[k] = kakao[k];
			}
			kakao = temp;
			temp = null;
			
			System.out.println("삭제 후 정보: " + Arrays.toString(kakao));
		}
		
		sc.close();
	}

}
