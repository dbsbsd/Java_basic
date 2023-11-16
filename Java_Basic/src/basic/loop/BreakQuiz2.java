package basic.loop;

import java.util.Scanner;

public class BreakQuiz2 {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("정지를 원하시면 0을 입력해주세요");
      System.out.println("8번 틀리면 정지합니다.\n");

      int correct = 0;
      int wrong = 0;

      char[] operators = { '+', '-', 'X', '/' }; // 연산자를 저장할 배열 생성

      while (true) {
         int num1 = (int) (Math.random() * 100);
         int num2 = (int) (Math.random() * 100);
         char operator = operators[(int) (Math.random() * operators.length)]; 
         // 연산자 저장한 배열안에서 배열의 갯수까지 중에서 랜덤으로 하나를 뽑고, 그걸 char operator 에 저장

         System.out.printf("%d %c %d = ???\n", num1, operator, num2);
         System.out.print("> ");
         int answer = sc.nextInt();

         int result = 0;
         switch (operator) {
         case '+':
            result = num1 + num2;
            break;
         case '-':
            result = num1 - num2;
            break;
         case '*':
            result = num1 * num2;
            break;
         case '/':
            result = num1 / num2;
            break;
         default:
            result = 0;
            break;
         }

         if (answer == result) {
            System.out.println("정답입니다!");
            System.out.println("정답 : "+result);
            correct++;
         } else if (answer == 0) {
            System.out.printf("종료합니다\n정답 횟수 : %d회\n오답 횟수 : %d회\n", correct, wrong);
            break;
         } else {
            System.out.println("틀렸습니다.");
            System.out.println("정답 : "+result);
            wrong++;
            if (wrong == 8) {
               System.out.printf("\n8번 틀려 정지 되었습니다.\n정답 횟수 : %d회\n오답 횟수 : %d회\n", correct, wrong);
               break;
            }
         }
      }
      sc.close();
   }
}