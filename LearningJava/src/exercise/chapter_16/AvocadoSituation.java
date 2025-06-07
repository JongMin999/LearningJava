package exercise.chapter_16;

public class AvocadoSituation {
    public static void main(String[] args) {
        // 1. 마트에서 장을 봄
        // 2. 우유를 1개 삼
        // 아보카도가 있음
        // true : 아보카도 6개를 산다 / false :집으로 돌아온다.
        // 집으로 돌아온다


        int milks = 0;
        int avocados = 0;
        boolean existedAvocado = true;
        milks = 1;
        // if else구문 활용
        /*
        if (existedAvocado) {
            avocados = avocados + 6;
        } else{
            avocados = 0;
        }
        */
        // 3항 연산자
        avocados = (existedAvocado) ? 6 : 0;

        String comment = String.format("아내야, 장보고 돌아왔어 아보카도 %d개, 우유%d개 사왔어",avocados,milks);
        System.out.println(comment);
    }
}
