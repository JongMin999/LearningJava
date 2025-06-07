package exercise.chapter_17;

public class StarbucksCoupon {
    public static void main(String[] args) {
        boolean clearCondition1 = true;
        boolean clearCondition2 = true;
        boolean clearCondition3 = true;
        boolean clearCondition4 = true;

        /*
        if(clearCondition1 && clearCondition2 && clearCondition3 && clearCondition4){
            System.out.println("이벤트 신청되셨습니다.");
        }else {
            System.out.println("아니오, 내돈내산 하겠습니다.");
        }
        */

        if (clearCondition1) {
            if (clearCondition2) {
                if (clearCondition3) {
                    if (clearCondition4) {
                        System.out.println("이벤트 신쳥되셨습니다.");
                    }else {
                        System.out.println("아니오, 내돈내산 하겠습니다.");
                    }
                }else {
                    System.out.println("아니오, 내돈내산 하겠습니다.");
                }
            }else {
                System.out.println("아니오, 내돈내산 하겠습니다.");
            }
        } else {
            System.out.println("아니오, 내돈내산 하겠습니다.");
        }
    }
}