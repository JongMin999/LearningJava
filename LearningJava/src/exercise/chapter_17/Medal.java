package exercise.chapter_17;

public class Medal {
    public static void main(String[] args) {
        /*
        각 등수 사람에게 메달 수여
        1등: 금메달, 2등 : 은메달, 3등 : 동메달, else: 메달없음
         */
        int myRank = 4;
        String medal;

        switch(myRank){
            case 1 :
                medal = "금메달";
                break;
            case 2 :
                medal = "은메달";
                break;
            case 3 :
                medal = "동메달";
                break;
            default :
                medal = "없음";
        }
        String result = String.format("선수님의 메달은 %s입니다.", medal);
        System.out.println(result);
    }
}
