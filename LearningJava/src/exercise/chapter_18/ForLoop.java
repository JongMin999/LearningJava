package exercise.chapter_18;

public class ForLoop {
    public static void main(String[] args) {
        int sum = 0;
        for(int num =1; num<=10; num++) {
            sum += num;
        }
        String result = String.format("1부터 10까지 더한 값은 %d입니다.",sum);
        System.out.println(result);
        // System.out.printf("1부터 10까지 더한 값은 %d입니다.",sum); 같은 내용
    }
}
