package exercise.chapter_17;

public class Taxi {
    public static void main(String[] args) {
        /*
        심야 할증 시간 yes : 20% 금액 추가
        시외 할증 yes : 20% 금액 추가
        최종금액 계산
         */
        int goHomeTime = 3;
        String myHome = "용인";
        int taxiPrice = 20_000;

        if( 0 < goHomeTime && goHomeTime <4){
            taxiPrice = (int) (taxiPrice + (int)taxiPrice * 0.2);
        }

        if(myHome != "서울"){
            taxiPrice = (int) (taxiPrice + (int)taxiPrice * 0.2);
        }
        String result = String.format("고객님이 내셔야할 돈은 %d 입니다.", taxiPrice);
        System.out.println(result);
    }
}
