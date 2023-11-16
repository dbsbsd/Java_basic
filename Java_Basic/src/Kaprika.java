
public class Kaprika {
	
	public static void main(String[] args) {
		
		System.out.println("하윤수, 202311317, 소프트웨어공학과\n");
		
        for (int num = 1000; num <= 9999; num++) {
            if (KaprikaNumber(num)) {
                System.out.println(num);
            }
        }
    }

    public static boolean KaprikaNumber(int n) {
    	
    	int left = Integer.parseInt(String.valueOf(n).substring(0, 2));
    	int right = Integer.parseInt(String.valueOf(n).substring(2));
    	int kNum = left + right;
    	
    	return kNum * kNum == n;
    }
}
