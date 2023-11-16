package etc.api.lang.date;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.util.Date;

public class DateExample {

	public static void main(String[] args) {
		
		Date date = new Date();
		System.out.println(date);
		
		System.out.println("----------------");
		
		// 현재 날짜 정보 얻기 (년, 월, 일)
		LocalDate now = LocalDate.now();
		System.out.println(now);
		
		// 현재 시간 정보 얻기 (시, 분, 초)
		LocalTime nowTime = LocalTime.now();
		System.out.println(nowTime);
		
		// 현재 날짜와 시간 정보 얻기 (년, 월, 일, 시, 분, 초)
		LocalDateTime localDateTime = LocalDateTime.now();
		System.out.println(localDateTime);
		
		// 특정 날짜와 시간 정보 얻기
		LocalDateTime beginDate = LocalDateTime.of(2022, 7, 1, 9, 0, 0);
		System.out.println(beginDate);
		
		// 년, 월, 일 따로 추출
		int year = localDateTime.getYear();
		System.out.println("year: " + year);
		
		// 정수 형태의 월 추출
		int month = localDateTime.getMonthValue();
		System.out.println("month: " + month);
		
		// 문자 형태의 월 추출 (Month 라는 열거형 타입 중 하나)
		Month mon = localDateTime.getMonth();
		System.out.println(mon);
		
		int day = localDateTime.getDayOfMonth();
		System.out.println("day: " + day);
		
	}
	
}
