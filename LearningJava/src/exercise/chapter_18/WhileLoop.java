package exercise.chapter_18;

public class WhileLoop {
    public static void main(String[] args) {
        // 1 ~ 10 다 더하는 loop
        int sum = 0;
        int num = 0;

        while(num < 10){
            num = num + 1;
            sum = sum + num;
        }
        String result = String.format("다 더한 값은 %d입니다.",sum);
        System.out.println(result);
    }
}
