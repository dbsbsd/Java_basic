package etc.api.lang.wrapper;

import java.util.Scanner;

public class ParseQuiz {

	public static void main(String[] args) {
		
//		주민등록번호를 입력받아서 다음과 같은 정보를 추출하여 출력합니다.
//
//		ex) 입력값: 9201013-1234567
//		출력값: 1992년 10월 13일 31세 남자 
//
//		입력값: 040906-4123456
//		출력값: 2004년 9월 6일 19세 여자 
//
//		입력값은 하이픈이 포함된 문자열이어야 합니다. 
//		하이픈이 포함되어 있지 않거나, 주민등록번호 뒷자리 첫번째 숫자가 1,2,3,4가 아닐 시에는 다시 입력받아야 합니다.
//		또한 하이픈을 제외한 값이 숫자가 아닐 시에도 다시 입력받아 주시면 됩니다.
		
		Scanner sc = new Scanner(System.in);
		
		
		while(true) {
		
			System.out.print("주민등록번호 13자리를 입력해주세요: ");
			String residentNumber = sc.nextLine();
			
			if(residentNumber.equals("그만")) {
				break;
			}else if(residentNumber.length() == 13 && !residentNumber.contains("-")) {
				System.out.println("'-' 포함해서 입력해주세요");
				continue;
			}else if(residentNumber.length() != 14) {
				continue;
			}
			
			String rN = residentNumber.replace("-", "");
			
			try {
				long num = Long.parseLong(rN);
			} catch (NumberFormatException e){
				System.err.println("중간에 오타가 있습니다. 다시 확인해주세요.");
				continue;
			}
			
			int rN2 = Integer.parseInt(rN.substring(6, 7));
            if (rN2 < 1 || rN2 > 4) {
                System.out.println("주민등록번호 뒷자리 첫번째 숫자가 1, 2, 3, 4 중 하나여야 합니다.");
                continue;
            }
            int year = Integer.parseInt(rN.substring(0, 2));
            if(rN2 == 3 || rN2 == 4) year += 100;
            int month = Integer.parseInt(rN.substring(2, 4));
            int day = Integer.parseInt(rN.substring(4, 6));
            	
            int currentYear = java.time.Year.now().getValue();
            int age = currentYear - (1900 + year) + 1;

            String gender = (rN2 % 2 == 1) ? "남자" : "여자";
            
            System.out.println((1900 + year) + "년 " + month + "월 " + day + "일 " + age + "세 " + gender);
            
            System.out.println("----------------------");
		}
		
		sc.close();
		
		
		
		
		
	}
	
}
