package exercise.chapter_17;

public class ParkingLotMission {
    public static void main(String[] args) {
        /*?
        시간 주차장 요금 결제
        사용금액 > 20만원 yes : 5시간 할인
        사용금액 > 10만원 yes : 4시간 할인
        사용금액 > 5만원 yes : 3시간 할인
        사용금액 > 3만원 yes : 2시간 할인
        사용금액 > 1만원 yes : 1시간 할인
        최종적으로 ? 시간 주차장 요금 결제
        */
        int useMoney = 200_000;
        int parkingTime = 6;

        if(useMoney >= 200_000){
            parkingTime = parkingTime-5;
        }
        else if(useMoney >= 100_000){
            parkingTime = parkingTime-4;
        }
        else if(useMoney >= 50_000){
            parkingTime = parkingTime-3;
        }
        else if(useMoney >= 30_000){
            parkingTime = parkingTime-2;
        }
        else if(useMoney >= 10_000){
            parkingTime = parkingTime-1;
        }

        String result = String.format("고객님은 %d원을 사용했기 때문에 %d시간 결제하시면 됩니다.",useMoney,parkingTime);
        System.out.println(result);
    }
}
