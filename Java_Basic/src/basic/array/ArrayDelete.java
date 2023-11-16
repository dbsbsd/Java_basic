package basic.array;

import java.util.Arrays;
import java.util.List;

public class ArrayDelete {

	public static void main(String[] args) {
		
		int[] arr = {1, 3, 5, 7, 9, 11, 13};
		
//		arr[3] = arr[4];
//		arr[4] = arr[5];
//		arr[5] = arr[6];
		
		for(int i=3; i<arr.length-1; i++) {
			arr[i] = arr[i+1];
		}
		System.out.println(Arrays.toString(arr));
		
		// 기존의 배열보다 크기가 하나 작은 새 배열을 생성.
		int[] temp = new int[arr.length-1];

		// 원본 배열의 값을 새 배열에 인덱스를 맞춰서 그대로 대입
		for(int a=0; a<temp.length; a++) {
			temp[a] = arr[a];
		}
		arr = temp;  // temp 배열의 주소값을 arr에게 넘긴다.
		temp = null; // 주소값을 지워서 메모리에서 temp는 자동 소멸되게 합니다.
		System.out.println(Arrays.toString(arr));
		
		List<Integer> list = Arrays.asList(1,3, 5, 7, 9, 11, 13);
		System.out.println("리스트: " + list);
		
		list.remove(3);
		System.out.println("삭제 결과: " + list);
		
	}
}
