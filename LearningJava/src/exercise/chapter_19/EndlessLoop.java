package exercise.chapter_19;

public class EndlessLoop {
    public static void main(String[] args) {
        // 분 단위 계산
        final int WAKE_UP_TIME = 8 * 60;
        final int END_DAY = 24 * 60;

        int now = WAKE_UP_TIME;

        System.out.println("아 공부하기 싫다, 30분부터 해야지");
        while(now < END_DAY) {
            now++; // 1분 흐름

            if( now % 60 == 34){
                System.out.println("헐 34분이잖아?");
                System.out.println("그럼 그냥 정각되면 해야겠다.");
            }
            if( now % 60 == 8){
                System.out.println("아 미친 08분이네");
                System.out.println("아 공부하기 싫다, 30분부터 해야지");
            }
            int hour = now / 60;
            if ( hour == 10 ){
                System.out.println("10시네 이제 안해");
                break;
            }
        }
    }
}
