package etc.generic.basic02;

public class MainClass {

	public static void main(String[] args) {

		Box<Integer, String> b = new Box<Integer, String>(1, "후쿠시마 마이");
		System.out.println(b.toString());
		String name = b.get(1);
		b.put(9, "정세은");
		System.out.println(name);
		System.out.println(b.toString());
		b.put(10, "킴미소");
		System.out.println(b.toString());

	}

}
