package etc.api.io.buffered;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.LocalDate;
import java.util.Scanner;

public class BufferedQuiz {

	public static void main(String[] args) {

		/*
		 1. LocalDate클래스를 이용해서 file폴더 내에 하위 경로로
          오늘 날짜 20230908file 이라는 이름으로 폴더를 생성하세요.
         2. 스캐너로 파일명을 입력받고 파일명.txt로 파일을 쓸 겁니다.
         3. '그만' 이라고 입력할 때까지 엔터를 포함해서 실시간으로
          파일을 작성합니다. 
          (변수를 하나 선언해서 사용자의 입력값을 계속 누적시켜서 
           연결해 주시면 됩니다.)
                각 문장은 줄 개행을 포함합니다.
         4. '그만'으로 파일이 작성되었다면, 아무 방법으로나 
          파일을 읽어서 콘솔에 출력해 보세요.
        */
		
		FileInputStream fis = null;
		BufferedInputStream bis = null;
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;

//		LocalDate Day = LocalDate.now();
//		int year = LocalDate.now().getYear();
//		int month = LocalDate.now().getMonthValue();
//		int day = LocalDate.now().getDayOfMonth();
		String date = LocalDate.now().toString().replace("-", "");
		
//		File file = new File("C:/MyWork/" + year + month + day + "file");
		File file = new File("C:/MyWork/" + date + "file");
		
		if(!file.exists()) {
			file.mkdir();
			System.out.println("폴더 생성 완료");
		}else {
			System.out.println("해당 폴더가 존재합니다");
		}
		
		Scanner sc = new Scanner(System.in);
		
		StringBuilder text = new StringBuilder();
		
		System.out.println("파일명을 입력해주세요");
		System.out.print("< ");
		String name = sc.next();
		sc.nextLine();
		
		try {
			fos = new FileOutputStream("C:/MyWork/" + date + "file/" + name + ".txt");
			bos = new BufferedOutputStream(fos);
			
			while(true) {
			
				System.out.println("내용을 입력하세요");
				System.out.print("< ");
				String contents = sc.nextLine();
				
				if(contents.equals("그만")) {
					break;
				}else {
					byte[] arr = (contents+"\r\n").getBytes();
					bos.write(arr);
				}
				
			}
			
			System.out.println("파일이 정상적으로 저장되었습니다");
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				bos.close();
				fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		try {
			fis = new FileInputStream("C:/MyWork/" + date + "file/" + name + ".txt");
			bis = new BufferedInputStream(fis);
			
			int b;
			while((b = bis.read()) != -1) {
				System.out.print((char)b);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				bis.close();
				fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}	
				
		sc.close();
		
	}
	
}
