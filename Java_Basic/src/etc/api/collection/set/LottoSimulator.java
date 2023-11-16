package etc.api.collection.set;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class LottoSimulator {
   
   static Random r = new Random();
    
    static int prize1 = 0; //1등 당첨 횟수를 세 줄 변수
    static int prize2 = 0; //2등 당첨 횟수를 세 줄 변수
    static int prize3 = 0; //3등 당첨 횟수를 세 줄 변수
    static int prize4 = 0; //4등 당첨 횟수를 세 줄 변수
    static int prize5 = 0; //5등 당첨 횟수를 세 줄 변수
    static int failCnt = 0; // 꽝을 세 줄 변수
    
    
    public static Set<Integer> createLotto() {       
        /*
         - 1~45 범위의 난수 6개를 생성하셔서
          컬렉션 자료형에 모아서 리턴해 주세요.
          무엇을 쓰든 상관하지 않겠습니다.
          중복이 발생하면 안됩니다.
          로또번호 뽑아서 return 하는 
         */ 
       Set<Integer> lottoNum = new HashSet<>();
       while(lottoNum.size()<6) {
          lottoNum.add(r.nextInt(45)+1);
       }
        return lottoNum;
    }
    
    
    //보너스 번호를 생성하는 메서드, 당첨번호를 피해서 
    public static int createBonusNum(Set<Integer> winnerNum) {
       /*
         - 매개값으로 전달되는 당첨 번호 집합을 전달 받으신 후
          당첨번호들을 피해서 보너스번호 하나만 뽑아 주세요.
          범위는 마찬가지로 1 ~ 45 사이의 난수입니다.
        */
       int bonusNum;
       while(true) {
          bonusNum = r.nextInt(45)+1;
          if(!winnerNum.contains(bonusNum)) {
             return bonusNum;
          }
       }
    }
    //당첨 등수를 알려주는 메서드
    public static void checkLottoNumber(Set<Integer> winnerNum, Set<Integer> myNum, int bonusNum) {
        /*
         매개값으로 당첨번호집합, 구매한 로또 번호집합, 보너스번호를 받습니다.
         내 로또 번호와 당첨번호를 비교하여
         일치하는 횟수를 세 주신 후 등수를 판단하세요.
         판단된 등수에 해당하는 static 변수의 값을 올려 주시면 됩니다.
         6개 일치 -> 1등
         5개 일치 + 보너스번호 일치 -> 2등
         5개 일치 -> 3등
         4개 일치 -> 4등
         3개 일치 -> 5등
         나머지 -> 꽝
         */
        int matchCnt = 0;
        boolean bonus = false;

        for (Integer num : myNum) {
            if (winnerNum.contains(num)) {
               matchCnt++;
            } else if (num == bonusNum) {
                bonus = true;
            }
        }
       switch(matchCnt) {
       case 6 :
          prize1++;
          break;
       case 5:
          if(bonus) {
             prize2++;
          }else {
             prize3++;             
          }
          break;
       case 4:
          prize4++;
          break;
       case 3:
          prize5++;
          break;
       default:
          failCnt++;
          break;
       }
    }
    
   public static void main(String[] args) {
      //로또 번호 생성 메서드를 호출해서 당첨 번호를 하나 고정시키세요.
        //보너스번호도 하나 고정시키세요.
      Set<Integer> winnerNum = createLotto();
      int bonusNum = createBonusNum(winnerNum);
        long cost = 0;
        while(true) {
            /*
             - 1등이 당첨 될 때까지 반복문을 돌립니다.
             - 1등이 당첨 된다면, 1등이 되기까지 누적 당첨 횟수를 출력하고
              반복문을 종료합니다.
             - 로또를 구매하기 위한 금액도 출력하세요. (long)
             */
           Set<Integer> myNum = createLotto();
           checkLottoNumber(winnerNum,myNum,bonusNum);
           cost += 1000;
           if(prize1 > 0) {
              System.out.println("로또를 구매한 금액 : " + cost);
              System.out.printf("누적 당첨 횟수 : \n1등 : %d번\n2등 : %d번\n3등 : %d번\n4등 : %d번\n5등 : %d번\n꽝 : %d번", 
                    prize1, prize2 ,prize3, prize4, prize5, failCnt);
              break;
           }
        }
   }
}