package oop.encap.good;

public class MainClass {

	public static void main(String[] args) {

		MyBirth my = new MyBirth();
//		my.year = 1998; (x)
//		my.month = 11;	(x)
//		my.day = 2;		(x)
		
		my.setYear(1998);
		my.setMonth(11);
		my.setDay(2);
		
		System.out.printf("내 생일은 %d년 %d월 %d일 입니다.\n", my.getYear(), my.getMonth(), my.getDay());
		
//		my.birthInfo();

	}

}
