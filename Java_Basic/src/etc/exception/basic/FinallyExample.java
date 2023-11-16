package etc.exception.basic;

public class FinallyExample {

	public static void main(String[] args) {
		
		String[] pets = {"강아지", "고양이", "찍찍이"};
		
		for(int i=0; i<=pets.length; i++) {
			try {
				System.out.println(pets[i] + "는 어떻게 우니~?");				
			}catch(Exception e){
				System.out.println("누구세용???");
			}finally {
				// finally 블록에는 예외 발생 여부와 상관 없이
				// 항상 실행하고 싶은 문장을 작성합니다.
				// 객체를 반납하거나 메모리에서 해제할 때 (close()) finally를 주로 사용합니다.
				System.out.println("기필코");
				System.out.println("!!!!!");
			}
		}
		
	}
	
}
