package etc.api.io.stream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class FileQuiz {

	public static void main(String[] args) {
		
		/*
        1. 스캐너를 통해서 파일명을 정확히 입력받습니다.
        
        2. file폴더에 해당 파일이 존재한다면 해당 파일을 
        upload폴더로 복사하세요.
        파일이 존재하지 않는다면 "파일명이 없습니다." 예외구문을 출력하세요.
        
        3. 복사 도중에 에러가 발생하면 "파일 처리 중 예외 발생!" 구문을 출력.
        */
		
		Scanner sc = new Scanner(System.in);
		
		FileInputStream oldFile = null;
		FileOutputStream newFile = null;
		
		System.out.print("파일명: ");
		String name = sc.next();
		
		try {
			
			File file = new File("C:/MyWork/myTest/upload");
	         if(!file.exists()) {
	            file.mkdir();
	         }

			oldFile = new FileInputStream("C:/MyWork/" + name);
			newFile = new FileOutputStream("C:/MyWork/myTest/upload/" + name);
			
			int result;
			byte[] arr = new byte[100];
			
			try {
				while((result = oldFile.read(arr)) != -1) {
					newFile.write(arr, 0, result);
				}
				System.out.println("파일 복사 완료.");
			} catch (IOException e) {
				System.out.println("파일 처리 중에 문제가 발생했습니다.");
			}
			
		} catch (FileNotFoundException e) {
			System.out.println("파일이나 경로를 찾을 수 없습니다.");
		} finally {
			try {
				oldFile.close();
				newFile.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		sc.close();
		
		
		
		
		
//		System.out.print("파일명: ");
//		String fileName = sc.next();
//		
//		FileInputStream oldFile = null;
//		FileOutputStream newFile = null;
//		File file = new File("C:/MyWork/myTest/" + fileName + ".txt");
//		File fileCopy = new File("C:/MyWork/myTest/upload");
//		
//		if(!file.exists()) {
//			
//			fileCopy.mkdir();
//		
//			try {
//				oldFile = new FileInputStream("C:/MyWork/myTest/" + fileName + ".txt");
//				newFile = new FileOutputStream("C:/MyWork/myTest/upload/" + fileName + ".txt");
//				
//				byte[] arr = new byte[100];
//				
//				while(true) {
//					int result = oldFile.read(arr);
//					if(result == -1) break;
//					
//					newFile.write(arr, 0, result);
//				}
//			
//			} catch (Exception e) {
//				System.out.println("파일 처리 중 예외 발생!");
//				e.printStackTrace();
//			} finally {
//				try {
//					oldFile.close();
//					newFile.close();
//				} catch (IOException e) {
//					e.printStackTrace();
//				}
//			}
//		}else {
//			System.out.println("파일명이 없습니다.");
//		}
//		sc.close();
	}
	
}
