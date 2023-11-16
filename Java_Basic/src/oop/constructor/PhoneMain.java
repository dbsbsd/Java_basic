package oop.constructor;

public class PhoneMain {

	public static void main(String[] args) {

//		Phone basic = new Phone();
//		basic.color = "회색";
//		basic.model = "폴더폰";
//		basic.price = 200000;
//		basic.showSpec();
		
		Phone basic = new Phone();
		basic.showSpec();
		
		Phone basic2 = new Phone();
		basic2.showSpec();
		
		System.out.println("--------------");
		
		Phone galaxy = new Phone("갤럭시 s23");
		galaxy.showSpec();
		
		System.out.println("--------------");
		
		Phone iPhone14 = new Phone("iPhone 14", "space gray");
		iPhone14.showSpec();

	}

}
