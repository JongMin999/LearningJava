package exercise.chapter_19;

public class Gugudan {
    public static void main(String[] args) {
        // 2단부터 9단
        int dan;
        int hang;
        int result;
        for(dan = 2; dan < 10; dan++) {
            for(hang = 2; hang < 10; hang++) {
                result = dan * hang;
                System.out.printf("%d * %d = %d\n", dan, hang, result);
            }
        }
    }
}
