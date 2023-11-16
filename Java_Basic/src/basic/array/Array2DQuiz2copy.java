package basic.array;

public class Array2DQuiz2copy {

	public static void main(String[] args) {

		int[][] score = {
                {79, 80, 99}, //A학생
                {95, 85, 89}, //B학생
                {90, 65, 56}, //C학생
                {69, 78, 77}  //D학생
                //과목: 3과목
        };
        String[] stuName = {"A학생", "B학생", "C학생", "D학생"};
        String[] subName = {"국어", "영어", "수학"};
		
        /*
        1. 각 학생의 평균을 소수점 첫째 자리까지 출력해 보세요.
        2. 각 과목의 평균을 출력해 보세요.
        3. 반 평균을 출력해 보세요. (모든 학생들의 평균을 더해서 학생수로 나누기)
        */
        
       // 1.
       int stu = 0;
       for(int[] s : score) {
    	   int total = 0;
    	   for(int s2 : s) {
    		   total += s2;
    	   }
    	   double avg = (double)total / subName.length;
    	   System.out.printf("%s의 평균: %.1f점\n", stuName[stu], avg);
    	   stu++;
       }
        
       System.out.println("-------------------");
       
       // 2.
       for(int i=0; i<subName.length; i++) {
    	   int total = 0;
    	   for(int j=0; j<stuName.length; j++) {
    		   total += score[j][i];
    	   }
    	   double avg = (double)total / stuName.length;
    	   System.out.printf("%s의 평균: %.1f점\n", subName[i], avg);
       }
       
       System.out.println("-------------------");
       
       // 3.
       
       int totalAvg = 0;
       for(int[] s : score) {
    	   int total = 0;
    	   for(int s2 : s) {
    		   total += s2;
    	   }
    	   double avg = (double)total / subName.length;
    	   totalAvg += avg;
       }
       System.out.printf("반 평균: %.1f점\n", (double)totalAvg / stuName.length);
       
       
	}

}
